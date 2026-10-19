// 카운트 다운 ==> 로켓 발사 
public class 반복문_while_5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        int i=10;
        while(i>=1)
        {
        	System.out.println(i);
        	Thread.sleep(1000);
        	i--;
        }
        System.out.println("🚀 발사!!");
	}

}
