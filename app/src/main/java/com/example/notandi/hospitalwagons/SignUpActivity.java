package com.example.notandi.hospitalwagons;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    ProgressBar progressBar;
    EditText editTextEmail, editTextPassword, editTextConfirmPassword,editTextEmployee_identification_Number;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        editTextEmployee_identification_Number = (EditText) findViewById(R.id.editTextEmployee_identification_Number);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextConfirmPassword = (EditText) findViewById(R.id.editTextConfirmPassword);
        progressBar = (ProgressBar) findViewById(R.id.progressbar);

        mAuth = FirebaseAuth.getInstance();

        findViewById(R.id.buttonSignUp).setOnClickListener(this);
        findViewById(R.id.textViewLogin).setOnClickListener(this);
    }

    private void registerUser() {
        String employeeNumber = editTextEmployee_identification_Number.getText().toString().trim();
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        String confirmedpassword = editTextConfirmPassword.getText().toString().trim();

        boolean doesEmployeeNumberExist=true;
        doesEmployeeNumberExist=searchForEmployeeNumber();
        if (doesEmployeeNumberExist=false) { // going into database and looking for the employee number
            editTextEmail.setError("Þetta starfsmannanúmer er ekki til");
            editTextEmail.requestFocus();
            return;
        }
        if (employeeNumber.isEmpty()) {
            editTextEmail.setError("Skrifa þarf Starfsmannanúmer");
            editTextEmail.requestFocus();
            return;
        }
        if (confirmedpassword!= password) {
            editTextEmail.setError("Sama lykilorðið hefur ekki verið skrifað tvisvar");
            editTextEmail.requestFocus();
            return;
        }
        if (confirmedpassword.isEmpty()) {
            editTextEmail.setError("Endurtaka þarf lykilorð");
            editTextEmail.requestFocus();
            return;
        }
        if (email.isEmpty()) {
            editTextEmail.setError("Þörf er á email");
            editTextEmail.requestFocus();
            return;
        }
        if (email.isEmpty()) {
            editTextEmail.setError("Þörf er á email");
            editTextEmail.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            editTextEmail.setError("Skrifið gilt email");
            editTextEmail.requestFocus();
            return;
        }

        if (password.isEmpty()) {
            editTextPassword.setError("Skrifa þarf aðgangsorð ");
            editTextPassword.requestFocus();
            return;
        }

        if (password.length() < 6) {
            editTextPassword.setError("lámarkslengd aðgangsorðs er 6");
            editTextPassword.requestFocus();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);

        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressBar.setVisibility(View.GONE);
                if (task.isSuccessful()) {
                    Toast.makeText(getApplicationContext(), "Nýkráning tókst", Toast.LENGTH_SHORT).show();
                    finish();
                    startActivity(new Intent(SignUpActivity.this, Login.class));
                } else {

                    if (task.getException() instanceof FirebaseAuthUserCollisionException) {
                        Toast.makeText(getApplicationContext(), "Notandi er núþegar til", Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        Toast.makeText(getApplicationContext(), "Nýkráning tókst ekki", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

    }
    private boolean searchForEmployeeNumber(){
        mAuth.mago =

    return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonSignUp:
                registerUser();
                break;

            case R.id.textViewLogin:
                finish();
                startActivity(new Intent(this, Login.class));
                break;
        }
    }
}
