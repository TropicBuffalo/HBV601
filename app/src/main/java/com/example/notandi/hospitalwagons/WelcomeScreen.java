package com.example.notandi.hospitalwagons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class WelcomeScreen extends AppCompatActivity {

    private Button wagonbutton; // initialise wagon button
    private Button databutton; // initialise data button
    private Button signoutbutton; // initialise signout button

    @Override
    protected void onCreate(Bundle savedInstanceState) { // creation of the Welcome screen
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        wagonbutton = (Button) findViewById(R.id.buttonVagnar); // adding a listener for the "wagon" button
        wagonbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openWagons();
            }
        });

        databutton = (Button) findViewById(R.id.buttonGagnaskodun);// adding a listener for the "data" button
        databutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                enterDataView();
            }
        });
        signoutbutton = (Button) findViewById(R.id.buttonUtskraning);// adding a listener for the "sign out" button
        signoutbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                signingOut();
            }
        });
    }
    public void openWagons(){// takes the user to wagon page when the button is pressed
        Intent  intent1= new Intent(this,chooseWagons.class);
        startActivity(intent1);
    }
    public void enterDataView(){ // takes the user to data page when the button is pressed
        Intent intent2= new Intent(this,viewData.class);
        startActivity(intent2);
    }
    public void signingOut(){ // yet to add signout function until then it takes you to the data screen
        Intent intent3= new Intent(this,viewData.class);
        startActivity(intent3);
    }
}
