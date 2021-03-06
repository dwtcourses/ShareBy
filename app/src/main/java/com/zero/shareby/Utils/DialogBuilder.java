package com.zero.shareby.Utils;

import android.content.Context;
import android.support.v7.app.AlertDialog;

public class DialogBuilder {
    public static AlertDialog.Builder getDialogBuilder(Context context, String title, String message){
        AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(context);
        builder.setTitle(title);
        builder.setMessage(message);
        return builder;
    }
}
