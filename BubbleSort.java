//BUBBLE SORT VIDEO 110
// Used to sort array elements

// ALGORITHM: pairs of adjacent elements are compared, and the elements are swapped if they are not in order

// Simplest sorting algorithm but not efficient in terms of time complexity. It has O(n^2)
// Hint: the number to be placed to it's correct position is stored in temp
// Quadratic time O(n^2)
// for small data set it's okay-sish
// for large data set it's BAD

public class BubbleSort{
	public static void main(String[] args){
		int[] arr = {4,3,8,2,7,1,6,9,5};
		BubbleSort(arr);

	}

	public static void BubbleSort(int[] arr){
		for(int k =0; k<arr.length-1; k++){
			for(int i = 0; i<arr.length-1; i++){
				int num1 = arr[i];
				int num2 = arr[i+1];
				int temp = -1;
				if(num1 > num2){
					temp = num1;
					arr[i] = num2;
					arr[i+1] = temp;
				}

				for(int j = 0;j<arr.length; j++){
				System.out.print(arr[j]+" ");
			}

			System.out.println();

			}
		}

		for(int i = 0;i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}