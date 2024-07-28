package com.javalearning.oops;

import java.util.ArrayList;

public class BookObjComposition {
	//state
	private int id;
	private String name;
	private String author;
	private ArrayList<ReviewsObjComposition> reviews = new ArrayList<>( );
	
	//creation
	public BookObjComposition(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}

	//operations
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public ArrayList<ReviewsObjComposition> getReviews() {
		return reviews;
	}

	public void addReview(ReviewsObjComposition review) {
		reviews.add(review);
	}

	@Override
	public String toString() {
		return "BookObjComposition [id=" + id + ", name=" + name + ", author=" + author + ", reviews=" + reviews + "]";
	}
	
	
	
	
	
}
