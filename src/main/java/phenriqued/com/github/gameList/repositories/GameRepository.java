package phenriqued.com.github.gameList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import phenriqued.com.github.gameList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
