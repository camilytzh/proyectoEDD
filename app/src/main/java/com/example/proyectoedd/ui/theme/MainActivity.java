package com.example.proyectoedd.ui.theme;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectoedd.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //EVENTO PARA VER MIS CONTACTOS
        Button btnVerContactos = findViewById(R.id.btnVerContactos);

        // el parametro puede usarse como new View.OnClickListener() pero mejor usamos lambda, mas legible
        btnVerContactos.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ContactosActivity.class);
            startActivity(intent);
        });
    }
}
