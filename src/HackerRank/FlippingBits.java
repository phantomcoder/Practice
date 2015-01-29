package HackerRank;
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class FlippingBits {

	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	        int[] a = new int[t];
	        
	        for(int i =0;i<t;i++)
	            {
	            a[i] = s.nextInt();
	        }
	        
	        for(int n = 0; n< a.length;n++)
	            {
	            int temp = ~a[n];
	            System.out.println(temp);
	        }
	    }
	}


