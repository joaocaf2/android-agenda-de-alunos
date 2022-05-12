package com.example.agenda.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.agenda.R;
import com.example.agenda.model.Aluno;

public class FormularioAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);
        Button botaoSalvar = findViewById(R.id.activity_formulario_aluno_botao_salvar);
        EditText campoNome = findViewById(R.id.activity_formulario_aluno_nome);
        EditText campoTelefone = findViewById(R.id.activity_formulario_aluno_telefone);
        EditText campoEmail = findViewById(R.id.activity_formulario_aluno_email);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = campoNome.getText().toString();
                String telefone = campoTelefone.getText().toString();
                String email = campoEmail.getText().toString();
                Aluno alunoCriado = new Aluno(nome, telefone, email);
                Toast.makeText(FormularioAlunoActivity.this, alunoCriado.getNome()+" - "+alunoCriado.getTelefone()
                        +" - "+alunoCriado.getEmail(),Toast.LENGTH_LONG).show();
                System.out.print(alunoCriado.getEmail());

            }
        });
    }
}