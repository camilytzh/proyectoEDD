package com.example.proyectoedd.ui.theme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectoedd.R;

public class ContactosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos);  // Establecemos el layout de la actividad





        //boton de regreso
        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> {
            // Volver al menu princ
            Intent intent = new Intent(ContactosActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}