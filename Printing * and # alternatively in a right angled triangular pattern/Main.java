import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int n=in.nextInt();
        int a=1;
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<=i;j++)
        {
          if(a%2 == 0)
            System.out.print("#");
          else
            System.out.print("*");
          a++;
        }
        System.out.print("\n");
      }
               
      // Type your code here
    }
}