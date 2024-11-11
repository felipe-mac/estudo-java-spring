package com.estudo.dslist.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudo.dslist.dto.GameMinDTO;
import com.estudo.dslist.entities.Game;
import com.estudo.dslist.repositories.GameRepository;

@Service //ou @Component
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
            List<Game> result = gameRepository.findAll();
            List<GameMinDTO> dto = result.stream().map(e -> new GameMinDTO(e)).toList();
            return dto;
    }
}
