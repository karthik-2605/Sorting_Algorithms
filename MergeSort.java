//MERGE SORT VIDEO 114
public class MergeSort{
	
    public static void main(String args[])
    {   	
    	// merge sort = recursively divide array in 2, sort, re-combine
    	// run-time complexity = O(n Log n)
    	// space complexity    = O(n)
    	// Better than other sorting algorithms i.e. bubble sort, insertion sort, selection sort,

    	//It handles good for large data sets
    	//In LEETCODE we have sort an array method where one case has very big data. So using insertion, selection or bubble we get TLE bcz these are meant only for small data sets. 
    	// So for dealing with large data sets we need merge sort, quick sort methods which are very efficient and provide complexity of O(nlog n)
    	//*********************************MERGE SORT IS ULTIMATE*********************************8
    	//Any sorting problem solve it using the merge sort method 
    	
        int[] array = {2,0,2,1,1,0};
        
        mergeSort(array);
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }

	private static void mergeSort(int[] array) {
		
		int length = array.length;
		if (length <= 1) return; //base case
		
		int middle = length / 2;
		int[] leftArray = new int[middle];
		int[] rightArray = new int[length - middle];
		
		int i = 0; //left array
		int j = 0; //right array
		
		for(; i < length; i++) {
			if(i < middle) {
				leftArray[i] = array[i];
			}
			else {
				rightArray[j] = array[i];
				j++;
			}
		}
		mergeSort(leftArray);
		// First mergeSort(leftArray) get's called (i.e.{8,2,5,3})
		// inside this again leftArray and Right array is seperated  (i.e. leftArray = {8,2}   rightArray = {5,3})
		// then again mergeSort(leftArray) is called and leftArray and rightArray is assigned. (i.e. leftArray = {8}   rightArray = {2})
		// Now merge(leftArray({8}), rightArray({2}), arr) is called  (First call: mergeSort(leftArray) ---> inside mergeSort(leftArray) then again mergeSort(leftArray) ---> 
		// but the codition fails when it goes to again mergeSort(leftArray) bcz it has {8} and the length becomes 0 so it returns {8} itself. Now it goes to merge(rightArray) {2} 
		// and then to merge() and sorts 8 and 2 to give {2,8} )
		// here 8 and 2 gets sorted and now we have {2,8}

		//next we have {5,3} which gives {3,5} which at last gives {2,3,5,8}

		//next rightArray which is {4,7,6,1} which gives {4,7} and {1,6} which gives {1,2,6,7}

		//leftArray = {2,3,5,8} and rightArray = {1,2,6,7}
		// now goes to merge() and results in {1,2,3,4,5,6,7,8,}



		mergeSort(rightArray);
		merge(leftArray, rightArray, array);
	}
	
	private static void merge(int[] leftArray, int[] rightArray, int[] array) {
		
		int leftSize = array.length / 2;
		int rightSize = array.length - leftSize;
		int i = 0, l = 0, r = 0; //indices
		
		//check the conditions for merging
		while(l < leftSize && r < rightSize) {
			if(leftArray[l] < rightArray[r]) {
				array[i] = leftArray[l];
				i++;
				l++;
			}
			else {
				array[i] = rightArray[r];
				i++;
				r++;
			}
		}
		while(l < leftSize) {
			array[i] = leftArray[l];
			i++;
			l++;
		}
		while(r < rightSize) {
			array[i] = rightArray[r];
			i++;
			r++;
		}
	}
}