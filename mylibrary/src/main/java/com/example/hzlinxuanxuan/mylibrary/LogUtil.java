package com.example.hzlinxuanxuan.mylibrary;

import android.util.Log;

public class LogUtil {
    private static String defaultTag = "mylibrary";

    public static void e(String tag, String msg) {
        Log.e(tag, msg);
    }

    public static void i(String tag, String msg) {
        Log.i(tag, msg);
    }

    public static void d(Object obj, String msg) {
        d(obj.getClass().getCanonicalName(), msg);
    }

    public static void d(String tag, String msg) {
        Log.d(tag, msg);
    }

    public static void d(String tag, String msg, Throwable t) {
        Log.d(tag, msg, t);
    }

    public static void e(String msg) {
        e(defaultTag, msg);
    }

    public static void d(String msg) {
        d(defaultTag, msg);
    }

    public static void i(String msg) {
        i(defaultTag, msg);
    }

}
