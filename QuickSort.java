//QUICK SORT VIDEO 115
// run-time complexity = Best case O(n log(n))
// Average case O(n log(n))
// Worst case O(n^2) if already *******sorted********	
// space complexity = O(log(n)) due to recursion
// Takes an array of values, chooses one of the values as the 'pivot' element, and moves the other values so that lower values are on the left of the pivot element and 
// higher values are on the right of it


//ALGORITHM
// Selection of pivot element can be anywhere but usually it is fixed at the end
// So basically we have to place the pivot element to it's correct position
// So we declare two indices one is the start(j) and another is start - 1(i) and a temporary variable to swap variablles
// Now we start the iteration , if j is <= pivot element then we have to increment i and swap i and j values
// if it's greater than pivot then we just ignore 
// Same follows until 
// When j reaches the pivot we will know the position of the pivot element that is i+1th position, So we increment i and swap with the pivot or j

// unlike merge sort we don't create two sub arrays but instead we do inplace sorting




//******************************* MERGE SORT IS ULTIMATE *******************************8
// Any sorting problem, solve it using MERGE SORT


public class QuickSort{
	public static void main(String[] args){
		int[] arr = {8,2,5,3,9,4,7,6,1};
		quickSort(arr,0,arr.length-1);

		for(int i:arr){
			System.out.print(i + " ");
		}
	}

	private static void quickSort(int[] arr, int s, int e){
		if(s>=e){
			return;
		}

		//Here we get the position of the pivot element
		int pivot = partition(arr,s,e );
		
		quickSort(arr,0,pivot-1);
		quickSort(arr,pivot+1,e);
	}

	private static int partition(int[] arr, int s, int e ){
		int pivot = arr[e];
		int i = s-1;
		int temp;
		for(int j = s; j<=e; j++){
			if(arr[j] < pivot){
				i++;
				//Swapping
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		i++;
		temp = arr[i];
		arr[i] = arr[e];
		arr[e] = temp;

		return i;
	}
}