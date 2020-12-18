package seleniumpro.seleniumpro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		int nums[] = {20, 20, 30, 40, 50, 50, 50};  
		Set al=new LinkedHashSet();
		for(int i=0;i<nums.length;i++) {
			al.add(i);
		if(	al.add(i)==false) {
			System.out.println(nums[nums.length]+""+nums[i] +"   "+al.size());
		}
			
		}
	
		/*System.out.println("Original array length: "+nums.length);
		System.out.print("Array elements are: ");
       for (int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i]+" ");
        }*/
	//	System.out.println("\nThe new length of the array is: "+array_sort(nums));
			
		/* int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}; 
	        int n = arr.length; 
	          
	    //    n = removeDuplicates(arr, n); 
	   
	        // Print updated array 
	        for (int i=0; i<n; i++) 
	           System.out.print(arr[i]+" "); 
	    } 
		*/
		// TODO Auto-generated method stub
/*Integer arr []= {25,45,25,96,45,250};
Set set =new HashSet();
for(int i=0;i<arr.length;i++) {
	if(set.add((arr[i])==false)) {
		System.out.println(arr[i]);
		System.out.println(set.size());
		
	}
}

		int number =283;
		int revers= 0;
		int temp=0;
				while (number >0) {
					temp=number%10;
					revers=revers*10+temp;
					number=number/10;
					
		}System.out.println(revers);
*/				
	}

}
