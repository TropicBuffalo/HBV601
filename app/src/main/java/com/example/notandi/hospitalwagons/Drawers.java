package com.example.notandi.hospitalwagons;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Petur on 11.2.2018.
 */

public class Drawers extends AppCompatActivity {
    private Button afram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawers);

        afram = (Button) findViewById(R.id.afram);
        afram.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openWagonSummary();
            }
        });


    }

    public void openWagonSummary(){// takes the user to wagon page when the button is pressed
        Intent intent = new Intent(this,WagonSummary.class);
        startActivity(intent);
    }


    });

}
