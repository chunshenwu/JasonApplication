package com.gmboy.android.toollibrary;

import android.content.Context;
import android.content.pm.PackageManager;

public class PackageUtil {

    private static final String PKG_LINE = "jp.naver.line.android";
    private static final String PKG_FB = "com.facebook.katana";

    private static String TAG = "PackageUtil";

    public static boolean isLineInstalled(final Context context) {
        return isPackageInstalled(context, PKG_LINE);
    }

    public static boolean isFBInstalled(final Context context) {
        return isPackageInstalled(context, PKG_FB);
    }

    public static boolean isPackageInstalled(final Context context, final String pkgName) {
        try {
            context.getPackageManager().getPackageInfo(pkgName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
//            Develop.e(TAG, e.getMessage());
        } catch (Exception e) {
//            Develop.e(TAG, e.getMessage());
        }
        return false;
    }
}
