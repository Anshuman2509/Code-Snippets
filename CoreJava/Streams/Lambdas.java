package com.audi;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * There can be many intermediate operations but only one terminal operation.
 * The output of an intermediate operation is a stream.
 * The output of a terminal operation may vary such in case of reduce() it's int and forEach() its just iterates.
 * Functional Programming(Function as First Class Citizens)-
 *  1. Storing function in variables
 *  2. Passing function in methods
 *  3. Returning functions from methods 
 */

class CustomPredicate implements Predicate<Integer>{
	@Override
	public boolean test(Integer t) {
		return t%2==0;
	}
}
class CustomForEach implements Consumer<Integer>{
	@Override
	public void accept(Integer t) {
		System.out.print(t+" ");
	}
	
}
class CustomMap implements Function<Integer, Integer>{
	@Override
	public Integer apply(Integer t) {
		return t*10;
	}
}

public class Lambdas {
	public static void main(String[] args) {
		//FOR EACH
		List<Integer>integers =List.of(5,10,15,20);
		integers.stream().forEach(element->System.out.print(element+" "));
		System.out.println();
		
		//FILTER
		integers.stream().filter(element->element%2==0).forEach(element->System.out.print(element+" "));
		System.out.println();
		integers.stream().filter(element->element%2==1).forEach(element->System.out.print(element+" "));
		System.out.println();
		
		//REDUCE
		int sumTotal=integers.stream().reduce(0, (sum,element)->sum+element);
		System.out.println("SumTotal: "+sumTotal);
		int sumTotal1=integers.stream().reduce(10, (sum,element)->sum+element);
		System.out.println("Sum Total with initial 10: "+sumTotal1);
		int sumOfEven=integers.stream().filter(element->element%2==0).reduce(0, (sum,filteredElement)->sum+filteredElement);
		System.out.println("Sum Of Even numbers: "+sumOfEven);
		
		//SORTING
		List<Integer> integers2=List.of(255,220,260,50,158,98,63);
		integers2.stream().sorted().forEach(element->System.out.print(element+" "));
		System.out.println();
		
		//DISTINCT
		List<Integer> integers3=List.of(2,3,3,4,4,4,5,5);
		integers3.stream().distinct().forEach(element->System.out.print(element+" "));
		System.out.println();
		integers3.stream().distinct().sorted().forEach(element->System.out.print(element+" "));
		System.out.println();
		
		//MAP
		integers.stream().map(element->element*element).forEach(element->System.out.print(element+" "));
		System.out.println();
		List.of("AUDI","BMW","MERCEDES").stream().map(element->element.length()).forEach(element->System.out.print(element+" "));
		System.out.println();
		
		//INSTREAM
		IntStream.range(1, 11).forEach(element->System.out.print(element+" "));
		System.out.println();
		IntStream.range(1, 11).map(e->e*e).forEach(element->System.out.print(element+" "));
		System.out.println();
		
		//MAX
		List<Integer> integers4=List.of(23,12,34,53,20,9);
		int max=integers4.stream().max((a,b)->a-b).get();
		System.out.println("Max: "+max);
		
		//MIN
		int min=integers4.stream().min((a,b)->a-b).get();
		System.out.println("Min: "+min);
		
		//TOLIST
		List<Integer> integers5=integers4.stream().filter(e->e%2==0).collect(Collectors.toList());
		integers5.stream().forEach(element->System.out.print(element+" "));
		System.out.println();
		
		//BOXED
		System.out.println(IntStream.range(1, 10).map(e->e*2));//java.util.stream.IntPipeline$4@5b480cf9
		//To convert java.util.stream.IntPipeline$4@5b480cf9 into stream use boxed()
		List<Integer> integers6=IntStream.range(1, 10).map(e->e*10).boxed().collect(Collectors.toList());
		integers6.stream().forEach(element->System.out.print(element+" "));
		System.out.println();
		
		//PREDICATE CUSTOM IMPEMENTATION
		/* Internally compiler creates an implementation of the functional interface single abstract method as per the 
		 * login we pass e.g filter(element->element%2==0). In this case compiler creates an implemented class of Predicate
		 * functional interface and the logic is as mentioned in the argument that we have passed.
		*/
		List<Integer>integers7=List.of(5,10,15,20,25,30);
		integers7.stream().filter(new CustomPredicate()).forEach(element->System.out.print(element+" "));
		System.out.println();
		
		//CONSUMER CUSTOM IMPLEMENTATION
		integers7.stream().forEach(new CustomForEach());
		System.out.println();
		
		//FUNCTION CUSTOM IMPLEMENTATION
		integers7.stream().map(new CustomMap()).forEach(new CustomForEach());
		System.out.println();
		
		//FUNCTION
		Function<Integer, Integer> function=a->a*10;
		System.out.println(function.apply(5));
		
		//CONSUMER
		Consumer<Integer> consumer=a->System.out.println(a);
		consumer.accept(555);
		
		//PREDICATE
		Predicate<Integer> predicate=a->a%2==0;
		System.out.println(predicate.test(28));
		System.out.println(predicate.test(27));
		
		//STORING FUNCTION IN VARIABLES
		Predicate<Integer> predicate2=a->a%2==0;
		List.of(1,2,3,4,5,6).stream().filter(predicate2).forEach(e->System.out.print(e+" "));
		System.out.println();
		
		//PASSING FUNCTION IN METHODS
		List.of(1,2,3,4,5,6).stream().filter(a->a%2==0).forEach(e->System.out.print(e+" "));
		System.out.println();
		
		//RETURNING FUNCTIONS FROM METHODS
		List.of(1,2,3,4,5,6).stream().filter(isEven()).forEach(e->System.out.print(e+" "));
		System.out.println();
		
	}
	public static Predicate<Integer> isEven() {
		return a->a%2==0;
	}

}

