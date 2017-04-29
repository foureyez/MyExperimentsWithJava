package javaexp.practise.algo.sorting;

public class BubbleSort {
	public static void main(String args[]){
		int size = 200000000;
		int[] a = new int[size];
		int temp;
		for(int i=0;i<size;i++){
			a[i] = (int)(Math.random() * (Math.random() * 100));
		}
		
		for(int i=0;i<size;i++){
			for(int j =0; j<size-i-1; j++){
				if(a[j] > a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			System.out.print((int)((float)i/size)*100+"%\r");
		}
	}
}
