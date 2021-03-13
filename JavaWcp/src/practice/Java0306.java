package practice;

public class Java0306 {
	public static void main(String[] main) {
		int i=-15;
		if(i>0 && i%2==0) {
			System.out.println("正の偶数");
		}else if(i>0 && i%2!=0) {
			System.out.println("正の奇数");
		}else if(i<0 && i%2==0) {
			System.out.println("負の偶数");
		}else if(i<0 && i%2!=0) {
			System.out.println("負の奇数");
		}
	}

}
