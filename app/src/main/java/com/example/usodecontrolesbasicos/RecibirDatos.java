package com.example.usodecontrolesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RecibirDatos extends AppCompatActivity {
    Integer Estado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir_datos);

        TextView tNombre = (TextView)findViewById(R.id.tvNombreReci);
        TextView cEdad = (TextView)findViewById(R.id.tvEdadReci);
        TextView rEstado = (TextView)findViewById(R.id.tvEstado);
        Button btvolver = (Button)findViewById(R.id.btVolver);

        Bundle datosRecibidos = this.getIntent().getExtras();
        String Nombre = datosRecibidos.getString("pNombre");
        String Edad = datosRecibidos.getString("pEdad");
        tNombre.setText("Tu nombre es: "+Nombre);
        cEdad.setText("Tu edad es: "+Edad);
        Estado = Integer.parseInt(Edad);

        if (Estado<18){
            rEstado.setText("Eres menor de edad");
        } else {
            rEstado.setText("Eres mayor de edad");
        }
        btvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vuelva = new
                        Intent(RecibirDatos.this,EnviarDatos.class);
                startActivity(vuelva);
            }
        });


    }
}