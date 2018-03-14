package basicsort;
/**
 * �����򣬶���ѣ��󶥶�->���ڵ����Ǵ��ڻ�����ӽڵ㣻С����->���ڵ�����С�ڻ�����ӽڵ�
 * ����˼�룺�ݹ�����
 * �ݹ鹹���󶥶ѻ�С���ѣ��������ڵ��β�ڵ㣬���β�ڵ㣬���¹����󶥶ѻ�С����
 * @author Jerry
 *
 */

import cst.wyz.utils.ArrayOperation;

public class HeapSort<T extends Comparable<T>> {

	ArrayOperation<T> util = new ArrayOperation<>();

	public void sort(T[] t) {
		heapMax(t, 0, t.length - 1);
	}

	public void heapMax(T[] t, int begin, int end) {
		if (begin >= end)
			return;
		for (int i = (end - begin + 1) / 2 - 1; i >= 0; i--) {
			if ((2 * i + 2) < end && t[i].compareTo(t[2 * i + 2]) < 0)
				util.swapTwo(t, i, 2 * i + 2);
			if (t[i].compareTo(t[2 * i + 1]) < 0)
				util.swapTwo(t, i, 2 * i + 1);
		}
		util.swapTwo(t, begin, end);
		heapMax(t, begin, end - 1);
	}

}
