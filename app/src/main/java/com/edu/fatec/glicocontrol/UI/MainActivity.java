package com.edu.fatec.glicocontrol.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.edu.fatec.glicocontrol.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cadastro (View v){
        Intent tCadastro = new Intent(this, Cadastro.class);
        startActivity(tCadastro);
    }


    public void ListaControle (View v){
        Intent tLista = new Intent(this, ListaControle.class);
        startActivity(tLista);
    }

    public void Imc (View v){
        Intent tImc = new Intent(this, Imc.class);
        startActivity(tImc);
    }

    public void ListaAlarme (View v){
        Intent tAlarme = new Intent(this, ListaAlarme.class);
        startActivity(tAlarme);
    }


}
