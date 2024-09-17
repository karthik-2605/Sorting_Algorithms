//SELECTION SORT VIDEO 111
// QUADRATIC TIME O(n^2)
// ALGORITHM : search through an array and keep track of the minimum value during each iteration. At the end of each iteration , we swap variables
// Small data set: OKAY , Large data set: BAD (Becomes inefficient)

public class SelectionSort{
	public static void main(String[] args){
		int[] arr = {9,1,8,2,7,3,6,4,5};
		SelectionSort(arr);
	} 

	public static void SelectionSort(int[] arr){
		for(int i = 0; i<arr.length ; i++){
			int min = arr[i];
			int temp = -1;
			int minindex = i;  // ASSUME THAT INITIAL INDEX IS THE MINIMUM VVIPM
			for(int j = i; j<arr.length ; j++){
				if(arr[j] < min){
					min = arr[j];
					minindex = j;
				}
			}

			temp = arr[i];
			arr[i] = min;
			arr[minindex] = temp;
			
		}

		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}

}	