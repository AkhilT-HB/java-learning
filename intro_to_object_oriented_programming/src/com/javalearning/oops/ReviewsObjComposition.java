package com.javalearning.oops;

public class ReviewsObjComposition {
	
	//state
	private int id;
	private String description;
	private String rating;
	
	//creation
	public ReviewsObjComposition(int id, String description, String rating) {
		super();
		this.id = id;
		this.description = description;
		this.rating = rating;
	}
	
	//Operations
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public String toString() {
		return String.format("Id - %d, Description - %s, Rating - %s", id,description,rating);
	}
	
	
	

}
