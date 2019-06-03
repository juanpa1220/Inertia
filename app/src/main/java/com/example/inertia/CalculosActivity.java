package com.example.inertia;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Objects;

public class CalculosActivity extends Activity {
    String figura;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculos);

        figura = Objects.requireNonNull(getIntent().getExtras()).getString("figura");
        createStage(Objects.requireNonNull(figura));
    }

    @SuppressLint("SetTextI18n")
    private void createStage(String figura) {
        if (figura.equals("fig1_final")) {
            ImageView image = findViewById(R.id.imageViewFigure);
            image.setImageResource(R.mipmap.fig1_final);

            LinearLayout linearLayoutHoz3 = findViewById(R.id.LinearLayoutHoz3);
            LinearLayout linearLayoutHoz4 = findViewById(R.id.LinearLayoutHoz4);
            LinearLayout linearLayoutHoz5 = findViewById(R.id.LinearLayoutHoz5);
            LinearLayout linearLayoutHoz6 = findViewById(R.id.LinearLayoutHoz6);

            linearLayoutHoz3.removeAllViews();
            linearLayoutHoz4.removeAllViews();
            linearLayoutHoz5.removeAllViews();
            linearLayoutHoz6.removeAllViews();


            TextView textViewValor1 = findViewById(R.id.textViewValor1);
            TextView textViewValor2 = findViewById(R.id.textViewValor2);

            textViewValor1.setText(" h = ");
            textViewValor2.setText(" w = ");
        }
        if (figura.equals("fig2_final")) {
            ImageView image = findViewById(R.id.imageViewFigure);
            image.setImageResource(R.mipmap.fig2_final);

            LinearLayout linearLayoutHoz4 = findViewById(R.id.LinearLayoutHoz4);
            LinearLayout linearLayoutHoz5 = findViewById(R.id.LinearLayoutHoz5);
            LinearLayout linearLayoutHoz6 = findViewById(R.id.LinearLayoutHoz6);

            linearLayoutHoz4.removeAllViews();
            linearLayoutHoz5.removeAllViews();
            linearLayoutHoz6.removeAllViews();


            TextView textViewValor1 = findViewById(R.id.textViewValor1);
            TextView textViewValor2 = findViewById(R.id.textViewValor2);
            TextView textViewValor3 = findViewById(R.id.textViewValor3);

            textViewValor1.setText(" h = ");
            textViewValor2.setText(" b0 = ");
            textViewValor3.setText(" b1 = ");
        }
        if (figura.equals("fig3_final")) {
            ImageView image = findViewById(R.id.imageViewFigure);
            image.setImageResource(R.mipmap.fig3_final);

            LinearLayout linearLayoutHoz3 = findViewById(R.id.LinearLayoutHoz3);
            LinearLayout linearLayoutHoz4 = findViewById(R.id.LinearLayoutHoz4);
            LinearLayout linearLayoutHoz5 = findViewById(R.id.LinearLayoutHoz5);
            LinearLayout linearLayoutHoz6 = findViewById(R.id.LinearLayoutHoz6);

            linearLayoutHoz3.removeAllViews();
            linearLayoutHoz4.removeAllViews();
            linearLayoutHoz5.removeAllViews();
            linearLayoutHoz6.removeAllViews();


            TextView textViewValor1 = findViewById(R.id.textViewValor1);
            TextView textViewValor2 = findViewById(R.id.textViewValor2);

            textViewValor1.setText(" h = ");
            textViewValor2.setText(" w = ");
        }
        if (figura.equals("fig4_final")) {
            ImageView image = findViewById(R.id.imageViewFigure);
            image.setImageResource(R.mipmap.fig4_final);

            LinearLayout linearLayoutHoz3 = findViewById(R.id.LinearLayoutHoz3);
            LinearLayout linearLayoutHoz4 = findViewById(R.id.LinearLayoutHoz4);
            LinearLayout linearLayoutHoz5 = findViewById(R.id.LinearLayoutHoz5);
            LinearLayout linearLayoutHoz6 = findViewById(R.id.LinearLayoutHoz6);

            linearLayoutHoz3.removeAllViews();
            linearLayoutHoz4.removeAllViews();
            linearLayoutHoz5.removeAllViews();
            linearLayoutHoz6.removeAllViews();


            TextView textViewValor1 = findViewById(R.id.textViewValor1);
            TextView textViewValor2 = findViewById(R.id.textViewValor2);

            textViewValor1.setText(" h = ");
            textViewValor2.setText(" w = ");
        }
        if (figura.equals("fig5_final")) {
            ImageView image = findViewById(R.id.imageViewFigure);
            image.setImageResource(R.mipmap.fig5_final);

            LinearLayout linearLayoutHoz2 = findViewById(R.id.LinearLayoutHoz2);
            LinearLayout linearLayoutHoz3 = findViewById(R.id.LinearLayoutHoz3);
            LinearLayout linearLayoutHoz4 = findViewById(R.id.LinearLayoutHoz4);
            LinearLayout linearLayoutHoz5 = findViewById(R.id.LinearLayoutHoz5);
            LinearLayout linearLayoutHoz6 = findViewById(R.id.LinearLayoutHoz6);

            linearLayoutHoz2.removeAllViews();
            linearLayoutHoz3.removeAllViews();
            linearLayoutHoz4.removeAllViews();
            linearLayoutHoz5.removeAllViews();
            linearLayoutHoz6.removeAllViews();


            TextView textViewValor1 = findViewById(R.id.textViewValor1);

            textViewValor1.setText(" d = ");
        }
        if (figura.equals("fig6_final")) {
            ImageView image = findViewById(R.id.imageViewFigure);
            image.setImageResource(R.mipmap.fig6_final);

            LinearLayout linearLayoutHoz3 = findViewById(R.id.LinearLayoutHoz3);
            LinearLayout linearLayoutHoz4 = findViewById(R.id.LinearLayoutHoz4);
            LinearLayout linearLayoutHoz5 = findViewById(R.id.LinearLayoutHoz5);
            LinearLayout linearLayoutHoz6 = findViewById(R.id.LinearLayoutHoz6);

            linearLayoutHoz3.removeAllViews();
            linearLayoutHoz4.removeAllViews();
            linearLayoutHoz5.removeAllViews();
            linearLayoutHoz6.removeAllViews();


            TextView textViewValor1 = findViewById(R.id.textViewValor1);
            TextView textViewValor2 = findViewById(R.id.textViewValor2);

            textViewValor1.setText(" d = ");
            textViewValor2.setText(" t = ");
        }
        if (figura.equals("fig7_final")) {
            ImageView image = findViewById(R.id.imageViewFigure);
            image.setImageResource(R.mipmap.fig7_final);

            LinearLayout linearLayoutHoz4 = findViewById(R.id.LinearLayoutHoz4);
            LinearLayout linearLayoutHoz5 = findViewById(R.id.LinearLayoutHoz5);
            LinearLayout linearLayoutHoz6 = findViewById(R.id.LinearLayoutHoz6);

            linearLayoutHoz4.removeAllViews();
            linearLayoutHoz5.removeAllViews();
            linearLayoutHoz6.removeAllViews();


            TextView textViewValor1 = findViewById(R.id.textViewValor1);
            TextView textViewValor2 = findViewById(R.id.textViewValor2);
            TextView textViewValor3 = findViewById(R.id.textViewValor3);

            textViewValor1.setText(" h = ");
            textViewValor2.setText(" w = ");
            textViewValor3.setText(" t = ");
        }
        if (figura.equals("fig8_final")) {
            ImageView image = findViewById(R.id.imageViewFigure);
            image.setImageResource(R.mipmap.fig8_final);

            LinearLayout linearLayoutHoz5 = findViewById(R.id.LinearLayoutHoz5);
            LinearLayout linearLayoutHoz6 = findViewById(R.id.LinearLayoutHoz6);

            linearLayoutHoz5.removeAllViews();
            linearLayoutHoz6.removeAllViews();


            TextView textViewValor1 = findViewById(R.id.textViewValor1);
            TextView textViewValor2 = findViewById(R.id.textViewValor2);
            TextView textViewValor3 = findViewById(R.id.textViewValor3);
            TextView textViewValor4 = findViewById(R.id.textViewValor4);

            textViewValor1.setText(" H = ");
            textViewValor2.setText(" W = ");
            textViewValor3.setText(" h = ");
            textViewValor4.setText(" b = ");
        }
        if (figura.equals("fig9_final")) {
            ImageView image = findViewById(R.id.imageViewFigure);
            image.setImageResource(R.mipmap.fig9_final);

            LinearLayout linearLayoutHoz4 = findViewById(R.id.LinearLayoutHoz4);
            LinearLayout linearLayoutHoz5 = findViewById(R.id.LinearLayoutHoz5);
            LinearLayout linearLayoutHoz6 = findViewById(R.id.LinearLayoutHoz6);

            linearLayoutHoz4.removeAllViews();
            linearLayoutHoz5.removeAllViews();
            linearLayoutHoz6.removeAllViews();


            TextView textViewValor1 = findViewById(R.id.textViewValor1);
            TextView textViewValor2 = findViewById(R.id.textViewValor2);
            TextView textViewValor3 = findViewById(R.id.textViewValor3);

            textViewValor1.setText(" h = ");
            textViewValor2.setText(" w = ");
            textViewValor3.setText(" t = ");
        }
        if (figura.equals("fig10_final")) {
            ImageView image = findViewById(R.id.imageViewFigure);
            image.setImageResource(R.mipmap.fig10_final);

            LinearLayout linearLayoutHoz5 = findViewById(R.id.LinearLayoutHoz5);
            LinearLayout linearLayoutHoz6 = findViewById(R.id.LinearLayoutHoz6);

            linearLayoutHoz5.removeAllViews();
            linearLayoutHoz6.removeAllViews();


            TextView textViewValor1 = findViewById(R.id.textViewValor1);
            TextView textViewValor2 = findViewById(R.id.textViewValor2);
            TextView textViewValor3 = findViewById(R.id.textViewValor3);
            TextView textViewValor4 = findViewById(R.id.textViewValor4);

            textViewValor1.setText(" H = ");
            textViewValor2.setText(" W = ");
            textViewValor3.setText(" h = ");
            textViewValor4.setText(" b = ");
        }
        if (figura.equals("fig11_final")) {
            ImageView image = findViewById(R.id.imageViewFigure);
            image.setImageResource(R.mipmap.fig11_final);

            LinearLayout linearLayoutHoz4 = findViewById(R.id.LinearLayoutHoz4);
            LinearLayout linearLayoutHoz5 = findViewById(R.id.LinearLayoutHoz5);
            LinearLayout linearLayoutHoz6 = findViewById(R.id.LinearLayoutHoz6);

            linearLayoutHoz4.removeAllViews();
            linearLayoutHoz5.removeAllViews();
            linearLayoutHoz6.removeAllViews();


            TextView textViewValor1 = findViewById(R.id.textViewValor1);
            TextView textViewValor2 = findViewById(R.id.textViewValor2);
            TextView textViewValor3 = findViewById(R.id.textViewValor3);

            textViewValor1.setText(" h = ");
            textViewValor2.setText(" w = ");
            textViewValor3.setText(" t = ");
        }
        if (figura.equals("fig12_final")) {
            ImageView image = findViewById(R.id.imageViewFigure);
            image.setImageResource(R.mipmap.fig12_final);

            LinearLayout linearLayoutHoz2 = findViewById(R.id.LinearLayoutHoz2);
            LinearLayout linearLayoutHoz3 = findViewById(R.id.LinearLayoutHoz3);
            LinearLayout linearLayoutHoz4 = findViewById(R.id.LinearLayoutHoz4);
            LinearLayout linearLayoutHoz5 = findViewById(R.id.LinearLayoutHoz5);
            LinearLayout linearLayoutHoz6 = findViewById(R.id.LinearLayoutHoz6);

            linearLayoutHoz2.removeAllViews();
            linearLayoutHoz3.removeAllViews();
            linearLayoutHoz4.removeAllViews();
            linearLayoutHoz5.removeAllViews();
            linearLayoutHoz6.removeAllViews();


            TextView textViewValor1 = findViewById(R.id.textViewValor1);

            textViewValor1.setText(" w = ");
        }
    }

    public void calcular(View view) {
        try {
            if (figura.equals("fig1_final")) {
                EditText editTextValor1 = findViewById(R.id.editTextValor1);
                EditText editTextValor2 = findViewById(R.id.editTextValor2);

                float h = Float.parseFloat(String.valueOf(editTextValor1.getText()));
                float w = Float.parseFloat(String.valueOf(editTextValor2.getText()));

                float area = (h * w / 2);
                float centroide = h / 3;
                double inerciaX = (w * Math.pow(h, 3)) / 36;
                double inerciaY = (w * Math.pow(h, 3)) / 48;

                String respuesta = ("El área es igual a: \nA = " + area + " cm²" +
                        "\n\nEl centroide es igual a: \ne = " + centroide + " cm" +
                        "\n\nLa incercia en el eje x es igual a: \nJx = " + inerciaX + " cm⁴" +
                        "\n\nLa incercia en el eje y es igual a: \nJy = " + inerciaY + " cm⁴"
                );

                Intent i = new Intent(CalculosActivity.this, ResultadosActivity.class);
                i.putExtra("resultados", respuesta);
                startActivity(i);
            }
            if (figura.equals("fig2_final")) {
                EditText editTextValor1 = findViewById(R.id.editTextValor1);
                EditText editTextValor2 = findViewById(R.id.editTextValor2);
                EditText editTextValor3 = findViewById(R.id.editTextValor3);

                float h = Float.parseFloat(String.valueOf(editTextValor1.getText()));
                float b0 = Float.parseFloat(String.valueOf(editTextValor2.getText()));
                float b1 = Float.parseFloat(String.valueOf(editTextValor3.getText()));

                float area = (h / 2) * (b0 + b1);
                float centroide = (h / 3) * ((b0 + 2 * b1) / (b0 + b1));
                double inerciaX = (Math.pow(h, 3) / 36) * ((Math.pow(b0, 2) + 4 * b0 * b1 + Math.pow(b1, 2)) / (b0 + b1));
                double inerciaY = (Math.pow(h, 3) / 48) * (Math.pow(b0, 3) + Math.pow(b0, 2) * b1 + Math.pow(b1, 2) * b0 + Math.pow(b1, 3));

                String respuesta = ("El área es igual a: \nA = " + area + " cm²" +
                        "\n\nEl centroide es igual a: \ne = " + centroide + " cm" +
                        "\n\nLa incercia en el eje x es igual a: \nJx = " + inerciaX + " cm⁴" +
                        "\n\nLa incercia en el eje y es igual a: \nJy = " + inerciaY + " cm⁴"
                );

                Intent i = new Intent(CalculosActivity.this, ResultadosActivity.class);
                i.putExtra("resultados", respuesta);
                startActivity(i);

            }
            if (figura.equals("fig3_final")) {
                EditText editTextValor1 = findViewById(R.id.editTextValor1);
                EditText editTextValor2 = findViewById(R.id.editTextValor2);

                float h = Float.parseFloat(String.valueOf(editTextValor1.getText()));
                float w = Float.parseFloat(String.valueOf(editTextValor2.getText()));

                float area = (h * w);
                float centroideX = h / 2;
                float centroideY = w / 2;
                double inerciaX = (w * Math.pow(h, 3)) / 12;
                double inerciaY = (h * Math.pow(w, 3)) / 12;

                String respuesta = ("El área es igual a: \nA = " + area + " cm²" +
                        "\n\nEl centroide en el eje x es igual a: \nex = " + centroideX + " cm" +
                        "\n\nEl centroide en el eje y es igual a: \ney = " + centroideY + " cm" +
                        "\n\nLa incercia en el eje x es igual a: \nJx = " + inerciaX + " cm⁴" +
                        "\n\nLa incercia en el eje y es igual a: \nJy = " + inerciaY + " cm⁴"
                );

                Intent i = new Intent(CalculosActivity.this, ResultadosActivity.class);
                i.putExtra("resultados", respuesta);
                startActivity(i);
            }
            if (figura.equals("fig4_final")) {
                EditText editTextValor1 = findViewById(R.id.editTextValor1);
                EditText editTextValor2 = findViewById(R.id.editTextValor2);

                float h = Float.parseFloat(String.valueOf(editTextValor1.getText()));
                float w = Float.parseFloat(String.valueOf(editTextValor2.getText()));
                float b = h / 2;
                float a = w / 2;

                double area = a * b * Math.PI;
                double inerciaX = 0.25 * Math.PI * Math.pow(b, 3) * a;
                double inerciaY = 0.25 * Math.PI * Math.pow(a, 3) * b;

                String respuesta = ("El área es igual a: \nA = " + area + " cm²" +
                        "\n\nEl centroide en el eje x es igual a: \nex = " + a + " cm" +
                        "\n\nEl centroide en el eje y es igual a: \ney = " + b + " cm" +
                        "\n\nLa incercia en el eje x es igual a: \nJx = " + inerciaX + " cm⁴" +
                        "\n\nLa incercia en el eje y es igual a: \nJy = " + inerciaY + " cm⁴"
                );

                Intent i = new Intent(CalculosActivity.this, ResultadosActivity.class);
                i.putExtra("resultados", respuesta);
                startActivity(i);

            }
            if (figura.equals("fig5_final")) {
                EditText editTextValor1 = findViewById(R.id.editTextValor1);

                float d = Float.parseFloat(String.valueOf(editTextValor1.getText()));
                float r = d / 2;

                double area = Math.PI * Math.pow(r, 2);
                double inercia = (Math.PI * Math.pow(r, 4)) / 4;

                String respuesta = ("El área es igual a: \nA = " + area + " cm²" +
                        "\n\nEl centroide es igual a: \ne = " + r + " cm" +
                        "\n\nLa incercia es igual a: \nJ = " + inercia + " cm⁴"
                );
                Intent i = new Intent(CalculosActivity.this, ResultadosActivity.class);
                i.putExtra("resultados", respuesta);
                startActivity(i);
            }
            if (figura.equals("fig6_final")) {
                EditText editTextValor1 = findViewById(R.id.editTextValor1);
                EditText editTextValor2 = findViewById(R.id.editTextValor2);

                float d = Float.parseFloat(String.valueOf(editTextValor1.getText()));
                float t = Float.parseFloat(String.valueOf(editTextValor2.getText()));

                float d2 = d - 2 * t;

                double area = (Math.PI / 4) * (Math.pow(d, 2) - Math.pow(d2, 2));
                float centroide = d / 2;
                double inercia = (Math.PI / 64) * (Math.pow(d, 4) - Math.pow(d2, 4));

                String respuesta = ("El área es igual a: \nA = " + area + " cm²" +
                        "\n\nEl centroide es igual a: \ne = " + centroide + " cm" +
                        "\n\nLa incercia es igual a: \nJ = " + inercia + " cm⁴"
                );

                Intent i = new Intent(CalculosActivity.this, ResultadosActivity.class);
                i.putExtra("resultados", respuesta);
                startActivity(i);
            }
            if (figura.equals("fig7_final")) {
                EditText editTextValor1 = findViewById(R.id.editTextValor1);
                EditText editTextValor2 = findViewById(R.id.editTextValor2);
                EditText editTextValor3 = findViewById(R.id.editTextValor3);

                float h = Float.parseFloat(String.valueOf(editTextValor1.getText()));
                float w = Float.parseFloat(String.valueOf(editTextValor2.getText()));
                float t = Float.parseFloat(String.valueOf(editTextValor3.getText()));

                double area = h * t + (t * h) / 2 - Math.pow(t, 2) / 2;
                float centroideX = w / 2;
                float centroideY = h / 2;
                double inerciaX = w * Math.pow(t, 3) / 12 + 2 * t * Math.pow(((h - t) / 2), 3) / 12;
                double inerciaY = t * Math.pow(w, 3) / 12 + 2 * Math.pow(t, 3) * ((h - t) / 2) / 12;

                String respuesta = ("El área es igual a: \nA = " + area + " cm²" +
                        "\n\nEl centroide en el eje x es igual a: \nex = " + centroideX + " cm" +
                        "\n\nEl centroide en el eje y es igual a: \ney = " + centroideY + " cm" +
                        "\n\nLa incercia en el eje x es igual a: \nJx = " + inerciaX + " cm⁴" +
                        "\n\nLa incercia en el eje y es igual a: \nJy = " + inerciaY + " cm⁴"
                );

                Intent i = new Intent(CalculosActivity.this, ResultadosActivity.class);
                i.putExtra("resultados", respuesta);
                startActivity(i);
            }
            if (figura.equals("fig8_final")) {
                EditText editTextValor1 = findViewById(R.id.editTextValor1);
                EditText editTextValor2 = findViewById(R.id.editTextValor2);
                EditText editTextValor3 = findViewById(R.id.editTextValor3);
                EditText editTextValor4 = findViewById(R.id.editTextValor4);

                float H = Float.parseFloat(String.valueOf(editTextValor1.getText()));
                float B = Float.parseFloat(String.valueOf(editTextValor2.getText()));
                float h = Float.parseFloat(String.valueOf(editTextValor3.getText()));
                float b = Float.parseFloat(String.valueOf(editTextValor4.getText()));

                double area = B * H * 2 * b * h;
                float centroideX = B / 2;
                float centroideY = H / 2;
                double inerciaX = B * Math.pow(H, 3) * 2 * b * Math.pow(h, 3) / 12;

                String respuesta = ("El área es igual a: \nA = " + area + " cm²" +
                        "\n\nEl centroide en el eje x es igual a: \nex = " + centroideX + " cm" +
                        "\n\nEl centroide en el eje y es igual a: \ney = " + centroideY + " cm" +
                        "\n\nLa incercia es igual a: \nJx = " + inerciaX + " cm⁴"
                );

                Intent i = new Intent(CalculosActivity.this, ResultadosActivity.class);
                i.putExtra("resultados", respuesta);
                startActivity(i);
            }
            if (figura.equals("fig9_final")) {
                EditText editTextValor1 = findViewById(R.id.editTextValor1);
                EditText editTextValor2 = findViewById(R.id.editTextValor2);
                EditText editTextValor3 = findViewById(R.id.editTextValor3);

                float h = Float.parseFloat(String.valueOf(editTextValor1.getText()));
                float w = Float.parseFloat(String.valueOf(editTextValor2.getText()));
                float t = Float.parseFloat(String.valueOf(editTextValor3.getText()));

                double area = w * t + t * (h - t);
                double centroideX = (t / 2 * (Math.pow(w, 2) + h * t - Math.pow(t, 2))) / (w * t + h * t + Math.pow(t, 2));
                double centroideY = (t / 2 * (w * t + Math.pow(h, 2) - 2 * h * t - Math.pow(t, 2))) / (w * t + h * t + Math.pow(t, 2));
                double inerciaX = (w * Math.pow(t, 3) / 12) + (t * Math.pow((h - t), 3) / 12);
                double inerciaY = (t * Math.pow(w, 3) / 12) + ((h - t) * Math.pow(t, 3) / 12);

                String respuesta = ("El área es igual a: \nA = " + area + " cm²" +
                        "\n\nEl centroide en el eje x es igual a: \nex = " + centroideX + " cm" +
                        "\n\nEl centroide en el eje y es igual a: \ney = " + centroideY + " cm" +
                        "\n\nLa incercia en el eje x es igual a: \nJx = " + inerciaX + " cm⁴" +
                        "\n\nLa incercia en el eje y es igual a: \nJy = " + inerciaY + " cm⁴"
                );

                Intent i = new Intent(CalculosActivity.this, ResultadosActivity.class);
                i.putExtra("resultados", respuesta);
                startActivity(i);
            }
            if (figura.equals("fig10_final")) {
                EditText editTextValor1 = findViewById(R.id.editTextValor1);
                EditText editTextValor2 = findViewById(R.id.editTextValor2);
                EditText editTextValor3 = findViewById(R.id.editTextValor3);
                EditText editTextValor4 = findViewById(R.id.editTextValor4);

                float H = Float.parseFloat(String.valueOf(editTextValor1.getText()));
                float B = Float.parseFloat(String.valueOf(editTextValor2.getText()));
                float h = Float.parseFloat(String.valueOf(editTextValor3.getText()));
                float b = Float.parseFloat(String.valueOf(editTextValor4.getText()));

                float denominador = h * (B - b) + 2 * B * (H - h);

                double area = B * H - b * h;
                double centroideX = ((h * (B - b)) + (2 * Math.pow(B, 2) * (H - h))) / denominador;
                double centroideY = ((Math.pow(h, 2) / 2 * (B - b)) + (B * Math.pow((H - h), 2))) / denominador;
                double inerciaX = (B * Math.pow(H, 3) - b * Math.pow(h, 3)) / 12;

                String respuesta = ("El área es igual a: \nA = " + area + " cm²" +
                        "\n\nEl centroide en el eje x es igual a: \nex = " + centroideX + " cm" +
                        "\n\nEl centroide en el eje y es igual a: \ney = " + centroideY + " cm" +
                        "\n\nLa incercia es igual a: \nJx = " + inerciaX + " cm⁴"
                );

                Intent i = new Intent(CalculosActivity.this, ResultadosActivity.class);
                i.putExtra("resultados", respuesta);
                startActivity(i);
            }
            if (figura.equals("fig11_final")) {
                EditText editTextValor1 = findViewById(R.id.editTextValor1);
                EditText editTextValor2 = findViewById(R.id.editTextValor2);
                EditText editTextValor3 = findViewById(R.id.editTextValor3);

                float H = Float.parseFloat(String.valueOf(editTextValor1.getText()));
                float B = Float.parseFloat(String.valueOf(editTextValor2.getText()));
                float t = Float.parseFloat(String.valueOf(editTextValor3.getText()));

                float h = H - 2 * t;
                float b = B - 2 * t;

                double area = B * H - b * h;
                double centroideX = H / 2;
                double centroideY = B / 2;
                double inerciaX = (B * Math.pow(H, 3) - b * Math.pow(h, 3)) / 12;
                double inerciaY = (H * Math.pow(B, 3) - h * Math.pow(b, 3)) / 12;

                String respuesta = ("El área es igual a: \nA = " + area + " cm²" +
                        "\n\nEl centroide en el eje x es igual a: \nex = " + centroideX + " cm" +
                        "\n\nEl centroide en el eje y es igual a: \ney = " + centroideY + " cm" +
                        "\n\nLa incercia en el eje x es igual a: \nJx = " + inerciaX + " cm⁴" +
                        "\n\nLa incercia en el eje y es igual a: \nJy = " + inerciaY + " cm⁴"
                );

                Intent i = new Intent(CalculosActivity.this, ResultadosActivity.class);
                i.putExtra("resultados", respuesta);
                startActivity(i);
            }
            if (figura.equals("fig12_final")) {
                EditText editTextValor1 = findViewById(R.id.editTextValor1);

                float w = Float.parseFloat(String.valueOf(editTextValor1.getText()));

                double area = Math.pow(w, 2);
                double inercia = Math.pow(w, 4) / 12;

                String respuesta = ("El área es igual a: \nA = " + area + " cm²" +
                        "\n\nEl centroide es igual a: \ne = " + w / 2 + " cm" +
                        "\n\nLa incercia es igual a: \nJ = " + inercia + " cm⁴"
                );
                Intent i = new Intent(CalculosActivity.this, ResultadosActivity.class);
                i.putExtra("resultados", respuesta);
                startActivity(i);
            }


        } catch (Exception e) {
            Intent i = new Intent(CalculosActivity.this, ResultadosActivity.class);
            i.putExtra("resultados", "Datos invalidos");
            startActivity(i);
        }

    }

}
