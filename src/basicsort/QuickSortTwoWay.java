package basicsort;

import cst.wyz.utils.ArrayOperation;

public class QuickSortTwoWay<T extends Comparable<T>> implements QuickSortStrategy<T>{

	@Override
	public void quickSort(T[] t, int begin, int end) {
		// TODO Auto-generated method stub
		
		if(begin>=end) {
			return ;
		}
		T pivot = t[begin];
		int left = begin+1;
		int right = end;
		while(left<=right) {
			while(left<=right && t[left].compareTo(pivot)<0) {
				left++;
			}
			while(left<=right && t[right].compareTo(pivot)>=0 ) {
				right--;
			}
			if(left > right)break;
			new ArrayOperation<T>().swapTwo(t, right, left);
		}
		new ArrayOperation<T>().swapTwo(t, right, begin);
		
		quickSort(t, begin, right-1);
		quickSort(t, right+1, end);
		
	}

}
