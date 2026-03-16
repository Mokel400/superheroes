package com.fplumara.dam1.superheroes.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Superheroe {




    private String id;
    private String nombre;
    private String apodo;
    private Franquicia franquicia;
    private Integer anioDebut;

}
