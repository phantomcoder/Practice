package Arrays;

import java.util.List;


public class AllPermutationsOfArray {

	public static void main(String[] args) 
	{
		permute(java.util.Arrays.asList(1,2,3), 0);
	}
	
	private static void permute(List<Integer> arr, int k)
	{
		for(int i = k; i < arr.size(); i++){
            java.util.Collections.swap(arr, i, k);
            permute(arr, k+1);
            java.util.Collections.swap(arr, k, i);
        }
        if (k == arr.size() -1){
            System.out.println(java.util.Arrays.toString(arr.toArray()));
        }
	}
}
