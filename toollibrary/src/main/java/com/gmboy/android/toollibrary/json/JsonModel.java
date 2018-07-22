package com.gmboy.android.toollibrary.json;

import org.json.JSONObject;

public class JsonModel {

    private final String mKey;
    private final String mVal;
    private final boolean mHasSubJSONObject;
    private final JSONObject mSubJSONObject;

    private JsonModel(String key, String val, boolean hasSubJSONObject, JSONObject subJSONObject) {
        mKey = key;
        mVal = val;
        mHasSubJSONObject = hasSubJSONObject;
        mSubJSONObject = subJSONObject;
    }

    JsonModel(String key, String val) {
        this(key, val, false, new JSONObject());
    }

    JsonModel(String key, JSONObject subJSONObject) {
        this(key, "", true, subJSONObject);
    }

    public String getKey() {
        return mKey;
    }

    public String getVal() {
        return mVal;
    }

    public boolean hasSubJSONObject() {
        return mHasSubJSONObject;
    }

    public JSONObject getSubJSONObject() {
        return  mSubJSONObject;
    }

}
