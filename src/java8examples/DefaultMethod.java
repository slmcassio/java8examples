package java8examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethod {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 3, 4, 1, 2);

		numbers.sort(new InverseOrder());

		numbers.forEach(new WriteToConsole());
	}

	static class InverseOrder implements Comparator<Integer> {

		@Override
		public int compare(Integer number1, Integer number2) {
			return number2 - number1;
		}
	}

	static class WriteToConsole implements Consumer<Integer> {

		@Override
		public void accept(Integer number) {
			System.out.println(number);
		}
	}
}
