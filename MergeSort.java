package sort;

public class MergeSort {
	public static void mergeSort(int[] list) {
		int length = list.length;
		if (length <= 1) {
			return;
		}
		int[] firstHalf = new int[length / 2];
		System.arraycopy(list, 0, firstHalf, 0, firstHalf.length);
		mergeSort(firstHalf);
		int[] secondHalf = new int[length - length / 2];
		System.arraycopy(list, length / 2, secondHalf, 0, secondHalf.length);
		mergeSort(secondHalf);
		
		int[] tmp = mergeSort(firstHalf, secondHalf);
		System.arraycopy(tmp, 0, list, 0, tmp.length);
	}
	public static int[] mergeSort(int[] list1, int[] list2) {
		int[] tmp = new int[list1.length + list2.length];
		int index1 = 0;
		int index2 = 0;
		int index = 0;
		while (index1 < list1.length && index2 < list2.length) {
			if (list1[index1] > list2[index2]) {
				tmp[index++] = list2[index2++];
			}else {
				tmp[index++] = list1[index1++];
			}
		}
		while (index1 < list1.length) {
			tmp[index++] = list1[index1++];
		}
		while (index2 < list2.length) {
			tmp[index++] = list2[index2++];
		}
		return tmp;
	}
}
