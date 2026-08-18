import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int m=0;
		    int[] arr=new int[n+2];
		    arr[0]=k;
		    arr[n+1]=k;
		    for(int i=1;i<n+1;i++){
		        arr[i]=sc.nextInt();
		    }
		    for(int i=1;i<arr.length;i++){
		        if(arr[i]>k){
		            m++;
		        }
		    }
		    System.out.println(m);
		}

	}
}
