package com.example.frecuencia_cardiaca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.channels.UnresolvedAddressException;

public class MainActivity_maxima extends AppCompatActivity {
    public EditText edad;
    public Button calcular,atras1;
    public TextView respuesta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_maxima);
        edad = (EditText) findViewById(R.id.txtEdad);
        calcular = (Button) findViewById(R.id.btncalcular);
        atras1 = (Button) findViewById(R.id.btnatras1);
        respuesta = (TextView) findViewById(R.id.lbRespuesta);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edad.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(),"INGRESA TU EDAD",Toast.LENGTH_LONG).show();
                }
                else
                {
                    double eda = Double.parseDouble(edad.getText().toString());
                    double respu =  207 - (0.7019864*eda);
                    respuesta.setText("Tu frecuencia Máxima es de: "+Math.round(respu)+"LPM");
                    edad.getText().clear();

                }
            }
        });

        atras1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}