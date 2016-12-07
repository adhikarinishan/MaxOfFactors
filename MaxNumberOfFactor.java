import java.util.Scanner;

public class MaxNumberOfFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=2;
		int count=0;
		int m=0,k;
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number=>");
		int n=in.nextInt();
		int a[]=new int[n];
		
		if(n>1)
		{
			while(n>1)
			{
				
				if(n%i==0)
				{
					count++;
					n=n/i;
					System.out.println("factor="+i);
					
					//following for loop has used to store values in array
					for(k=m;k<count;k++)
					{
						
						a[k]=i;
					}
					m++;
				}
				
				else
				{
					i++;
				}
				
			}
			System.out.println("max factor is=>");
			System.out.println(a[count-1]);//to print maximum factor			
		}
		else
		{
			
			System.out.println("factor="+n);
		}
	}
}
