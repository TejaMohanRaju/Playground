import java.util.Scanner;
class Main{
	public static void main (String[] args){
          Scanner s=new Scanner(System.in);
      int x=s.nextInt();
      int a=1;
      for(int i=2;i<=x;i++)
      {
        a=a*i;
      }
      System.out.println(a);// Type your code here
	}
}