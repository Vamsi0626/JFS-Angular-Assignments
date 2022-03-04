import java.util.ArrayList;
import java.util.Arrays;

public class MinMaxFinder {
	public int max(int [] arr) {
	      int max = 0;
	     
	      for(int i=0; i<arr.length; i++ ) {
	         if(arr[i]>max) {
	            max = arr[i];
	         }
	      }
	      return max;
	   }
	   public int min(int [] arr) {
	      int min = arr[0];
	     
	      for(int i=0; i<arr.length; i++ ) {
	         if(arr[i]<min) {
	            min = arr[i];
	         }
	      }
	      return min;
	   }


public static void main(String[] args) {
	
}
}