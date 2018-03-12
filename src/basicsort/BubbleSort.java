package basicsort;

import cst.wyz.utils.ArrayOperation;

/**
 * ð������ʱ�临�Ӷ�O(n^2),�ռ临�Ӷ�O(1)
 * @author Jerry
 *
 * @param <T> ʵ�� Comparable �ӿڣ��������в��� compareTo ����
 */
public class BubbleSort <T extends Comparable<T>>{
	
	private ArrayOperation<T> util = new ArrayOperation<>();
	
	public ArrayOperation<T> getUtil() {
		return util;
	}

	public void sort(T[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i; j < array.length - 1; j++) {
				if(array[j].compareTo(array[j+1])>0) {
					util.swapTwo(array, j, j+1);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		BubbleSort<Integer> bubbleSort = new BubbleSort<>();
		Integer [] test = new Integer[] {1,3,2,4,7,6};
		bubbleSort.getUtil().printArray(test);
		bubbleSort.sort(test);
		bubbleSort.getUtil().printArray(test);
	}

}
