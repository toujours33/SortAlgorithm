package basicsort;

public class QuickSort <T extends Comparable<T>>{

	private QuickSortStrategy<T> strategy;
	
	public QuickSort(QuickSortStrategy<T> strategy) {
		// TODO Auto-generated constructor stub
		this.strategy = strategy;
	}
	
	public void sort(T[] t) {
		strategy.quickSort(t, 0, t.length-1);
	}
	
//	public void quickSortOneWay(T[] t,int begin,int end) {
//		if(begin >= end) {
//			return ;
//		}
//		int i = begin,j = end,index = begin;
//		while(i<j) {
//			if(index == i) {
//				if(t[j--].compareTo(t[i])<0) {
//					util.swapTwo(t, j+1, i);
//					index = j+1;continue;
//				}
//			}
//			if(index == j) {
//				if(t[i++].compareTo(t[j])>0) {
//					util.swapTwo(t, i-1, j);
//					index = i-1;continue;
//				}
//			}
//		}
//		quickSortOneWay(t, begin, index-1);
//		quickSortOneWay(t, index+1, end);
//	}
	
}
