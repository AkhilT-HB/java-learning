package com.javalearning.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class EvenNumberPredicate implements Predicate<Integer>{

	@Override
	public boolean test(Integer number) {
		return number%2==0;
	}
	
}

class ForEachAnalysis implements Consumer<Integer>{

	@Override
	public void accept(Integer number) {
		System.out.println("number is "+number);
		
	}
	
}

class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer num) {
		return num * num;
	}
	
}

public class LambdaBehindTheScreens {

	public static void main(String[] args) {
		
		
		List.of(23,43,34,45,36,48).stream()
							.filter(n -> n%2==0)
							.map(n -> n*n)
							.forEach(e -> System.out.println(e));
		
//		List.of(23,43,34,45,36,48).stream()
//		.filter(new EvenNumberPredicate())
//		.forEach(e -> System.out.println(e));
		
		List.of(23,43,34,45,36,48).stream()
		.filter(n -> n%2==0)
		.map(new NumberSquareMapper())
		.forEach(new ForEachAnalysis());
		
	}

}


//Stream<T> filter(Predicate<? super T> predicate);
// boolean test(T t);

//void forEach(Consumer<? super T> action);
// void accept(T t);

//<R> Stream<R> map(Function<? super T, ? extends R> mapper);
//R apply(T t);