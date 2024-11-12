package com.estudo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
