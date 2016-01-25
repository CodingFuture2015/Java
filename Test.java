package sort;

public class Test {
	public static void main(String[] args) {
		int[] list = {10, 8, 9, 2, 4, 5, 6, 2, 4, 3};
//		SelectionSort.selectionSort(list);
//		InsertionSort.insertionSort(list);
//		BubbleSort.bubbleSort(list);
//		MergeSort.mergeSort(list);
		QuickSort.quickSort(list);
		printList(list);
	}
	
	public static void printList(int[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}
