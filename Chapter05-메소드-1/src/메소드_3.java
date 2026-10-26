// 메소드 호출 => 생명주기 
/*
 *     변수    연산자 제어문 
 *              |    |
 *              -----
 *                | 메소드 
 *      |         |
 *      -----------
 *        | 클래스 =======> 데이터 보호/유지보수(수정)/새로운 기능
 *                                  | 상속       | 오버로딩 (다형성) 
 *                        | 캡슐화 
 *     변수 => 한개 
 *            여러개 (같은 데이터) => 배열 
 *            여러개 (다른 데이터) => 클래스
 *            
 *     메소드는 반드시 종료후에 원상 복귀한다 
 *     => 메소드는 한개 기능만 수행하게 만든다 
 *     => 반복을 제거한다 
 *     => 구조적인 프로그램이 가능 
 *     
 */
public class 메소드_3 {
    static void display()
    {
    	System.out.println("display() 진입...4");//4
    	System.out.println("사용자 요청 처리...5");//5
    	System.out.println("사용자 요청에 대한 결과값을 넘겨준다 6");//6
    }
    static void process()
    {
    	System.out.println("process() 진입...2"); // 2
    	System.out.println("사용자 요청 처리...3"); // 3
    	display();
    	System.out.println("사용자 요청에 대한 결과값을 넘겨준다 7");//7
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("main 시작... 1"); // 1
        process();// 메소드는 {} 종료 => 원상복귀한다 (호출한 위치로 다시 돌아온다)
        System.out.println("main 종료...8");// 8
        // main=> 프로그램 시작 / 프로그램 종료
	}

}
