/*
 *   => ***1. trim() : 좌우의공백 제거 
 *   => ***2. valueOf() : 모든 데이터형을 문자열로 변환시에 사용
 *   => ***3. split() : 단어(토큰) 별로 나눠서 배열에 저장 
 *   => 4. join() => 문자를 묶어서 한개의 문자열 저장 
 *   => 5. format() => 문자열 변환 
 *         -------- printf()
 *   ---------------------------------------------------
 *   라이브러리 => 자바에서 만든 클래스 
 *     |= 메소드 (기능)
 *     
 *   메소드 : 특정 기능을 수행하는 명령문의 집합 
 *   메소드의 구성 요소 
 *      리턴형(결과값) 메소드명(매개변수...)
 *      -----------
 *      {
 *          기능 수행 (요청 처리) 
 *          return 값
 *                 -- 데이터형이 동일 
 *      }
 *      
 *      리턴형 / 메소드 / 매개변수
 *      ---------------------
 *      => 호출시에는 리턴형을 제외한다 
 *      int add(int a,int b) => 원형 
 *      {
 *         return  a+b;
 *      }
 *      
 *      => int c=add(10,20)
 *             | ----------
 *             |   |
 *             -----
 *      1. 어떤 클래스인지 
 *      2. 어떤 기능이 필요한다 
 *      3. 매개변수 값 
 *      4. 리턴형 
 *      5. 어떻게 호출 
 *      ****** 결과값이 없는 경우도 있다 => 리턴형 void 
 *                                         -----
 *      trim() : 좌우 공백 제거 
 *       => 원형 : String trim() 
 *                ------
 *      String valueOf(int) : 모든 데이터형을 문자열로 변경 
 *        10 => "10"
 *         =>10.5 "10.5"
 *        true => "true"   
 *      String valueOf(long)
 *      String valueOf(boolean)
 *      ..
 *      ..
 *      ..
 *      String valueOf(char[])
 *      ---------------------- 오버로딩   
 *   
 */
public class 문자열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // System.out.println();
		String msg=" Hello Java "; // 인스턴스 
		String m=" Hello Oracle ";
		System.out.println("문자 갯수:"+(" Hello Java ".length()));
		System.out.println("msg="+msg);
		msg=msg.trim();
		System.out.println("문자 갯수:"+msg.length());
		System.out.println("msg="+msg);
		// trim() => 검색어 , 사용자 입력 (ID,PWD)
		// 공백 => space문자
		int a=100;
		int b=200;
		System.out.println(a+b);
		// 공유 메소드 => static 
		System.out.println(String.valueOf(a)+b); //100200
		 //                              ----- 300 => "300"
		                  // "100"+200 => 100200
		char[] c={'홍','길','동','입','니','다'};
		System.out.println(String.valueOf(c));
		
		// => 가변형 매개변수 
		/*
		 *   String java.lang.String.join(
				CharSequence delimiter,
				CharSequence... elements
				)
		 */
		String s=String.join("-","2026","10","21","수요일");
		System.out.println(s);
		/*
		 *   String java.lang.String.format(
				 String format,
				 Object... args
				)
		 */
		s=String.format("%d %d %d %d %.2f %c", 90,90,80,260,260/3.0,'A');
		System.out.println(s);
		Object o=1;
		o=10.5;
		o="";
		o=true;
		o='A';
		
	}

}
