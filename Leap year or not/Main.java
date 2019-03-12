import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
      if(a%4 == 0)
      {
        if(a%100 == 0)
        {
          if(a%400 == 0)
          {
            System.out.println("Leap year");
          } 
          else
             System.out.println("Non Leap year");
        }
        else
          System.out.println("Leap year");
      }
      else
         System.out.println("Non Leap year");
    // Type your code here
    }
}