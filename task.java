
public class one {

	public static void main(String[] args) {
		System.out.println(-5 + 8 * 6 );
		System.out.println( (55+9) % 9 );
		System.out.println(20 + -3*5 / 8 );
	    System.out.println( 5 + 15 / 3 * 2 - 8 % 3 );
	}

}
import java.util.Scanner;

public class twoo {

	public static void main(String[] args) {
		
Scanner a =new Scanner(System.in);
System.out.println("enter the two numbers");
	int num1=a.nextInt();
	int num2=a.nextInt();
	System.out.println(num1+"+"+num2+"="+(num1+num2));
	System.out.println(num1+"-"+num2+"="+(num1-num2));
	System.out.println(num1+"*"+num2+"="+(num1*num2));
	System.out.println(num1+"/"+num2+"="+(num1/num2));
	}

}
import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b =new Scanner(System.in);
		System.out.println("enter one number");
			int num=b.nextInt();
			for(int i =1;i<=10;i++)
			{
				int result=num*i;
				System.out.println(num+" x "+i+" = "+result);
				
				
			}

	}

}

public class four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("   J    a   v     v  a   ");
System.out.println("   J   a a   v   v  a a  ");
System.out.println("J  J  aaaaa   V V  aaaaa ");
System.out.println(" JJ  a     a   V  a     a ");
	
	
	}

}

public class five {

	public static void main(String[] args) {
		System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5) );

	}

}

public class six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)) );

	}

}
import java.util.Scanner;

public class seven {

	public static void main(String[] args) {
		
Scanner r=new Scanner(System.in);
System.out.println("enter the raduis");
double rad=r.nextFloat();
double area = 2*3.14*rad;
double perimeter=3.14*rad*rad;
System.out.println("Perimeter is ="+area);
System.out.println("Area is = "+perimeter);
	}

}
