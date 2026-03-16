package com.fplumara.dam1.superheroes.repository.impl.memory;

import com.fplumara.dam1.superheroes.model.Superheroe;
import com.fplumara.dam1.superheroes.repository.SuperheroeRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class SuperheroeRepositoryInMemory implements SuperheroeRepository {

    Map<String, Superheroe> superheroeMap = new HashMap<>();


    @Override
    public void save(Superheroe superheroe) {
        superheroeMap.put(superheroe.getId(), superheroe);
    }

    @Override
    public Superheroe findById(String id) {
        return superheroeMap.get(id);
    }

    @Override
    public Optional<Superheroe> findByName(String nombre) {
        return superheroeMap.values().stream().filter(x ->x.getNombre().equals(nombre)).findAny();
    }

    @Override
    public Optional<Superheroe> findByApodo(String apodo){
        return superheroeMap.values().stream().filter(x ->x.getNombre().equals(apodo)).findAny();
    }

    @Override
    public List<Superheroe> findAll() {
        return superheroeMap.values().stream().toList();
    }


}
