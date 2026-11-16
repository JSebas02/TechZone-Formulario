
package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        EditText edtNombre = findViewById(R.id.edtNombre);
        EditText edtCorreo = findViewById(R.id.edtCorreo);

        RadioGroup grupoCategoria = findViewById(R.id.grupoCategoria);

        CheckBox checkGaming = findViewById(R.id.checkGaming);
        CheckBox checkIA = findViewById(R.id.checkIA);
        CheckBox checkProgramacion = findViewById(R.id.checkProgramacion);

        Button btnRegistrar = findViewById(R.id.btnRegistrar);

        btnRegistrar.setOnClickListener(v -> {

            String nombre = edtNombre.getText().toString().trim();
            String correo = edtCorreo.getText().toString().trim();

            if (nombre.isEmpty() || correo.isEmpty()) {
                Toast.makeText(this, "Completa tu nombre y correo", Toast.LENGTH_SHORT).show();
                return;
            }

            int idCategoria = grupoCategoria.getCheckedRadioButtonId();

            if (idCategoria == -1) {
                Toast.makeText(this, "Selecciona una categoría", Toast.LENGTH_SHORT).show();
                return;
            }

            RadioButton radioSeleccionado = findViewById(idCategoria);
            String categoria = radioSeleccionado.getText().toString();

            StringBuilder intereses = new StringBuilder();

            if (checkGaming.isChecked()) {
                intereses.append("Gaming, ");
            }

            if (checkIA.isChecked()) {
                intereses.append("Inteligencia artificial, ");
            }

            if (checkProgramacion.isChecked()) {
                intereses.append("Programación, ");
            }

            if (intereses.length() > 0) {
                intereses.setLength(intereses.length() - 2);
            } else {
                intereses.append("Ninguno");
            }

            Intent intent = new Intent(RegistroActivity.this, ConfirmacionActivity.class
            );

            intent.putExtra("nombre", nombre);
            intent.putExtra("correo", correo);
            intent.putExtra("categoria", categoria);
            intent.putExtra("intereses", intereses.toString());

            startActivity(intent);
        });
    }
}
