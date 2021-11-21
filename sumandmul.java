package element;


import java.util.Scanner;

public class sumandmul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		class B{
			Scanner sc=new Scanner(System.in);

			 public void sun(int a, int b) {
		int	sum=a+b;
			System.out.println(sum);
			
		int	mul=a*b;
			System.out.println(mul);
		}
		}
		
		B obj=new B();
		Scanner sc=new Scanner(System.in);
		obj.sun(15, 15);
		
		
	}

}
