package com.gmboy.android.toollibrary.json;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

class JsonParser {

    private static String TAG = "JsonParser";
    private final Logger mLogger;

    private ArrayList<JsonModel> mModelsList = new ArrayList();

    private JsonParser() {
        mLogger = Logger.getLogger(TAG);
    }

    JsonParser(InputStream is) {
        this();
        JSONObject jSONObject = createFromFile(is);
        startParser(jSONObject);
    }

    public JsonParser(File jsonFile) {
        this();
        JSONObject jSONObject = createFromFile(jsonFile);
        startParser(jSONObject);
    }

    public JsonParser(String jsonStr) {
        this();
        JSONObject jsonObject = createFromStr(jsonStr);
        startParser(jsonObject);
    }

    public JsonParser(JSONObject jSONObject) {
        this();
        startParser(jSONObject);
    }

    private JSONObject createFromFile(File file) {
        try {
            return createFromFile(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            mLogger.severe("createFromFile(): Exception! Use empty str.");
        }

        return createFromStr("");
    }

    private JSONObject createFromFile(InputStream in) {
        if (in == null) {
            return createFromStr("");
        }

        StringBuilder stringBuilder = new StringBuilder();

        InputStreamReader inputStreamReader = null;
        inputStreamReader = new InputStreamReader(in);

        try {
            if (inputStreamReader.ready()) {
                BufferedReader bf = new BufferedReader(inputStreamReader);
                String line;
                while ((line = bf.readLine()) != null) {
                    stringBuilder.append(line);
                }
                bf.close();
                inputStreamReader.close();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return createFromStr(stringBuilder.toString());

    }

    private JSONObject createFromStr(String str) {
        JSONObject jsonObject = new JSONObject();

        try {
            jsonObject = new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return jsonObject;
    }

    private void startParser(JSONObject jSONObject) {
        JsonModel model;
        String key;
        String value;

        for (Iterator<String> it = jSONObject.keys(); it.hasNext(); ) {
            key = it.next();
            value = null;

            try {
                value = jSONObject.getString(key);
                JSONObject subJSONObject  = jSONObject.getJSONObject(key);
                model = new JsonModel(key, subJSONObject);
            } catch (JSONException e) {
                model = new JsonModel(key, value);
            }

            mModelsList.add(model);
        }
        mModelsList.size();
    }

    public ArrayList<JsonModel> getJsonModelList() {
        return mModelsList;
    }
}
