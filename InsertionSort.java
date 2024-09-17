//INSERTION SORT VIDEO 112
//1) It is an sorting algorithm
// Iteratively inserting each element of an unsorted list into its correct position in  a sorted portion of the list.
//2) Starts by taking a temp value as arr[i] ---> the second element of the array
//3) Quadratic time ---> O(n^2)
//4) Less steps than bubble sort
//5) Best case is O(n) compared to Selection sort O(n^2)
//6) Small data set = decent
//	 Large data set = BAD


// Check the while loop method which is more effective than for loop
public class InsertionSort{
	public static void main(String[] args){
		int[] arr = {4,1,3,9,7};
		InsertionSort(arr);
	}

	public static void InsertionSort(int[] arr){
		for(int i =1; i<arr.length; i++){
			int temp = arr[i];
			for(int j =i; j>=0 ; j--){
				if(temp < arr[j]){
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}

			for(int k = 0; k<arr.length ;k++){
				System.out.print(arr[k] + " ");
			}

			System.out.println();
		}

		System.out.print("Ans: ");

		for(int i =0; i<arr.length; i++){

			System.out.print(arr[i] + " ");
		}
	}
}