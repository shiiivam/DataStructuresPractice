import java.util.Scanner;
public class ArrayRotate
{
	public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        int i,no,len,j,rot,k=0;
	    int[] arr = {1,2,3,4,5,6,7};
	    System.out.println("Enter number of roytations");
	    
	    rot = sc.nextInt();
	    int[] arr2 = new int[rot];
	    len = arr.length;
	    for(i=0;i<rot;i++){
	        arr2[i] = arr[i];
	    }
	    len = len-rot;
	    for(j=0;j<len;j++){
	        arr[j] = arr[j+rot];
	        k++;
	        
	    }
	     for(j=0;j<rot;j++){
	        arr[k] = arr2[j];
	        k++;
	        
	    }
	    
	    for(i=0;i<(arr.length);i++){
	        System.out.println(i + " : " +arr[i]);
	  
	    }
	    System.out.println("Last index is : " + k);
	}
}
