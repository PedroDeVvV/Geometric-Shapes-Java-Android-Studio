package com.example.projetotriangulo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PageQuadrado extends AppCompatActivity {
    private Button voltar, calcularQuadrado;
    private EditText lado1, lado2;
    private TextView resultadoQuadrado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_quadrado);
        voltar = findViewById(R.id.btnVoltarQuadrado);
        calcularQuadrado = findViewById(R.id.btnCalcularQuadrado);
        lado1 = findViewById(R.id.lado1);
        lado2 = findViewById(R.id.lado2);
        resultadoQuadrado = findViewById(R.id.resultadoQuadrado);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voltarQuadrado();
            }
        });

        calcularQuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultadoQuadrado.setText("");
                double lado1Double = Double.parseDouble(lado1.getText().toString());
                double lado2Double = Double.parseDouble(lado2.getText().toString());
                if(lado1Double > lado2Double || lado2Double > lado1Double) {
                    double area = lado1Double * lado2Double;
                    double perimetro = lado1Double * 4;
                    resultadoQuadrado.setText("Isso é um retângulo de área " + area + " e de perimêtro " + perimetro);
                } else {
                    double area = lado1Double * lado1Double;
                    double perimetro = lado1Double + lado1Double + lado2Double + lado2Double;
                    resultadoQuadrado.setText("Isso é um quadrado que possui uma área de " + area + " e de perimêtro " + perimetro);
                }
                lado1.setText("");
                lado2.setText("");
            }
        });
    }

    public void voltarQuadrado() {
        Intent voltarQuadrado = new Intent(PageQuadrado.this, Entrada.class);
        startActivity(voltarQuadrado);
    }
}