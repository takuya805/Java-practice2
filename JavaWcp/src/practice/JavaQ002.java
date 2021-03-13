package practice;

public class JavaQ002 {
	public static void main(String[] args) {
		int math;
		for(math=1;math<=20;math++)
		if(math%3==0&&math%5==0) {
			System.out.println("FizzBuzz");
		}else if(math%5==0) {
			System.out.println("Buzz");
		}else if(math%3==0) {
			System.out.println("Fizz");
		}else {
			System.out.println(math);
		}
	}

}
