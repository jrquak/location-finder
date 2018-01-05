package com.jordy.rsrrevalidatieservice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * This class is the home screen of the application.
 */
public class MainActivity extends AppCompatActivity {

    private ImageButton ibtnOverRSR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // shows the information screen
        ibtnOverRSR = (ImageButton) findViewById(R.id.ibtnOverRSR);
        ibtnOverRSR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DisplayInformationActivity.class));

            }
        });

        // starts the map activity
        Button btnPechhulp = (Button) findViewById(R.id.btnPechhulp);
        btnPechhulp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MapsActivity.class));
            }
        });

    }

}
