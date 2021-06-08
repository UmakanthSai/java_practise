package basic_part_1;

import java.util.Scanner;

public class Java1 {

	Scanner scan = new Scanner(System.in);
	
	void java_1() {
		System.out.println("Hello\nUmakanth!");	
		
		//using scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=scan.next();
		System.out.println("Hello"+ "\n" + name);
		scan.close();
	}
	
	void java_2() {
		int a,b;
		a=74;
		b=36;
		System.out.println("Test Data: " + a +"+"+ b );
		System.out.println("Expected Output: "+ (a+b));
	}
	
	void java_3() {
		int a,b;
		a=50; b= 3;
		System.out.println("Test Data: "+ a+"/"+b);
		System.out.println("Expected Output: "+ (a/b));
	}
	
	void java_4() {
		int w = -5 + 8 * 6;
		   int x = (55 + 9) % 9;
		   int y = 20 + (-3 * 5 / 8);
		   int z = 5 + 15 / 3 * 2 - 8 % 3;

		   System.out.print(w + "\n" + x + "\n" + y + "\n" + z);
	}
	
	void java_5(){
		
		System.out.print("Input first number: ");
		int a = scan.nextInt();
		System.out.print("Input second number: ");
		int b = scan.nextInt();
		System.out.printf("Input first number: %d\nInput second number: %d\n", a,b);
		
		System.out.println("Expected Output : ");
		System.out.println(a*b);
	}
	
	void java_6() {
		
		System.out.println("Enter two integer values: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//second method
		
		int sum = a +b;
		int substraction = a-b;
		
		System.out.printf("Sum = %d\nSubstraction = %d\nName =%d", sum, substraction);
		scan.close();
	}
	
	void java_7() {
		System.out.println("Input a number: ");
		int number = scan.nextInt();
		System.out.println("Enter muliplication table upto which value: ");
		int value = scan.nextInt();
		System.out.println("Expected Output : ");
		for(int i=1; i<=value; i++) {
			System.out.println(number+"x"+i+"="+(number * i));
		}
	}
	
	void java_9() {
		double a, b, c, d;
		a= 25.5; b= 3.5; c= 40.5; d= 4.5;
		System.out.println("Test Data:\n"+("(("+a+"*"+b+"-"+b+"*"+b+")"+"/"+"("+c+"-"+d+"))"));
		System.out.println("Expected Output\n"+((a*b-b*b)/(c-d)));
	}
	
	void java_11() {
		System.out.println("Finding Area of a circle");
		double area, radius=7.5;
		area= Math.PI*radius*radius;
		System.out.println("Area of a circle formula: area=Pi*radius");
		System.out.println("Area is: "+area);
		
		System.out.println("Perimeter of a circle [Fromula: 2*pi*radius]");
		double circumference;
		circumference=2*Math.PI*radius;
		System.out.println("Perimeter is: "+circumference);
	}
	
	void java_12() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Three numbers: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		input.close();
		
		double d = a + b + c;
		
		double average = d/3;
		
		System.out.println("Average of "+a+","+b+","+c+": "+average);
		
	}
	
	public static void main(String[] args) {
		
		Java1 obj = new Java1();
		
		for(int i =1; i<=3; i++) {

		}
		//obj.java_1();
		//obj.java_2();
		//obj.java_3();
		//obj.java_4();
		//obj.java_5();
		//obj.java_6();
		//obj.java_7();
		//obj.java_9();
		//obj.java_11();
		obj.java_12();
	}

}
