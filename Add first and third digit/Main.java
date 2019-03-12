import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      
      int a=n1%10+n1/100;
      System.out.println(a);// Type your code here
	}
}