import java.util.Scanner;
class Main
{
  public static void sum(int n)
  {
    System.out.println(n*n);
  }
	public static void main (String[] args)
    {
	  Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      sum(n);
	} 
}
