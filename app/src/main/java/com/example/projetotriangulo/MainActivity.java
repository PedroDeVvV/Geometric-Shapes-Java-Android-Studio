package com.example.projetotriangulo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText lado1, lado2, lado3;
    private TextView resultado;
    private Button buttonUm, btnVoltarTriangulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lado1 = findViewById(R.id.ladoA);
        lado2 = findViewById(R.id.lado2);
        lado3 = findViewById(R.id.ladoC);
        buttonUm = findViewById(R.id.buttonUm);
        resultado = findViewById(R.id.resultado);
        btnVoltarTriangulo = findViewById(R.id.btnCircle);

        buttonUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText("");
                double ladoADouble = Double.parseDouble(lado1.getText().toString());
                double ladoBDouble = Double.parseDouble(lado2.getText().toString());
                double ladoCDouble = Double.parseDouble(lado3.getText().toString());
                if (ladoADouble < 0 || ladoBDouble < 0 || ladoCDouble < 0
                        || ladoADouble + ladoBDouble < ladoCDouble ||
                        ladoBDouble + ladoCDouble < ladoADouble || ladoADouble + ladoCDouble < ladoBDouble) {
                    resultado.setText("Isso não é um triangulo");
                } else if (ladoADouble == ladoBDouble && ladoADouble == ladoCDouble) {
                    resultado.setText("Triangulo equilátero, pois todos os lados são iguais");
                } else if (ladoADouble == ladoBDouble || ladoBDouble == ladoCDouble || ladoCDouble == ladoADouble) {
                    resultado.setText("Triangulo isóceles, pois tem dois lados iguais");
                } else if (ladoADouble != ladoBDouble && ladoBDouble != ladoCDouble) {
                    resultado.setText("Triangulo Escaleno, pois todos os lados são diferentes");
                }
                lado1.setText("");
                lado2.setText("");
                lado3.setText("");
            }
        });

        btnVoltarTriangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voltarTriangulo();
            }
        });
    }

    public void voltarTriangulo() {
       Intent voltarTriangulo = new Intent(this, Entrada.class);
       startActivity(voltarTriangulo);
    }

}