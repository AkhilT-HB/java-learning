package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CodingWithAmanStreamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Transaction> transactions = Arrays.asList(
				
				new Transaction("Grocery", 2500),
				new Transaction("Entertainment", 500),
				new Transaction("Grocery", 1500),
				new Transaction("Utilities", 1200),
				new Transaction("Utilities", 500),
				new Transaction("Entertainment", 1500)
				
				);
		
		//Use case 1: Calculate the total amount spent on groceries
		int totalAmount = transactions.stream()
										.filter(trans -> trans.getCategory().equals("Grocery"))
										.mapToInt(Transaction::getAmount)
										.sum();
		System.out.println("total Amount for Grocery is: "+totalAmount);
		
		//Use case 2: Find the average expense across all categories
		double averageAmount = transactions.stream().mapToDouble(Transaction::getAmount).average().orElse(0.0);
		System.out.println("Avg amount across all categories: "+averageAmount);
		
		
		
		Stream<Product> products = Stream.of(
					new Product("Laptop", "Electronics", 1000),
					new Product("TV", "Electronics", 1500),
					new Product("Sofa", "Furniture", 700),
					new Product("Table", "Furniture", 300),
					new Product("Lamp", "Home Decor", 50)
				);
		
		//Use case 1: Total price of the products grouped by their category
		Map<String, Integer> map = products
									.collect(Collectors.groupingBy(
											Product::getCategory,
											Collectors.summingInt(Product::getPrice)
											));
							
		System.out.println(map);
}
}
