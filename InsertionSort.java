package sort;

public class InsertionSort {
	public static void insertionSort(int[] list) {
		for (int i = 1; i < list.length; i++) {
			int j, value = list[i];
			for (j = i - 1; j >= 0; j--) {
				if (list[j] > value) {
					list[j + 1] = list[j];
				}else {
					break;
				}
			}
			list[j + 1] = value;
		}
	}
}
