package com.gmboy.android.toollibrary;

import android.content.Context;
import android.content.pm.PackageManager;

public class PackageUtilA {

    private static String TAG = "PackageUtilA";

    public static boolean isLineInstalled(final Context context) {
        return isPackageInstalled(context, Constants.ABOUT_LINE_PKG);
    }

    public static boolean isFBInstalled(final Context context) {
        return isPackageInstalled(context, Constants.ABOUT_FB_PKG);
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
