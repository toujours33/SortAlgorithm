package basicsort;

import java.util.ArrayList;
import java.util.List;

import cst.wyz.utils.ArrayOperation;

public class ShellSort<T extends Comparable<T>> {
	
	private ArrayOperation<T> utils = new ArrayOperation<>();

	public List<Integer> hibbard(int length) {
		List<Integer> gaps = new ArrayList<>();
		for (int i = 1; i < length / 2;) {
			gaps.add(i);
			i = (int)Math.pow(2, i)+ 1;
		}
		return gaps;
	}

	public void sort(T[] t) {
		List<Integer> gaps = hibbard(t.length);
		for (int i = gaps.size() - 1; i >= 0; i--) {
			sortGap(t, gaps.get(i));
		}
	}

	public void sortGap(T[] t, int gap) {
		for (int i = 0; i < gap; i++) {
			sortGroup(t, i, gap);
		}
	}
	
	public void sortGroup(T[] t,int head,int gap) {
		for(int i = head;i<t.length;i+=gap) {
			for(int j = head;j<i;j+=gap) {
				if(t[i].compareTo(t[j])<0) {
					utils.swapTwo(t, j, i);
				}
			}
		}
	}

}
