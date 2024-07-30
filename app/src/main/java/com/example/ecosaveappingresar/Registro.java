package com.example.ecosaveappingresar;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.ecosaveappingresar.databinding.ActivityRegistroBinding;

public class Registro extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro);

        //Definir el botón ingresar
        Button registrarse = findViewById(R.id.btnRegistrarse);
        TextView regresoLogin = findViewById(R.id.txtViewRegresoLogin);
        //Añadir la navegación entre pantallas
        //Navegación botón ingresar
        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"usuario registrado",Toast.LENGTH_SHORT).show();
            }
        });

        //Navegación botón olvidaste contraseña
        regresoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity = new Intent(Registro.this, MainActivity.class);
                startActivity(mainActivity);
            }
        });


    }
}