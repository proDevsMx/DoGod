package com.prodevsmx.dogod;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NewAccountActivity extends AppCompatActivity {

    Typeface aliens;
    TextView JoinUs;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account);

        aliens = Typeface.createFromAsset(getAssets(), "fonts/aliens.ttf");
        JoinUs.setTypeface(aliens);
        JoinUs =  (TextView) findViewById(R.id.tvJoinUs);

    }


}