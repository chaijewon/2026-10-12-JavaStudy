/*
 *    부정연산자 : !
 *      결과값 => true / false
 *      => 조건문(if)
 *      => 예약일 체크 / 체크인 / 체크아웃 / 좋아요 
 *      
 *    형변환 연산자 
 *      기본형 / 참조형 
 *            <==============
 *      | byte < char < int < long < double
 *            ==============> 
 *            
 *      1) 자동형변환 : 작은 데이터형 < 큰 데이터형 
 *         값을 대입 / 연산 처리
 *         long a=100;
 *                ---
 *                int  => long으로 변경 => 100L
 *         int a='A' 
 *               ---
 *               char  => int로 변경 => 65
 *         boolean은 제외  

            10.5 + 10  => 연산은 반드시 데이터형이 동일해야 된다 
                  ----
                  double => 10.0
                |
            10.5 + 10.0 => 20.5
            
            'A' + 1
            ---
            int 변환 => 65 + 1 = 66 
 *      2) 강제형변환 : 큰 데이터형 => 작은 데이터형
 *         int a=10.5; 
 *           => 오류 
 *         int a=(int)10.5;  a=10 => 소스점이 사라진다 
 *         char a=65; 예외 => a='A'
 *         ---- 0~65535
 *         int a=(int)(10.5+10.5) 
 *                    -----------
 *                      21.0 => int => 21
 *         int a=(int)10.5+(int)10.5
 *               --------- ---------
 *                 10         10
 *                  |          |
 *                  ------------ + = 20
 *         --------------------------------
 *         
 *         double a=123456.78;
 *         int b=123456
 *         
 *         int res=(int)((a-b)*100)
 *                       -----
 *                       123456.78-123456.0 => 0.78*100 => 78.0 => 78
 *                      -----------
 *                  ----
 *         
 *      3) 산술규칙 
 *         1. 같은 데이터형끼리 연산 => 큰데이터형으로 변경후 처리 
 *         2. int이하 데이터형은 결과값이 int다 
 *            ---------------------------
 *            char + double = double
 *            char + int = int 
 *            byte + int + long = long
 *            ----
 *            int
 *            ----------
 *              long
 *              
 *            char + char = int 
 *            byte + byte = int 
 *            byte + char = int 
 *            
 *            
 */
public class 단항연산자_부정연산자_형변환연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean bCheck=false;
        //bCheck=!bCheck;
        //System.out.println("bCheck="+bCheck);
        /*for(int i=0;i<10;i++)
        {
        	bCheck=!bCheck;
        	if(bCheck==true)
        	{
        		System.out.println("사용자 ");
        	}
        	else
        	{
        		System.out.println("컴퓨터 ");
        	}
        }*/
        //double a=123456.78;
        //int b=123456;
        //int res=(int)((a-b)*100);
        // System.out.println(res);
        // 77.9999999	// 266	
        /*
         *    1(X)00001010
         *        --------
         *            8 2   => 10
         */
        byte b1=127;
        byte b2=100;
        byte b4=39;
        int b3=b1+b2+b4; // long / double
        System.out.println(b3);
        System.out.println(Integer.toBinaryString(266));
        char a='A';
        char b='B';
        int c=a+b; // long / double
        System.out.println(c);
	}

}
