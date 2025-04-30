package com.pl.NextTask.NextTask.domain.categoria;

import com.pl.NextTask.NextTask.domain.tarefa.Tarefa;
import com.pl.NextTask.NextTask.domain.usuario.Usuario;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Categoria {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String cor;
    private Usuario usuario;
    private Tarefa tarefa;
}
