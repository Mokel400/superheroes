package com.fplumara.dam1.superheroes.service;

import com.fplumara.dam1.superheroes.model.Franquicia;
import com.fplumara.dam1.superheroes.model.Superheroe;
import com.fplumara.dam1.superheroes.repository.impl.memory.SuperheroeRepositoryInMemory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.UUID;

@Service
public class SuperheroeService {

    private SuperheroeRepositoryInMemory superheroeRepo;



    public Superheroe crearSuperheroe(String nombre, String apodo, Franquicia franquicia, Integer anioDebut){
        if (nombre == null | apodo == null | anioDebut == null){
            throw new IllegalArgumentException("Datos vacios");
        }
        if (nombre.length() < 3 | apodo.length() < 3){
            throw new IllegalArgumentException("El nombre y apodo deben tener al menos 3 letras");
        }
        if (anioDebut < 1935 | anioDebut > 2026){
            throw new IllegalArgumentException("El año de debut debe estar entre 1935 y 2026");
        }

        return new Superheroe(UUID.randomUUID().toString(), nombre, apodo, franquicia, anioDebut);
    }

    public void borrarSuperheroe(String id){
        if (id == null | !superheroeRepo.getMap().containsKey(id)){
            throw new IllegalArgumentException("El id buscado no existe");
        }
        Superheroe s = superheroeRepo.findById(id);
        superheroeRepo.getMap().remove(id);
    }

    public Superheroe modificarSuperheroe(String id, String nombre, String apodo, Franquicia franquicia, Integer anioDebut){
        if (nombre.length() < 3 | apodo.length() < 3){
            throw new IllegalArgumentException("El nombre y apodo deben tener al menos 3 letras");
        }
        if (anioDebut < 1935 | anioDebut > 2026){
            throw new IllegalArgumentException("El año de debut debe estar entre 1935 y 2026");
        }
        Superheroe s = superheroeRepo.findById(id);
        s.setNombre(nombre);
        s.setApodo(apodo);
        s.setFranquicia(franquicia);
        s.setAnioDebut(anioDebut);
        return s;
    }





}
