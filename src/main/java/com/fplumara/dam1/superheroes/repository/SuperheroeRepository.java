package com.fplumara.dam1.superheroes.repository;

import com.fplumara.dam1.superheroes.model.Superheroe;

import java.util.List;
import java.util.Optional;

public interface SuperheroeRepository {

    public void save(Superheroe superheroe);

    public Superheroe findById(String id);

    public Optional<Superheroe> findByName(String name);

    public Optional<Superheroe> findByApodo(String apodo);

    public List<Superheroe> findAll();


}
