package com.fabriciofa.movieflix.dto;

import java.util.ArrayList;
import java.util.List;

import com.fabriciofa.movieflix.entities.Movie;

public class MovieDTO {

	private Long id;
	private String title;
	private String subtitle;
	private Integer year;
	private String imgUrl;
	private String synopsis;
	
	private Long genreId;
	
	private List<ReviewDTO> reviews = new ArrayList<>();

	public MovieDTO() {
	
	}

	public MovieDTO(Long id, String title, String subtitle, Integer year, String imgUrl, String synopsis,
			Long genreId) {
		this.id = id;
		this.title = title;
		this.subtitle = subtitle;
		this.year = year;
		this.imgUrl = imgUrl;
		this.synopsis = synopsis;
		this.genreId = genreId;
	}

	public MovieDTO(Movie entity) {
		id = entity.getId();
		title = entity.getTitle();
		subtitle = entity.getSubTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		synopsis = entity.getSynopsis();
		genreId = entity.getGenre().getId();
		entity.getReviews().forEach(review -> reviews.add(new ReviewDTO(review)));;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Long getGenreId() {
		return genreId;
	}

	public void setGenreId(Long genreId) {
		this.genreId = genreId;
	}

	public List<ReviewDTO> getReviews() {
		return reviews;
	}
}
