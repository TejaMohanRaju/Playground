import java.util.Scanner;
class Main{
	  public static void sum(int n)
  {
    int s=0;
        for(int i=1;i<=n;i++)
          s+=i;
        System.out.println(s);
  }
	public static void main (String[] args)
    {
	  Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      sum(n);
	} 
}