1://SWAPING TWO NUMBERS
package zoomcourse;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=3;
		int num2=6;
		System.out.println("num1="+num1+"\t, "+"num2="+num2);
		int swap=num1;
		num1=num2;
		num2=swap;
		System.out.println("after swaping \n"+"num1="+num1+"\t, "+"num2="+num2);
	}
  }
  3://CHECK IF THE NUMBER ODD OR EVEN.
  int number=input.nextInt();
	if(number%2==0)
	{
		System.out.println("1");
		}
	else
		System.out.println("0");
4://
		int[] arr=new int[4];
		Scanner input=new Scanner(System.in);
		int OddCOUNTER =0;
		int EvenCounter=0;
		for(int i=0;i<4;i++)
		{System.out.println("put the values of the array");
			arr[i]=input.nextInt();
		}
		for(int i=0;i<4;i++)
		{if(arr[i]%2==0)
		{
		EvenCounter+=1;
		}else if (arr[i]%2!=0)
		{
		OddCOUNTER+=1;
		}
				}
		System.out.print("Number of odds"+OddCOUNTER+"\n"+"Number of evens"+EvenCounter);
	}
	
	}
  5:
  Scanner in=new Scanner(System.in);
		System.out.println("put a number");
		int num=in.nextInt();
		int fact = 1 ;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
System.out.println(fact);
	}
	
	}
