import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
           a[i]=s.nextInt();
      int j;
      for(int i=0;i<n;i++)
      {int c=2;
        while(c>0)
        {
        if(a[i]==0)
        {
          for( j=i;j<n-1;j++)
            a[j]=a[j+1];
          a[j]=0;
        }
          c--;
        }
       

      }
      for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}