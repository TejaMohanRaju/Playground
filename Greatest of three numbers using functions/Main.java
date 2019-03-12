import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner s=new Scanner(System.in);
      int a=s.nextInt();
       int b=s.nextInt();
       int c=s.nextInt();
      greatest(a,b,c);// Type your code here
	}
  public static void greatest(int a,int b,int c)
  {
    if(a>b && a>c)
      System.out.println(a);
    else if(b>c)
      System.out.println(b);
    else
      System.out.println(c);
  }
}