package com.example.notandi.hospitalwagons;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Ósk on 12.2.2018.
 */

public class CommentSummary extends AppCompatActivity {

    private Button backButton; // initialise wagon button
    private Button continueButton; // initialise data button

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment_summary);

        backButton = (Button) findViewById(R.id.back_button); // adding a listener for the "wagon" button
        backButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //openWagons();
                backButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent welcomeIntent = new Intent(CommentSummary.this, Comments.class);
                        startActivity(welcomeIntent);
                    }
                });
            }
        });

        continueButton = (Button) findViewById(R.id.ok_button); // adding a listener for the "wagon" button
        continueButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //openWagons();
                continueButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent continueIntent = new Intent(CommentSummary.this, WelcomeScreen.class); // fix
                        startActivity(continueIntent);
                    }
                });
            }
        });
    }

}
