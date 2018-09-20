package com.example.notandi.hospitalwagons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.notandi.hospitalwagons.Fragment_Drawers.drawer_med_Fragment;


public class WelcomeScreen extends AppCompatActivity {

    private Button wagonButton; // initialise wagon button
    private Button dataButton; // initialise data button
    private Button signoutButton; // initialise signout button


    @Override
    protected void onCreate(Bundle savedInstanceState) { // creation of the Welcome screen
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        drawer_med_Fragment d=new drawer_med_Fragment();

        //d.quantityArr=getResources().getIntArray(R.array.medicine_drawer_quantity);
        //System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA: "+d.quantityArr);

        wagonButton = (Button) findViewById(R.id.button_wagons); // adding a listener for the "wagon" button
        wagonButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //openWagons();
                wagonButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                        Intent wagonIntent = new Intent(WelcomeScreen.this, BarcodeScannerFunction.class);
                        startActivity(wagonIntent);
                    }
                });
            }
        });

        dataButton = (Button) findViewById(R.id.button_data);// adding a listener for the "data" button
        dataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //openWagons();
                dataButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent commentIntent = new Intent(WelcomeScreen.this, viewData.class);
                        startActivity(commentIntent);
                    }
                });
            }
        });

        signoutButton = (Button) findViewById(R.id.button_logout);// adding a listener for the "sign out" button
        signoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //openWagons();
                signoutButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent signoutIntent = new Intent(WelcomeScreen.this, Login.class);
                        startActivity(signoutIntent);
                    }
                });
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
