import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a=0;
 
      while(n!=0)
      {
       a=n%10+a;
        n=n/10;
      }
     
      System.out.println(a);
	}
}