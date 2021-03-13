package practice;

public class Q002 {
	public static void main(String[] args) {
		int age =8;
		boolean parent = true;
		if(age<=12&&!parent) {
			System.out.println("ご参加いただけません");
		}else if(age<=12&&parent) {
			System.out.println("ご参加いただけます");
		}else {
			System.out.println("ご参加いただけます");
		}
	}

}
