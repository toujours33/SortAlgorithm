package basicsort;

import cst.wyz.utils.ArrayOperation;

public class Test<T extends Comparable<T>> {
	
	public void test(T [] t) {
		ArrayOperation<T> util = new ArrayOperation<>();

		util.printArray(util.arrayCopy(t), "Œ¥≈≈–Ú ˝◊È");

		BubbleSort<T> bubbleSort = new BubbleSort<>();
		T[] copy02 = util.arrayCopy(t);
		bubbleSort.sort(copy02);
		util.printArray(copy02, "√∞≈›≈≈–Ú£∫");

		SelectionSort<T> selectionSort = new SelectionSort<>();
		T[] copy01 = util.arrayCopy(t);
		selectionSort.sort(copy01);
		util.printArray(copy01, "—°‘Ò≈≈–Ú£∫");

		InsertionSort<T> insertionSort = new InsertionSort<>();
		T[] copy03 = util.arrayCopy(t);
		insertionSort.sort(copy03);
		util.printArray(copy03, "≤Â»Î≈≈–Ú£∫");

		ShellSort<T> shellSort = new ShellSort<>();
		T[] copy04 = util.arrayCopy(t);
		shellSort.sort(copy04);
		util.printArray(copy04, "œ£∂˚≈≈–Ú");

		MergeSort<T> mergeSort = new MergeSort<>();
		T[] copy05 = util.arrayCopy(t);
		mergeSort.sort(copy05);
		util.printArray(copy05, "πÈ≤¢≈≈–Ú£ª");

		QuickSort<T> quickSort = new QuickSort<>(new QuickSortOneWay<T>());
		T[] copy06 = util.arrayCopy(t);
		quickSort.sort(copy06);
		util.printArray(copy06, "µ•œÚøÏÀŸ≈≈–Ú£∫");

		QuickSort<T> quickSort2 = new QuickSort<>(new QuickSortTwoWay<T>());
		T[] copy07 = util.arrayCopy(t);
		quickSort2.sort(copy07);
		util.printArray(copy07, "À´œÚøÏÀŸ≈≈–Ú£∫");
		
		HeapSort<T> heapSort = new HeapSort<>();
		T[] copy08 = util.arrayCopy(t);
		heapSort.sort(copy08);
		util.printArray(copy08, "∂—≈≈–Ú£∫");
		
		
	}


}
