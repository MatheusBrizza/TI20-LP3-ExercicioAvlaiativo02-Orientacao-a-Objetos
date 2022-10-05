package model;

import java.util.ArrayList;
import java.util.List;

public class CadastroTarefaImpl implements CadastroTarefa{

    private List<Tarefa> tarefas = new ArrayList<>();

    @Override
    public void add(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    @Override
    public void remove(Tarefa tarefa) {
        tarefas.remove(tarefa);
    }
}
