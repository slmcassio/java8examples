package java8examples;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 3, 4, 1, 2);

		// Comparator<Integer> comparator = (number1, number2) -> number2 - number1;
		// Consumer<Integer> consumer = number -> System.out.println(number);
		// Consumer<Integer> consumer = System.out::println;

		numbers.sort((number1, number2) -> number2 - number1);
		numbers.forEach(System.out::println);
	}
}
