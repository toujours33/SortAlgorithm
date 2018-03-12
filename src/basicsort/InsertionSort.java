package basicsort;

import cst.wyz.utils.ArrayOperation;

public class InsertionSort <T extends Comparable<T>>{

	private ArrayOperation<T> utils = new ArrayOperation<>();
	
	public void sort(T[] t) {
		for (int i = 0; i < t.length; i++) {
			for(int j = i-1; j>=0;j--) {
				if(t[i].compareTo(t[j])<0) {
					utils.insertInnerArray(t, j, i);
					break;
				}
			}
		}
	}
	
}
