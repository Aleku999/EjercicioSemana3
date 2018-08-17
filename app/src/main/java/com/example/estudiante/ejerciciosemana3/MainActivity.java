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

    TextView tv_titulo;
    EditText et_nombre;
    Button btn_calcular;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_titulo = findViewById(R.id.tv_titulo);
        et_nombre = findViewById(R.id.et_nombre);
        btn_calcular=findViewById(R.id.btn_calcular);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String nombre= et_nombre.getText().toString();
                    //Double.parseDouble(nombre);
                tv_titulo.setText("Hola " + nombre);

                Toast.makeText(MainActivity.this, "Hola "+ nombre, Toast.LENGTH_SHORT).show();

            }
        });

    }
}
