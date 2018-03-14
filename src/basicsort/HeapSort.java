package basicsort;
/**
 * 堆排序，二叉堆，大顶堆->父节点总是大于或等于子节点；小顶堆->父节点总是小于或等于子节点
 * 排序思想：递归排序
 * 递归构建大顶堆或小顶堆，交换根节点和尾节点，输出尾节点，重新构建大顶堆或小顶堆
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
