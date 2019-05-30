package com.example.inertia;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.widget.TextView;

import java.util.Objects;

public class ResultadosActivity extends Activity {
    String resultado;

    @SuppressLint("SetTextI18n")
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        resultado = Objects.requireNonNull(getIntent().getExtras()).getString("resultados");
        if(Objects.equals(resultado, "Datos invalidos")){
            TextView textViewEncabezado = findViewById(R.id.textViewEncabezado);
            textViewEncabezado.setText("Error");
        }
        TextView textViewResultados = findViewById(R.id.textViewResultados);
        textViewResultados.setText(resultado);
    }
}
