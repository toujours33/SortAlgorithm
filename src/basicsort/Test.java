package basicsort;

import cst.wyz.utils.ArrayOperation;

public class Test {

	public static void main(String[] args) {
		
		ArrayOperation<Integer> intUtil = new ArrayOperation<>();

		Integer[] test = new Integer[] { 1, 3, 2, 4, 6, 5 };
		intUtil.printArray(intUtil.arrayCopy(test),"Œ¥≈≈–Ú ˝◊È");

		BubbleSort<Integer> bubbleSort = new BubbleSort<>();
		Integer[] copy02 = intUtil.arrayCopy(test);
		bubbleSort.sort(copy02);
		intUtil.printArray(copy02, "√∞≈›≈≈–Ú£∫");
		 
		SelectionSort<Integer> selectionSort = new SelectionSort<>();
		Integer[] copy01 = intUtil.arrayCopy(test);
		selectionSort.sort(copy01);
		intUtil.printArray(copy01, "—°‘Ò≈≈–Ú£∫");
		
		InsertionSort<Integer> insertionSort = new InsertionSort<>();
		Integer[] copy03 = intUtil.arrayCopy(test);
		insertionSort.sort(copy03);
		intUtil.printArray(copy03, "≤Â»Î≈≈–Ú£∫");
	}

}
