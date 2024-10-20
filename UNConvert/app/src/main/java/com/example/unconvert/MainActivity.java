package com.example.unconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView; //output text
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            private Object String;

            @Override
            public void onClick(View view) {
               // Toast.makeText(MainActivity.this, "Hi Click Listener Worked", Toast.LENGTH_SHORT).show();

                String = editText.getText().toString();
                String s = null;
                int kg = Integer.parseInt(s);
                double pound = 2.205*kg;
                textView.setText("The corresponding value in pounds is"+pound);

            }
        });

    }
}