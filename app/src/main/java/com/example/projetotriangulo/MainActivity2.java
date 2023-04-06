package com.example.projetotriangulo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity {
    private Button btnVoltarCircle, btnCalcularCircle;
    private EditText raio;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnVoltarCircle = findViewById(R.id.btnVoltarCirculo);
        btnCalcularCircle = findViewById(R.id.btnCalcularCircle);
        raio = findViewById(R.id.diam);
        resultado = findViewById(R.id.resultadoCircle);

        btnVoltarCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voltarCircle();
            }
        });

        btnCalcularCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText("");
                double raioDouble = Double.parseDouble(raio.getText().toString());
                double area = (raioDouble * raioDouble) * 3.14;
                double perimetro = 2 * 3.14 * raioDouble;
                DecimalFormat df = new DecimalFormat("####.00");
                df.format(12.36);
                resultado.setText("A área do círculo é de " + area + " já o perimêtro é igual a " + df.format(perimetro));
                raio.setText("");
            }
        });
    }

    public void voltarCircle() {
        Intent voltarCircle = new Intent(MainActivity2.this, Entrada.class);
        startActivity(voltarCircle);
    }
}






