package com.javalearning.oops;

import java.util.ArrayList;

public class BookRunnerObjComposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookObjComposition book = new BookObjComposition(1, "Programming Basics", "Ramesh");
		
		System.out.println(book);
		
		//ReviewsObjComposition review1 = new ReviewsObjComposition(10, "Good book", "4");
		
		//book.addReview(review1);
		
		book.addReview(new ReviewsObjComposition(11, "Great", "5"));
		
		
		System.out.println(book);

	}

}
