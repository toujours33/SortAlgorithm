package basicsort;

public interface QuickSortStrategy<T extends Comparable<T>> {
	public void quickSort(T[] t,int begin,int end);
	
}
