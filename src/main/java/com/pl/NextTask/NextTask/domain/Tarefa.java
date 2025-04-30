package com.pl.NextTask.NextTask.domain;

import com.pl.NextTask.NextTask.domain.enums.Prioridade;
import com.pl.NextTask.NextTask.domain.enums.Status;

import java.time.LocalDateTime;

public class Tarefa {
    private Long id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataCriacao;
    private Status status;
    private Prioridade prioridade;
    private Usuario usuario;


}

