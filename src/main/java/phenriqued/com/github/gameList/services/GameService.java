package phenriqued.com.github.gameList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import phenriqued.com.github.gameList.dto.GameMinDTO;
import phenriqued.com.github.gameList.entities.Game;
import phenriqued.com.github.gameList.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
