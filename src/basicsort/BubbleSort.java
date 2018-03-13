package basicsort;

import cst.wyz.utils.ArrayOperation;

/**
 * ð������ʱ�临�Ӷ�O(n^2),�ռ临�Ӷ�O(1)
 * 
 * @author Jerry
 *
 * @param <T>
 *            ʵ�� Comparable �ӿڣ��������в��� compareTo ����
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
