import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int b=0,d=0;
      while(n!=0&&n>10)
      {
        d=n%10;
        n=n/10;
       
      }
      System.out.println(d);
	}
}