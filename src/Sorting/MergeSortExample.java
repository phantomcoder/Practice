package Sorting;

public class MergeSortExample {

	private static int []a;
	public static void main(String[] args) {
		a = getArray();
		printArray(a);
		sort();
		System.out.println();
		printArray(a);
	}
	
	public static void sort(){
		int []tempArray = new int[a.length];
		mergeSort(tempArray,0,a.length-1);
	}
	
	public static void mergeSort(int []tempArray,int lowerIndex,int upperIndex){
		if(lowerIndex == upperIndex){
			return;
		}else{
			int mid = (lowerIndex+upperIndex)/2;
			mergeSort(tempArray, lowerIndex, mid);
			mergeSort(tempArray, mid+1, upperIndex);
			merge(tempArray,lowerIndex,mid+1,upperIndex);
		}
	}
	
	public static void merge(int []tempArray,int lowerIndexCursor,int higerIndex,int upperIndex){
		int tempIndex=0;
		int lowerIndex = lowerIndexCursor;
		int midIndex = higerIndex-1;
		int totalItems = upperIndex-lowerIndex+1;
		while(lowerIndex <= midIndex && higerIndex <= upperIndex){
			if(a[lowerIndex] < a[higerIndex]){
				tempArray[tempIndex++] = a[lowerIndex++];
			}else{
				tempArray[tempIndex++] = a[higerIndex++];
			}
		}
		
		while(lowerIndex <= midIndex){
			tempArray[tempIndex++] = a[lowerIndex++];
		}
		
		while(higerIndex <= upperIndex){
			tempArray[tempIndex++] = a[higerIndex++];
		}
		
		for(int i=0;i<totalItems;i++){
			a[lowerIndexCursor+i] = tempArray[i];
		}
	}
	
	public static void printArray(int []array){
		for(int i : array){
			System.out.print(i+" ");
		}
	}
	
	public static int[] getArray(){
		int size=10;
		int []array = new int[size];
		int item = 0;
		for(int i=0;i<size;i++){
			item = (int)(Math.random()*100); 
			array[i] = item;
		}
		return array;
	}

}