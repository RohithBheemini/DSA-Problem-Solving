import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
		    int N = sc.nextInt();
		    String[] input = sc.nextLine().split(" ");
		    int[] arr = new int[N];
		    int max =Integer.MIN_VALUE;
		    for(int j=0;j<N;j++){
		        arr[i]=Integer.parseInt(input[i]);
		        if(arr[i]>max){
		            max=arr[i];
		        }
		    }
		    System.out.print(max);
		}

	}
}
