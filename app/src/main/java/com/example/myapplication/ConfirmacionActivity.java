
package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConfirmacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);

        TextView txtDatosRegistro = findViewById(R.id.txtDatosRegistro);

        Button btnSalir = findViewById(R.id.btnSalir);

        String nombre = getIntent().getStringExtra("nombre");
        String correo = getIntent().getStringExtra("correo");
        String categoria = getIntent().getStringExtra("categoria");
        String intereses = getIntent().getStringExtra("intereses");

        String datos = "Nombre: " + nombre +
                "\n\nCorreo: " + correo +
                "\n\nCategoría: " + categoria +
                "\n\nIntereses: " + intereses;

        txtDatosRegistro.setText(datos);

        btnSalir.setOnClickListener(v -> {
            finishAffinity();
        });
    }
}
