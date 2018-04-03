package com.example.notandi.hospitalwagons;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Petur on 11.2.2018.
 */

public class WagonSummary extends AppCompatActivity {

    private Button naest;
    private EditText editText2;
    private EditText editText3;
    private String test;
    private String user;
    private String missing;
    String currentDate = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss", Locale.getDefault()).format(new Date());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wagon_summary);

        naest = (Button) findViewById(R.id.naest);
        editText2 = (EditText)findViewById(R.id.editText2);
        editText3 = (EditText)findViewById(R.id.editText3);
        naest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference ref = database.getReference(currentDate);
                missing = editText3.getText().toString();
                user = editText2.getText().toString();
                DatabaseReference myRef2 = ref.child("Missing");
                myRef2.setValue(missing);
                DatabaseReference myRef = ref.child("User");
                myRef.setValue(user);
                });,
            }
        });
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
