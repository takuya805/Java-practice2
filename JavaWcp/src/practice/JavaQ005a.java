package practice;

public class JavaQ005a {
	public static void main(String[] args){
		int a = new java.util.Random().nextInt(10);
		System.out.println("a="+a);
		if(a%2==0) {
			System.out.println("aは偶数です");
		}else {
			System.out.println("aは奇数です");
		}
	}


}
