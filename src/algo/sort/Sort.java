package algo.sort;

public class Sort {
	public static int[] insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int element = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > element) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = element;
		}
		return a;

	}

}
