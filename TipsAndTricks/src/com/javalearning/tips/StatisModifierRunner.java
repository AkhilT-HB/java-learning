package com.javalearning.tips;

class Player{
	
	private String name;
	private static int count;
	
	public Player(String name) {
		super();
		this.name = name;
		count++;
	}

	public int getCount() {
		return count;
	}
	
	
	
	
}

public class StatisModifierRunner {

	public static void main(String[] args) {
		
		Player player1 = new Player("Ronaldo");
		System.out.println(player1.getCount());
		
		Player player2 = new Player("Messi");
		System.out.println(player2.getCount());

	}

}
