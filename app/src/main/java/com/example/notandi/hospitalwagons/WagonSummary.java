package com.example.notandi.hospitalwagons;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Petur on 11.2.2018.
 */

public class WagonSummary extends AppCompatActivity {

    private Button naest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wagon_summary);
    }

    /* naest = (Button) findViewById(R.id.neast);
     naest.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            openplaceholder();
        }
    });
    */
    /*
    public void openplaceholder(){// takes the user to wagon page when the button is pressed
        Intent intent = new Intent(this,placeholder.class);
        startActivity(intent);
    }
    */
}
