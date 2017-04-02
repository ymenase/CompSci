package algo.sort;

import java.lang.reflect.Array;

public class App {

	public static void main(String[] args) {
		int[] array = { 8, 3, 5, 1, 9, 0 };
		Sort.insertionSort(array);
		display(array);

	}

	public static int[] display(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		return array;
	}

}
