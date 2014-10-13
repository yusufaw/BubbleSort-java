package buble;

/**
 * @author Yusuf Aji Wibowo
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int A[]={4,35,64,6,3,7,55,4,23,1,9};
		bubbleSort(A);
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");
		}
		//System.out.print(A);
	}
	public static void bubbleSort(int list[]){
		boolean neenNextPass = true;
		for (int i = 1; i < list.length; i++){
			neenNextPass = false;
			for (int j = 0; j < list.length - i; j++) {
				if (list[j] > list [ j + 1]) {
					int temp = list[j];
					list[j] = list[ j + 1];
					list[ j + 1 ] = temp;
					
					neenNextPass = true;
				}
			}
		}
	}
}
