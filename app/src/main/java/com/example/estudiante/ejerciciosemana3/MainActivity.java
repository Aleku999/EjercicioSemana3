package com.example.estudiante.ejerciciosemana3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv_titulo, tv_tuIMC;
    EditText et_altura, et_masa, et_imc;
    Button btn_calcular;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_titulo = findViewById(R.id.tv_titulo);
        tv_tuIMC = findViewById(R.id.tv_tuIMC);
        et_masa = findViewById(R.id.et_masa);
        et_imc = findViewById(R.id.et_imc);
        btn_calcular=findViewById(R.id.btn_calcular);
        et_altura= findViewById(R.id.et_altura);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String masa = et_masa.getText().toString();
                   String altura = et_altura.getText().toString();
                   float masaU= Float.valueOf(masa);
                   float alturaU= Float.valueOf(altura);
                   float alturaD= alturaU/100;
                   float calculo = masaU/(alturaD*alturaD);
                   et_imc.setText(""+calculo);


                Toast.makeText(MainActivity.this, " "+ calculo, Toast.LENGTH_SHORT).show();

            }
        });

    }
}
