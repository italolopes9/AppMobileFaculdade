package com.projeto.appmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;


public class MainActivity extends AppCompatActivity {
    private EditText campoNome;
    private TextInputEditText campoTelefone;
    private TextView textoResultado;
    private CheckBox sms;
    private CheckBox email;
    private CheckBox fone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editNome);
        campoTelefone = findViewById(R.id.editTelefone);
        textoResultado = findViewById(R.id.textResultado);

        sms = (CheckBox) findViewById(R.id.sms);
        email = (CheckBox) findViewById(R.id.email);
        fone = (CheckBox) findViewById(R.id.fone);


    }

    public void  enviar(View view) {

        String nome = campoNome.getText().toString();
        String telefone = campoTelefone.getText().toString();


        textoResultado.setText("Nome: " + nome + "Telefone: " + telefone );
    }

    public void limpar(View view) {
        campoNome.setText("");
        campoTelefone.setText("");
    }




}

