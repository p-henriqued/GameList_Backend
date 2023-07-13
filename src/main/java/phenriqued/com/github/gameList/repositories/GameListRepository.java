package phenriqued.com.github.gameList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import phenriqued.com.github.gameList.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
