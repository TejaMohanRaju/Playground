import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner s=new Scanner(System.in);
      int x=s.nextInt();
      int a=x,l,r=0;
      while(x>0)
      {
        l=x%10;
        x=x/10;
        int f=1;
        for(int i=1;i<=l;i++)
        {
          f=f*i;
        }
        r=r+f;
      }
      if(r == a)
      System.out.println("Yes");
       else
         System.out.println("No");// Type your code here
	}
}