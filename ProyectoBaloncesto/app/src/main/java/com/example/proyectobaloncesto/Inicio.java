package com.example.proyectobaloncesto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Inicio extends AppCompatActivity {
    private EditText equipo1, equipo2;
    private Button buttonEmpezar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        buttonEmpezar = (Button) findViewById(R.id.button);
        equipo1 = (EditText) findViewById(R.id.editText);
        equipo2 = (EditText) findViewById(R.id.editText2);

        buttonEmpezar.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Inicio.this, MainActivity.class);
                String nombreEquipo1 = equipo1.getText().toString();
                String nombreEquipo2 = equipo2.getText().toString();
                intent.putExtra("equipo1", nombreEquipo1);
                intent.putExtra("equipo2", nombreEquipo2);
                startActivity(intent);
                finish();
            }
        });
    }




}
