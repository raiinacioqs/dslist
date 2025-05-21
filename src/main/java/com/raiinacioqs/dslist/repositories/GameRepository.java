package com.raiinacioqs.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raiinacioqs.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

    
}