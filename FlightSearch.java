import java.lang.*;
import java.util.Scanner;
class FlightSearch
{
	static void bubbleSort(int A[])
	{
		int temp = 0;
		for (int k=0; k<A.length; k++)
		{
			for(int j=k+1; j<A.length; j++)
			{
				if (A[k]>A[j])
				{
					temp = A[k];
					A[k] = A[j];
					A[j] = temp;
				}
			}
		}
	}

	static int binarySearch(int A[],int left,int right,int x)
	{
		int mid = 0;
		while(left<=right)
		{
			mid = (left+right)/2;
			if(A[mid]==x)
			{
				return mid;
			}
			else if ( A[mid]>x)
			{
				right = mid-1;
			}
			else
			{
				left = mid+1;
			}
		}
		return -1;
	}

	public static void main(String s[])
	{
		int A[]={112,231,301,445,619,718,738};
		int x;
		int n= A.length;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Flight No. to search: ");
		x = sc.nextInt();
		bubbleSort(A);
		int result = binarySearch(A,0,n-1,x);
		if(result == -1)
		{
			System.out.print("Flight "+x+" not found");
		}
		else
		{
			System.out.print("Flight "+x+" found");
		}
	}
}

