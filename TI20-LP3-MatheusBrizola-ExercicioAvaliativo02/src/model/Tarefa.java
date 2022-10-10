package model;

import java.time.LocalDateTime;

public class Tarefa {

    String descricao;
    LocalDateTime data;
    TipoTarefaEnum tipoTarefa;
    Situacao situacao;

    public String getDescricao() {
        return descricao;
    }

    protected void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    protected void setData(LocalDateTime data) {
        this.data = data;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    protected void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public TipoTarefaEnum getTipoTarefa() {
        return tipoTarefa;
    }

    protected void setTipoTarefa(TipoTarefaEnum tipoTarefa) {
        this.tipoTarefa = tipoTarefa;
    }
}
