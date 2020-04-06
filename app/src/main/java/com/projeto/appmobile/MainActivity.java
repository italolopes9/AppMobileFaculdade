package com.projeto.appmobile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText campoNome;
    private TextInputEditText campoTelefone;

    private CheckBox sms;
    private CheckBox email;
    private CheckBox fone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editNome);
        campoTelefone = findViewById(R.id.editTelefone);

        sms = (CheckBox) findViewById(R.id.sms);
        email = (CheckBox) findViewById(R.id.email);
        fone = (CheckBox) findViewById(R.id.fone);
    }

    @Override
    public void onClick(View view) {
        String nome = campoNome.getText().toString();
        String telefone = campoTelefone.getText().toString();

        String mensagem = "Nome: " + nome + "\nTelefone: " + telefone + "\nA forma de contato marcada foi: ";
        if (sms.isChecked())
            mensagem += " SMS ";
        if (email.isChecked())
            mensagem += " Email ";
        if (fone.isChecked())
            mensagem += " Telefone ";
        AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
        dlg.setMessage(mensagem);
        dlg.setNeutralButton("OK", null);
        dlg.show();
    }


    public void limpar(View view) {
        campoNome.setText("");
        campoTelefone.setText("");
    }






}

