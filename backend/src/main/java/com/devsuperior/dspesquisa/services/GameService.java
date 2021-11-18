package com.devsuperior.dspesquisa.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dspesquisa.dto.GameDTO;
import com.devsuperior.dspesquisa.entities.Game;
import com.devsuperior.dspesquisa.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly = true)
	public List<GameDTO> findAll(){
		List<Game> list = repository.findAll();
		List<GameDTO> listdto = new ArrayList<>();
		for(Game c : list) {
		   listdto.add(new GameDTO(c));
		}
		return listdto;
	}
}
