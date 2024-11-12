package com.estudo.dslist.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.estudo.dslist.dto.GameListDTO;
import com.estudo.dslist.entities.GameList;
import com.estudo.dslist.repositories.GameListRepository;

@Service //ou @Component
public class GameListService {
    
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
            List<GameList> result = gameListRepository.findAll();
            List<GameListDTO> dto = result.stream().map(e -> new GameListDTO(e)).toList();
            return dto;
    }

}
