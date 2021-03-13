package practice;

public class Java0307case3 {
	public static void main(String[] args) {

	int test = 40;
	if(test >=80) {
		System.out.println("優");
	}else if(test>=70 && test<80) {
		System.out.println("良");
	}else if(test>=60&&test<70) {
		System.out.println("可");
	}else if(test<60) {
		System.out.println("不可");
	}
}

}
