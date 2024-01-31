package com.example.exp101;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText e1 = (EditText) findViewById(R.id.edt1);
        EditText e2 = (EditText) findViewById(R.id.edt2);

        Button b1 = (Button) findViewById(R.id.btnSubmit);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("Aniruddha@gmail.com")&(e2.getText().toString().equals("12345"))){
                    Toast.makeText(getApplicationContext(), "Login successfuly", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Login unseccessfuly", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}