package com.projeto.appmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;


public class MainActivity extends AppCompatActivity {
    private EditText campoNome;
    private TextInputEditText campoTelefone;
    private TextView textoResultado;

    private CheckBox sms;
    private CheckBox email;
    private CheckBox fone;

    private RadioButton sexoMasculino;
    private RadioButton sexoFeminino;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editNome);
        campoTelefone = findViewById(R.id.editTelefone);
        textoResultado = findViewById(R.id.textResultado);

        sms = findViewById(R.id.sms);
        email = findViewById(R.id.email);
        fone =  findViewById(R.id.fone);

        sexoMasculino = findViewById(R.id.radioMasculino);
        sexoFeminino = findViewById(R.id.radioFeminino);

    }

    public void checkbox() {
        String texto = "";

        if(sms.isChecked()){
            texto = "SMS - ";
        }
        if(email.isChecked()){
            texto = texto + "EMAIL - ";
        }
        if(fone.isChecked()){
            texto = texto + "TELEFONE - ";
        }

        textoResultado.setText(texto);
    }

    public void radioButton(){
        if(sexoMasculino.isChecked()){
            textoResultado.setText("Masculino");
        } else if(sexoFeminino.isChecked()){
            textoResultado.setText("Feminino");
        }
    }

    public void enviar(View view) {
        radioButton();


//        checkbox();

//        String nome =  campoNome.getText().toString();
//        String telefone = campoTelefone.getText().toString();
//
//        textoResultado.setText("Nome: " + nome + "\nTelefone: " + telefone);


    }

    public void limpar(View view) {
        campoNome.setText("");
        campoTelefone.setText("");
    }






}

