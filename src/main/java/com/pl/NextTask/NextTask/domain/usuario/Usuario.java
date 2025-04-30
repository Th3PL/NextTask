package com.pl.NextTask.NextTask.domain.usuario;


import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String senha;

    @Enumerated(EnumType.STRING)
    private Role role;
}
