package basicsort;

import cst.wyz.utils.ArrayOperation;

public class MergeSort<T extends Comparable<T>> {

	private ArrayOperation<T> utils = new ArrayOperation<>();

	public void sort(T[] t) {
		mergeSort(t, 0, t.length-1, utils.arrayCopy(t));

	}

	public void mergeSort(T[] t, int first, int last, T[] temp) {
		if (first < last) {
			int mid = (first + last) / 2;
			mergeSort(t, first, mid, temp);
			mergeSort(t, mid + 1, last, temp);
			mergeArray(t, first, mid, last, temp);
		}
	}
	
	public void mergeArray(T[] t,int first,int mid,int last,T[] temp) {
		int i = first,j = mid+1;
		int m = mid,n = last;
		int k = 0;
		while(i<=mid&&j<=n) {
			if(t[i].compareTo(t[j])<0)
				temp[k++] = t[i++];
			else
				temp[k++] = t[j++];
		}
		while(i<=m) {
			temp[k++] = t[i++];
		}
		while(j<=n) {
			temp[k++] = t[j++];
		}
		for (int k2 = 0; k2 < k; k2++) {
			t[first+k2] = temp[k2];
		}
	}

}
