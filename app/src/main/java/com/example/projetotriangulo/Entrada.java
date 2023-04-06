package com.example.projetotriangulo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Entrada extends AppCompatActivity {
    private Button btnCircle, btnQuadrado, btnTriangulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada);
        btnCircle = findViewById(R.id.btnCircle);
        btnQuadrado = findViewById(R.id.btnQuadrado);
        btnTriangulo = findViewById(R.id.btnEntrarTriangulo);

        btnCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entrarCirculo();
            }
        });

        btnQuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entrarQuadrado();
            }
        });

        btnTriangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entrarTriangulo();
            }
        });
    }

    public void entrarCirculo() {
        Intent entrarCirculo = new Intent(this, MainActivity2.class);
        startActivity(entrarCirculo);
    }

    public void entrarQuadrado() {
        Intent entrarQuadrado = new Intent(this, PageQuadrado.class);
        startActivity(entrarQuadrado);
    }

    public void entrarTriangulo() {
        Intent entrarTriangulo = new Intent(this, MainActivity.class);
        startActivity(entrarTriangulo);
    }
}