package phenriqued.com.github.gameList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import phenriqued.com.github.gameList.dto.GameDTO;
import phenriqued.com.github.gameList.dto.GameMinDTO;
import phenriqued.com.github.gameList.entities.Game;
import phenriqued.com.github.gameList.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long id){
		return  gameRepository.searchByList(id).stream().map(x -> new GameMinDTO(x)).toList();
		
	}
}
