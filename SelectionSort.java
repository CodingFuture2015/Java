package sort;

public class SelectionSort {
	public static void selectionSort(int[] list) {
		int index, min;
		for (int i = 0; i < list.length; i++) {
			index = i;
			min = list[i];
			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < min) {
					min = list[j];
					index = j;
				}
			}
			if (index != i) {
				list[index] = list[i];
				list[i] = min;
			}
		}
	}
}
