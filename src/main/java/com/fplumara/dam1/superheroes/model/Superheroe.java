package com.fplumara.dam1.superheroes.model;

public class Superheroe {

    private String id;
    private String nombre;
    private String apodo;
    private Franquicia franquicia;
    private Integer anioDebut;





    public Superheroe(String id, String nombre, String apodo, Franquicia franquicia, Integer anioDebut) {
        this.id = id;
        this.nombre = nombre;
        this.apodo = apodo;
        this.franquicia = franquicia;
        this.anioDebut = anioDebut;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Franquicia getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(Franquicia franquicia) {
        this.franquicia = franquicia;
    }

    public Integer getAnioDebut() {
        return anioDebut;
    }

    public void setAnioDebut(Integer anioDebut) {
        this.anioDebut = anioDebut;
    }
}
