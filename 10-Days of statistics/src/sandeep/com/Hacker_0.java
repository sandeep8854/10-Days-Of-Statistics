package sandeep.com;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class Hacker_0 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter Any Length ?");
	        int length=sc.nextInt();
	        int arr[]=new int[length];
	        for(int i=0;i<arr.length;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        double result=means(arr);
	        System.out.println(result);
	        double result1=median(arr);
	        System.out.println(result1);
	        double result2=mode(arr);
	        System.out.println(result2);
	    }

	    private static double mode(int[] c)
	    {
	        int maxValue = 0,maxCount = 0;
	        for(int i=0;i<c.length;i++)
	        {
	            int count=0;
	            for(int j=0;j<c.length;j++)
	            {
	                if(c[i]==c[j])
	                    count++;
	            }
	            if(count >maxCount)
	            {
	                maxCount=count;
	                maxValue=c[i];
	            }
	        }    
	        return maxValue;
	    }

	    private static double median(int[] b)
	    {
	        Arrays.sort(b);
	        int size=b.length;
	        int middle=size/2;
	        if(b.length%2==1)
	        {
	            return b[middle];
	        }else
	        {
	            return (double)(b[middle-1]+b[middle])/2;
	        }
	    }

	    private static double means(int[] a)
	    {
	        double mean=0;
	        int sum=0;
	        int size=a.length;
	        for(int i:a)
	        {
	            sum=sum+i;
	        }
	        mean=(double)sum/size;
	        return mean;
	}

}
