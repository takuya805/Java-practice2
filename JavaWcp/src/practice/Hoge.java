package practice;

public class Hoge {
	public static void manin(String[] args) {
		for(int i=0;i<=100;i++) {
			if(i%15==0) {
				System.out.println(i+ ":HogeFuga");
			}else if(i%3==0) {
				System.out.println(i+"Hoge");
			}else if(i%5==0) {
				System.out.println(i+"Fuga");
			}
			System.out.println(i);
		}
	}

}
