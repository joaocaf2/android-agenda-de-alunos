package com.example.agenda;

import android.app.Application;

import com.example.agenda.dao.AlunoDAO;
import com.example.agenda.model.Aluno;

public class AgendaApplication extends Application {
    private final AlunoDAO dao = new AlunoDAO();

    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosDeTeste();
    }
    private void criaAlunosDeTeste() {
        dao.salva(new Aluno("Joao", "15981857694", "joao@hotmail.com"));
        dao.salva(new Aluno("Lucas", "1598344657", "lucas@hotmail.com"));
        dao.salva(new Aluno("Maria", "15994673827", "maria@hotmail.com"));
    }
}
