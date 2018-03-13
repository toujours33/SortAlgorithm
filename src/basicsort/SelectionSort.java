package basicsort;

import cst.wyz.utils.ArrayOperation;

public class SelectionSort<T extends Comparable<T>> {
	
	private ArrayOperation<T> util = new ArrayOperation<>();

	public void sort(T[] t) {
		for (int i = 0; i < t.length - 1; i++) {
			int position = i;
			for(int j = i;j<t.length;j++) {
				if(t[j].compareTo(t[position])<0) {
					position = j;
				}
			}
			util.swapTwo(t, i, position);
		}
	}

}
