package sorting;

public class InversionsCountsGFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 1, 3, 5 };
		System.out.println(inversionCount(arr));

	}

	static int inversionCount(int arr[]) {
		// Code Here
		int n = arr.length;
		return divide(arr, 0, n - 1);
	}

	private static int divide(int[] arr, int start, int end) {
		if (start >= end)
			return 0;
		int mid = start + ((end - start) / 2);
		int count = 0;

		count += divide(arr, start, mid);
		count += divide(arr, mid + 1, end);

		count += inversionCountAndMerge(arr, start, mid, end);
		return count;
	}

	private static int inversionCountAndMerge(int[] arr, int start, int mid, int end) {
		int n1 = mid - start + 1;
		int n2 = end - mid;
		int count = 0;
		int[] l = new int[n1];
		int[] r = new int[n2];

		for (int i = 0; i < n1; i++) {
			l[i] = arr[start + i];
		}
		for (int j = 0; j < n2; j++) {
			r[j] = arr[mid + 1 + j];
		}
		int i = 0, j = 0, k = start;
		while (i < n1 && j < n2) {
			if (l[i] <= r[j]) {
				arr[k] = l[i];
				i++;
			} else {
				arr[k] = r[j];
				count += n1-i;
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = l[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = r[j];
			j++;
			k++;
		}
		return count;
	}

}
