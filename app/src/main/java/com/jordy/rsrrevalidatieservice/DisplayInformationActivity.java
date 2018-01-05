package com.jordy.rsrrevalidatieservice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

/**
 * This class shows the information screen.
 */

public class DisplayInformationActivity extends AppCompatActivity {

    private TextView textViewRSR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_information);
        getSupportActionBar().hide();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarInfo);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });;

        // makes the url clickable
        textViewRSR = (TextView) findViewById(R.id.textViewRSR);
        Linkify.addLinks(textViewRSR, Linkify.WEB_URLS);
    }
}
