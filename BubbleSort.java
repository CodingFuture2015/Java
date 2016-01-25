package sort;

public class BubbleSort {
	public static void bubbleSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = 0; j < list.length - i - 1; j++) {
				int tmp;
				if (list[j] > list[j + 1]) {
					tmp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = tmp;
				}
			}
		}
	}
}
