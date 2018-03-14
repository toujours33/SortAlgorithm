package basicsort;

import cst.wyz.utils.ArrayOperation;

public class Test {

	public static void main(String[] args) {

		ArrayOperation<Integer> intUtil = new ArrayOperation<>();
		ArrayOperation<Character> charUtil = new ArrayOperation<>();

		// Integer[] test = new Integer[] { 1, 3, 2, 4, 6, 5, 8, 7, 2, 1, 0 };
		Integer[] test = new Integer[] { 6, 5, 3, 1, 8, 7, 2, 4 };
		intUtil.printArray(intUtil.arrayCopy(test), "未排序数组");

		BubbleSort<Integer> bubbleSort = new BubbleSort<>();
		Integer[] copy02 = intUtil.arrayCopy(test);
		bubbleSort.sort(copy02);
		intUtil.printArray(copy02, "冒泡排序：");

		SelectionSort<Integer> selectionSort = new SelectionSort<>();
		Integer[] copy01 = intUtil.arrayCopy(test);
		selectionSort.sort(copy01);
		intUtil.printArray(copy01, "选择排序：");

		InsertionSort<Integer> insertionSort = new InsertionSort<>();
		Integer[] copy03 = intUtil.arrayCopy(test);
		insertionSort.sort(copy03);
		intUtil.printArray(copy03, "插入排序：");

		ShellSort<Integer> shellSort = new ShellSort<>();
		Integer[] copy04 = intUtil.arrayCopy(test);
		shellSort.sort(copy04);
		intUtil.printArray(copy04, "希尔排序");

		MergeSort<Integer> mergeSort = new MergeSort<>();
		Integer[] copy05 = intUtil.arrayCopy(test);
		mergeSort.sort(copy05);
		intUtil.printArray(copy05, "归并排序；");

		QuickSort<Integer> quickSort = new QuickSort<>(new QuickSortOneWay<Integer>());
		Integer[] copy06 = intUtil.arrayCopy(test);
		quickSort.sort(copy06);
		intUtil.printArray(copy06, "单向快速排序：");

		QuickSort<Integer> quickSort2 = new QuickSort<>(new QuickSortTwoWay<Integer>());
		Integer[] copy07 = intUtil.arrayCopy(test);
		quickSort2.sort(copy07);
		intUtil.printArray(copy07, "双向快速排序：");
		
		Character[] charTest = new Character[] {'v','a','r','b','h','q','p','l','d'};
		charUtil.printArray(charTest, "未排序字符数组：");
		
		QuickSort<Character> quickSort3 = new QuickSort<>(new QuickSortOneWay<Character>());
		Character[] copy08 = charUtil.arrayCopy(charTest);
		quickSort3.sort(copy08);
		charUtil.printArray(copy08, "单向快速排序字符数组：");
		
	}

}
