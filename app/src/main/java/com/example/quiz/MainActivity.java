package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email ;
    EditText password ;
    Button login ;
    String E="Admin" ;
    String P="1234" ;
    boolean isValid=false ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email =findViewById(R.id.E1);
        password =findViewById(R.id.E2);
        login =findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputEmail = email.getText().toString();
                String inputPassword = password.getText().toString();

                if(inputEmail.isEmpty() || inputPassword.isEmpty()){
                    Toast.makeText( MainActivity.this,"Please enter all the details correctly!",Toast.LENGTH_SHORT).show();
                }else if (inputEmail.equals(E) && inputPassword.equals(P)) {

                    Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, SecondPage.class);
                    startActivity(intent);
                }else{
                        Toast.makeText( MainActivity.this,"Incorrect email or password try again!",Toast.LENGTH_SHORT).show();
                    }



            }
        });

}}