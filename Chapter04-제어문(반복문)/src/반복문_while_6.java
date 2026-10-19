// 매일 1000씩 저금 => 7일후에는 얼마인지 확인 
public class 반복문_while_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int money=0;
        int day=1;
        while(day<=7)
        {
        	money+=1000;
        	System.out.println(day+"일째 "+money+"원");
        	day++;
        }
        System.out.println("💴"+money+"원");
	}

}
