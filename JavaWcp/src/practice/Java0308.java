package practice;

public class Java0308 {
	public static void main(String[] args) {
		int middle = 90;
		int end = 15;
		if(middle>=60 && end>=60) {
			System.out.println("合格");
		}else if(middle+end>=130) {
			System.out.println("合格");
		}else if(middle+end>=100&&(middle>=90||end>=90)) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
	}

}
