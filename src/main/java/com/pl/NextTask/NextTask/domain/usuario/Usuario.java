package com.pl.NextTask.NextTask.domain.usuario;


import com.pl.NextTask.NextTask.domain.categoria.Categoria;
import com.pl.NextTask.NextTask.domain.tarefa.Tarefa;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String senha;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "usuario")
    private List<Tarefa> tarefas;

    @OneToMany(mappedBy = "usuario")
    private List<Categoria> categorias;


}
