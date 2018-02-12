package com.example.notandi.hospitalwagons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class chooseWagons extends AppCompatActivity {
    private Button veljavagn;
    private Button athugasemd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_wagons);

        getSupportActionBar().setTitle("Velja vagn");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        veljavagn = (Button) findViewById(R.id.veljavagn);
        veljavagn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openDrawers();
            }
        });

        athugasemd = (Button) findViewById(R.id.athugasemd);
        athugasemd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openAthugasemd();
            }
        });

    }

    public void openDrawers(){// takes the user to wagon page when the button is pressed
        Intent intent = new Intent(this,Drawers.class);
        startActivity(intent);
    }

    public void openAthugasemd(){// takes the user to wagon page when the button is pressed
        Intent intent = new Intent(this, Comments.class);
        startActivity(intent);
    }


}
