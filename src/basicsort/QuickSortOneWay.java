package basicsort;

import cst.wyz.utils.ArrayOperation;

public class QuickSortOneWay<T extends Comparable<T>> implements QuickSortStrategy<T>{

	@Override
	public void quickSort(T[] t, int begin, int end) {
		// TODO Auto-generated method stub
		if(begin >= end) {
			return ;
		}
		int i = begin,j = end,index = begin;
		while(i<j) {
			if(index == i) {
				if(t[j].compareTo(t[i])<0) {
					new ArrayOperation<T>().swapTwo(t, j, i);
					index = j;continue;
				}
				else
					j--;
			}
			if(index == j) {
				if(t[i].compareTo(t[j])>0) {
					new ArrayOperation<T>().swapTwo(t, i, j);
					index = i;continue;
				}
				else
					i++;
			}
		}
		quickSort(t, begin, index-1);
		quickSort(t, index+1, end);
	}

}
