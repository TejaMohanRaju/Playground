import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
           a[i]=s.nextInt();
         int x=s.nextInt();
        for(int j=0;j<x;j++)
        {
          int i;
           int temp=a[1];
           for(i=1;i<n-2;i=i+2)
           {
             a[i]=a[i+2];
           }
          a[i]=temp;
        }
    if(n%2!=0)
    {
       for(int j=0;j<x;j++)
        {
         int i;
           int temp=a[n-1];
           for(i=n-1;i>1;i=i-2)
           {
             a[i]=a[i-2];
           }
         a[i]=temp;
        }
    }
    else
      {
       for(int j=0;j<x;j++)
        {
         int i;
           int temp=a[n-2];
           for(i=n-2;i>1;i=i-2)
           {
             a[i]=a[i-2];
           }
         a[i]=temp;
        }
    }
    for(int i=0;i<n;i++)
      System.out.print(a[i]+" ");
    
         
  	}
}