package practice1;

public class Exam08 {
	public static void main(String[] args) {
		String student_name="田中";
		int japanese_score = 60;
		int mathematical_score = 69;
		double average_score = ((japanese_score+mathematical_score)/2);
		System.out.println(student_name+"さんの"+"国語の点数は"+japanese_score+"点です。");
		System.out.println(student_name+"さんの"+"数学の点数は"+mathematical_score+"点です。");
		System.out.println(student_name+"さんの"+"平均点は"+average_score+"点です");

		if(average_score>=80) {
			System.out.println("高得点！おめでとう");
		}else if(average_score<80&&average_score>=65) {
			System.out.println("もう少しで高得点。");
		}else if(average_score<65&&average_score>=35) {
			System.out.println("もう少し頑張りましょう。");
		}else if(average_score<35) {
			System.out.println("追試です。");
		}
	}

}
