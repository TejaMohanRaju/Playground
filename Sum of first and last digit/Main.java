import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a,d=0;
      a=n%10;
      while(n!=0)
      {
        d=n%10;
        n=n/10;
       
      }
      d=(a+d);
      System.out.println(d);
	}
}