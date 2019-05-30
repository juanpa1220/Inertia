package com.example.inertia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FigurasActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figuras);
    }

    public void onClickFig1(View view) {
        Intent i = new Intent(FigurasActivity.this, CalculosActivity.class);
        i.putExtra("figura", "fig1_final");
        startActivity(i);
    }

    public void onClickFig2(View view) {
        Intent i = new Intent(FigurasActivity.this, CalculosActivity.class);
        i.putExtra("figura", "fig2_final");
        startActivity(i);
    }

    public void onClickFig3(View view) {
        Intent i = new Intent(FigurasActivity.this, CalculosActivity.class);
        i.putExtra("figura", "fig3_final");
        startActivity(i);
    }

    public void onClickFig4(View view) {
        Intent i = new Intent(FigurasActivity.this, CalculosActivity.class);
        i.putExtra("figura", "fig4_final");
        startActivity(i);
    }

    public void onClickFig5(View view) {
        Intent i = new Intent(FigurasActivity.this, CalculosActivity.class);
        i.putExtra("figura", "fig5_final");
        startActivity(i);
    }

    public void onClickFig6(View view) {
        Intent i = new Intent(FigurasActivity.this, CalculosActivity.class);
        i.putExtra("figura", "fig6_final");
        startActivity(i);
    }

    public void onClickFig7(View view) {
        Intent i = new Intent(FigurasActivity.this, CalculosActivity.class);
        i.putExtra("figura", "fig7_final");
        startActivity(i);
    }

    public void onClickFig8(View view) {
        Intent i = new Intent(FigurasActivity.this, CalculosActivity.class);
        i.putExtra("figura", "fig8_final");
        startActivity(i);
    }

    public void onClickFig9(View view) {
        Intent i = new Intent(FigurasActivity.this, CalculosActivity.class);
        i.putExtra("figura", "fig9_final");
        startActivity(i);
    }

    public void onClickFig10(View view) {
        Intent i = new Intent(FigurasActivity.this, CalculosActivity.class);
        i.putExtra("figura", "fig10_final");
        startActivity(i);
    }

    public void onClickFig11(View view) {
        Intent i = new Intent(FigurasActivity.this, CalculosActivity.class);
        i.putExtra("figura", "fig11_final");
        startActivity(i);
    }

    public void onClickFig12(View view) {
        Intent i = new Intent(FigurasActivity.this, CalculosActivity.class);
        i.putExtra("figura", "fig12_final");
        startActivity(i);
    }
}
