package ����;

import java.util.Arrays;



public class sort���� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		/*double[] numbers= {6.0,4.4,1.9,2.9,3.4,3.5};
		java.util.Arrays.sort(numbers);
		System.out.println(java.util.Arrays.toString(numbers));*/
		

		double[] numbers= {6.0,4.4,1.9,2.9,3.4,3.5};
		java.util.Arrays.parallelSort(numbers);
		System.out.println(java.util.Arrays.toString(numbers));
	}
}