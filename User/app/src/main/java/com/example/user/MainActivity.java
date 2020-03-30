package com.example.user;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import static com.example.user.R.id.btnenviar;
import static com.example.user.R.id.lblcampo_texto;
import static com.example.user.R.id.txtmostrar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //se declaran las variables
        FloatingActionButton btnflot = findViewById(btnenviar);
        final TextView texto = findViewById(txtmostrar);
        final EditText mostrar = findViewById(lblcampo_texto);
        btnflot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(mostrar.getText());
            }
        });


    }






}
