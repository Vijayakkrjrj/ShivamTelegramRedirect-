package com.shivam.telegramredirect;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends Activity {

    private static final String CHANNEL_URL =
            "https://t.me/ShivamMathur0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(
                Intent.ACTION_VIEW,
                Uri.parse(CHANNEL_URL)
        );

        startActivity(intent);
        finish();
    }
}
