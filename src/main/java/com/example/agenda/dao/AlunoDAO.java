package com.example.agenda.dao;

import android.util.Log;

import com.example.agenda.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    private final static List<Aluno> alunos = new ArrayList<>();
    private static int contadorDeIds = 1;

    public void salva(Aluno aluno) {
        aluno.setId(contadorDeIds);
        alunos.add(aluno);
        contadorDeIds++;
    }

    public void edita(Aluno aluno) {
        Aluno alunoEncontrado = null;
        for (Aluno a : alunos) {
            if (a.getId() == aluno.getId()) {
                alunoEncontrado = a;
            }
            if (alunoEncontrado != null) {
                Log.i("alunoEncontrado", "Nome: " + alunoEncontrado.getId() + " Nome: " + alunoEncontrado.getNome());
                int posicaoDoAluno = alunos.indexOf(alunoEncontrado);
                Log.i("posicaoAluno", "posicao:" + posicaoDoAluno);
                alunos.set(posicaoDoAluno, aluno);
                // Se já encontrou e conseguiu editar, saio do for
                // Pois do contrário pode ocorrer Exceção de array index
                break;
            }
        }
    }


    public List<Aluno> todos() {
        return new ArrayList<>(alunos);
    }
}
