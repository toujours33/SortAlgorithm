package basicsort;

import cst.wyz.utils.ArrayOperation;

/**
 * 冒泡排序，时间复杂度O(n^2),空间复杂度O(1)
 * 
 * @author Jerry
 *
 * @param <T>
 *            实现 Comparable 接口，在排序中采用 compareTo 方法
 */
public class BubbleSort<T extends Comparable<T>> {

	private ArrayOperation<T> util = new ArrayOperation<>();

	public void sort(T[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					util.swapTwo(array, j, j + 1);
				}
			}
		}
	}


}
