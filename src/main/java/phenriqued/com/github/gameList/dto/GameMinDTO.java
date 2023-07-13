package phenriqued.com.github.gameList.dto;

import phenriqued.com.github.gameList.entities.Game;
import phenriqued.com.github.gameList.projections.GameMinProjection;

public class GameMinDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {}

	public GameMinDTO(Game entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
	}
	
	public GameMinDTO(GameMinProjection gameMinProjection) {
		this.id = gameMinProjection.getId();
		this.title = gameMinProjection.getTitle();
		this.year = gameMinProjection.getYear();
		this.imgUrl = gameMinProjection.getImgUrl();
		this.shortDescription = gameMinProjection.getShortDescription();
	}
	
	
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public Integer getYear() {
		return year;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	
	
	
	
}
