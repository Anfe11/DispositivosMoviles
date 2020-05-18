package com.example.proyectomovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class InicioActivity extends AppCompatActivity {
    private Button play;
    private  Button Cerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        play = (Button) findViewById(R.id.btnPlay);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent onClick = new Intent(InicioActivity.this, PreguntasActivity.class);
                startActivity(onClick);
            }
        });

        Cerrar = (Button) findViewById(R.id.btnSalir1);
        Cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(InicioActivity.this,MainActivity.class));
            }
        });
    }
}
