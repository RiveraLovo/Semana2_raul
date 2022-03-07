package com.example.usodecontrolesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText tNombre = (EditText) this.findViewById(R.id.etnombre);
        final EditText tApellido = (EditText) this.findViewById(R.id.etapellido);
        Button bDatos = (Button) this.findViewById(R.id.btenviarDatos);


        bDatos.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                String nom = tNombre.getText().toString();
                String ape = tApellido.getText().toString();
                Toast.makeText(getApplicationContext(), "Tu nombre es: " + nom + "" +
                        "" + ape, Toast.LENGTH_LONG).show();
            }
        });
        Button bsiguiente=(Button)findViewById(R.id.Siguiente21);
        bsiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sigue=new Intent(MainActivity.this,EnviarDatos.class);
                startActivity(sigue);
            }
        });
    }
}