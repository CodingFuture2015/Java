package sort;

public class QuickSort {
	public static void quickSort(int[] list) {
		quickSort(list, 0, list.length);
	}
	public static void quickSort(int[] list, int start, int end) {
		if (start < end) {
			int index = splitIndex(list, start, end);
			quickSort(list, start, index);
			quickSort(list, index + 1, end);
		}
	}
	public static int splitIndex(int[] list, int start, int end) {
		int pivot = list[0];
		int high = end - 1;
		int low = start + 1;
		while (high >= low) {
			if (list[low] > pivot && list[high] <= pivot) {
				int tmp = list[low];
				list[low] = list[high];
				list[high] = tmp;
			}
			if (list[low] <= pivot) {
				low++;
			}
			if (list[high] > pivot) {
				high--;
			}
		}
		while (high > start && list[high] >= pivot) 
			high--;
		if (pivot > list[high]) {
			list[start] = list[high];
			list[high] = pivot;
			return high;
		}
		return start;
	}
}
