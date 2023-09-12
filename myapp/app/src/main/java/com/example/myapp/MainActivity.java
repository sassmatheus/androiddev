package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void trocaTexto(View view){
        TextView texto = findViewById(R.id.hello);
        String textoAtual = texto.getText().toString();
        if(textoAtual.equals("Texto original")){
            texto.setText("Novo texto");
        } else{
            texto.setText("Texto original");
        }
    }

    public void trocaTexto2(View view){
        EditText editText;
        editText = findViewById(R.id.editText);
        TextView texto = findViewById(R.id.hello);
        String novo = editText.getText().toString();
        texto.setText(novo);
    }

}
