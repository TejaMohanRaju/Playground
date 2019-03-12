import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner in = new Scanner(System.in);
	int n = in.nextInt();
      for(int i=n;i>=1;i--)
      {
        for(int k=i;k>=1;k--)
          System.out.print(k);
         System.out.print("\n");
      }// Type your code here
	}
}