package com.gmboy.android.toollibrary.decorator;

import android.content.Context;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerDecorator {

    private final Context mContext;
    private final boolean mIsNeedStore;
    private final Logger mLogger;

    private LoggerDecorator(Context context, String name, boolean isNeedStore) {
        mContext = context;
        mLogger = Logger.getLogger(name);
        mIsNeedStore = isNeedStore;

        initLogLevel();
        if (mIsNeedStore) {
            initOutputFile();
        }
    }

    private LoggerDecorator(Context context, String name) {
        this(context, name, true);
    }

    private void initLogLevel() {
//        if (Constant.IN_DEVELOP) {
//            mLogger.setLevel(Level.ALL);
//        } else {
            mLogger.setLevel(Level.INFO);
//        }
    }

    private void initOutputFile() {
        Handler handler = null;
        String path = "";
        try {
            path = getName();
            handler = new FileHandler(path, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        mLogger.info("initOutputFile(): path is " + path);
        mLogger.addHandler(handler);
    }

    private String getName() {
//        Context context = InstrumentationRegistry.getTargetContext();
//        /data/user/0/com.mi.globalAutoTestTool.tableCheck/cache/TableChecker


//        Context context = InstrumentationRegistry.getContext();
//        /data/user/0/com.mi.globalAutoTestTool.tableCheck.test/cache/TableChecker

        File logFile = new File(mContext.getCacheDir(), mLogger.getName() + ".log");
        return logFile.getPath();
    }

    public static LoggerDecorator getLogger(Context context, String name) {
        return new LoggerDecorator(context, name);
    }

//    public static LoggerDecorator getLogger(String name) {
//        return new LoggerDecorator(name);
//    }

    public void severe(String msg) {
        mLogger.severe(msg);
    }

    public void warning(String msg) {
        mLogger.warning(msg);
    }

    public void info(String msg) {
        mLogger.info(msg);
    }

    public void config(String msg) {
        mLogger.config(msg);
    }

    public void fine(String msg) {
        mLogger.fine(msg);
    }

    public void finer(String msg) {
        mLogger.finer(msg);
    }

    public void finest(String msg) {
        mLogger.finest(msg);
    }

}
