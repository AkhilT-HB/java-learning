package com.javalearning.oops;

public class Rectangle {
	
	//state
	private int length;
	private int width;
	
	//creation
	public Rectangle(int length, int width) {
		this.length=length;
		this.width=width;
	}
	
	//behaviour or operations
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setLength(int length) {
		this.length=length;
	}
	
	public void setWidth(int width) {
		this.width=width;
	}
	
	public int getArea() {
		return length*width;
	}
	
	public int getPerimeter() {
		return (2*(length+width));
	}
	
	
	//toString
	public String toString() {
		return String.format("Length is %d, width is %d", length, width);
	}
}
