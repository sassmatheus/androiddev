package com.example.soma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void somar(View view){
        TextView resultado = findViewById(R.id.result);
        EditText num1 = findViewById((R.id.num1));
        EditText num2 = findViewById((R.id.num2));
        double n1 = Integer.parseInt(num1.getText().toString());
        double n2 = Integer.parseInt(num2.getText().toString());
        double res = n1 + n2;


        resultado.setText("Resultado: " + res);
    }

}
