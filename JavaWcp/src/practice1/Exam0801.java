package practice1;

public class Exam0801 {
	public static void main(String[] args) {
		int entry_amount = 710;
		int a=500;
		int b=100;
		int c=50;
		int d=10;
	    System.out.println("投入金額は" + entry_amount + "円です");

	    if(entry_amount>160) {
	    	System.out.println("ドリンクが購入できました【お釣りあり】");
	    	int change = entry_amount-160;
	    	System.out.println("お釣りは"+change+"円です");
	    	System.out.println("500円硬貨:"+(change/a)+"枚");
	    	change = change%a;
	    	System.out.println("100円硬貨:"+(change/b)+"枚");
	    	change = change%b;
	    	System.out.println("50円硬貨:"+(change/c)+"枚");
	    	change = change%c;
	    	System.out.println("10円硬貨:"+(change/d)+"枚");

	    }else if(entry_amount==160) {
	    	System.out.println("ドリンクが購入できました【お釣りなし】");
	    }else if(entry_amount<160) {
	    	System.out.println("金額が足りません");
	    }
	}

}
