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
		    int max =Integer.MIN_VALUE;
		    int[] arr=new int[N];
		    for(int j=0;j<N;j++){
		        arr[j]=sc.nextInt();
		        if(arr[j]>max){
		            max=arr[j];
		        }
		    }
		    System.out.println(max);
		}
        sc.close();
	}
}
