package phenriqued.com.github.gameList.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import phenriqued.com.github.gameList.entities.Game;
import phenriqued.com.github.gameList.projections.GameMinProjection;

public interface GameRepository extends JpaRepository<Game, Long>{
	
	@Query(nativeQuery = true, value = """
			SELECT tb_game.id, tb_game.title, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
			tb_game.short_description AS shortDescription, tb_belonging.position
			FROM tb_game
			INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
			WHERE tb_belonging.list_id = :listId
			ORDER BY tb_belonging.position
				""")
	List<GameMinProjection> searchByList(Long listId);
	
	/*
	@Query(nativeQuery = false, value = """
			SELECT g.id, g.title, g.year AS game_year, g.imgUrl AS imgUrl, g.shortDescription AS shortDescription, b.position
			FROM Game g
			JOIN Belonging b ON g.id = b.id.game.id
			WHERE b.id = :listId
			ORDER BY b.position
			""")
	List<GameMinProjection> searchByList(Long listId);
	*/
}
