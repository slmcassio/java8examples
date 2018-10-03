package java8examples;

import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

public class Streams {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 3, 4, 1, 2);

		// Comparator<Integer> comparator = (number1, number2) -> number2 - number1;
		// Consumer<Integer> consumer = number -> System.out.println(number);
		// Consumer<Integer> consumer = System.out::println;

		List<Integer> newNumbers = numbers.stream()
			.sorted(reverseOrder())
			.map(number -> veryComplexCalculus(number))
			.filter(number -> number > 0)
			.collect(toList());
		
		System.out.println(numbers);
		System.out.println(newNumbers);
	}
	
	public static Integer veryComplexCalculus(Integer number) {
		return number -1;
	}
}
