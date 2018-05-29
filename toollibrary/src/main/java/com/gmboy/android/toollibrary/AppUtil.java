package com.gmboy.android.toollibrary;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class AppUtil {

    public static void call(Context context, String phone) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phone));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    private static void mail(Activity activity, String address, String subject, String body) {
        Uri uri = Uri.parse("mailto:" + address);
        String[] email = {address};
        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
        intent.putExtra(Intent.EXTRA_CC, email); // 抄送人
        intent.putExtra(Intent.EXTRA_SUBJECT, subject); // 主题
        intent.putExtra(Intent.EXTRA_TEXT, body); // 正文
        activity.startActivity(Intent.createChooser(intent, ""));
    }

    public static void mail(Activity activity, String body) {
        mail(activity, "aaa@aaa.com", "主題", body);
    }

    public static void openLine(Activity activity, String info) {
//        https://developers.line.me/en/docs/messaging-api/using-line-url-scheme/

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("line://call/contacts"));
        activity.startActivity(intent);

//        line://nv/addFriends
    }

    public static void toFaceBookAppPage(Activity activity, String id) {
//        [{title:"Mi", url:"https://www.facebook.com/XiaomiIndia/", id:"1495988390615727"}]
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/" + id + "?referrer=app_link"));
        activity.startActivity(intent);
    }

    public static void openPage(final Activity activity, String webSite) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        Uri content_url = Uri.parse(webSite);
        intent.setData(content_url);
        activity.startActivity(intent);
    }
}
