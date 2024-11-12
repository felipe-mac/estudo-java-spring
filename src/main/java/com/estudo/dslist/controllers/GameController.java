package com.estudo.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.dslist.dto.GameDTO;
import com.estudo.dslist.dto.GameMinDTO;
import com.estudo.dslist.servicies.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping    
    public List<GameMinDTO> findAll() {
        return gameService.findAll();
    }

    @GetMapping(value = "/{id}")    
    public GameDTO findById(@PathVariable Long id) {
        return gameService.findById(id);
    }
    
}
