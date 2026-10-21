/*
 *     변수 => 데이터형 (146page) 
 *              |
 *          ------------
 *          |           |
 *        기본형       참조형 (메모리 주소)
 *       ------      ------
 *                    | 배열 
 *                    | 클래스 
 *                      -----
 *                        |
 *                    --------------
 *                    |            |
 *                  라이브러리      사용자 정의 클래스 
 *                               -------------- 객체 지향 
 *       정수:byte / int / long 
 *       실수:double => (SpringAI = float)
 *       논리:boolean
 *       문자:char ==> String으로 대체 
 *     -------------------------------------------------
 *     연산자 : 단항( ++ , -- , ! , (type)
 *            이항( 산술 ,비교, 논리 , 대입)
 *                                 = += -=
 *                           && ||
 *                      == != < > <= >=
 *                 + - * / %
 *            삼항 (조건) ? 값:값
 *     제어문 
 *         조건문 : if / if~else 
 *         선택문 : switch~case 
 *         반복문 : for / while 
 *                ---- 이차 for => 배열 
 *         반복제어문 : break 
 *     ----------------------------------
 *     
 *     => 참조형 : 여러개 데이터를 한 메모리에 저장 => 사용 
 *     => 자바 메모리 구조
 *        -----------------------------------
 *             MathodArea => method / static 
 *        -----------------------------------
 *             Stack => 메모리 자체 관리 => 지역변수 
 *        -----------------------------------
 *             Heap => 개발자가 관리 => 참조형변수  
 *                     |=> GC
 *                  저장 : new  => mollac()
 *                  해제 : delete => free() => 승격 
 *        -----------------------------------
 *        
 *        String s="Java"
 *        String s1="Java"
 *          Stack           Heap (실제 데이터 저장공간)             
 *        ---s---    0x100----------
 *         0x100            "Java"
 *        -------         ----------
 *                  ↗
 *        ---s1----       0x200----------
 *         0x100                "Java"
 *                             ----------
 *        -------     s==s1
 *        
 *        String s2=new String("Java");
 *        
 *        ---s2----
 *         0x200
 *        ---------   new => 새로운 메모리 공간을 만들어서 저장 
 *                    => 단점 : 가독성 / 결합성이 높다 
 *                             ------------------ new 사용하지 않는다 
 *                             => 리플랙션 
 *        
 *        String 클래스 => char[]을 제어 
 *                       ------------ 여러개의 문자를 저장하는 클래스 
 *                       String => "" / char => ''
 *            | => 변경해서 사용이 불가능 / 제공한 내용을 사용 
 *                 | final            | => 표준화 
 *          | => 일반 데이터형 / 참조형 
 *               ----------   ----- 지원하는 메소드를 이용할 수 있다 
 *               String 변수명=""
 *     1) 같은 문자열은 주소가 동일하다 
 *        = 새로운 메모리 공간 => new String("")
 *     2) 사용법 
 *        String s="Hello";
 *        ------ - -------- 리터럴 -- Heap 
 *        데이터형 |
 *               변수
 *               --- 스택 
 *     3) String s="Hello Java"
 *        char[] c={'H','e','l','l','o',' ','J','a','v','a'}
 *                   0   1   2   3   4   5   6   7   8   9
 *        문자열 : index번호가 0부터
 *     4) 기능 : 메소드 
 *        메소드 => 리턴형 / 매개변수 
 *        
 *        1. charAt() ==> 원하는 위치의 문자를 추출 
 *           원형 
 *              char charAt(int index)
 *              ----        ---------- 매개변수
 *              | 리턴형 (처리 결과값)
 *        **2. length() : 문자의 갯수 
 *           원형 
 *              int length()
 *              ---      --- 매개변수 없이 
 *        3. 비교 
 *           **equals() : == (주소)
 *                      같은 문자열인 확인 
 *                          -----  
 *                      => 로그인 / 아이디 중복 체크 
 *           원형 
 *               boolean equals(String s)
 *           equalsIgnoreCase() : 대소문구분 없이 비교 
 *                      => 이름 
 *               boolean equalsIgnoreCase(String s)
 *           --------------------------------------------
 *           contains() : 포함된 문자열 ******
 *                      => 검색 
 *               **boolean contains(String s) => LIKE '%검색어%'
 *           startsWith() : 시작 문자열이 같은 경우
 *                      => 자동 완성기         => LIKE '검색어%'
                 **boolean startsWith(String s)
 *           endsWith() : 끝문자열이 같은 경우 
 *               boolean endsWith(String s)  => LIKE '%검색어'
 *           ----------------------------- png/jpg/gif 
 *             
 */
import javax.swing.*;
public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        String msg="Hello Java!!";
//        System.out.println("문자 갯수:"+msg.length());
//        int count=0;
//        for(int i=0;i<msg.length();i++)
//        {
//        	//System.out.println(i+"."+msg.charAt(i));
//        	char c=msg.charAt(i);
//        	if(c=='a' || c=='A')
//        	{
//        		count++;
//        	}
//        }
//        System.out.println("A,a의 갯수:"+count);
		String myId="hong";
		String myPwd="1234";
		
		String id=JOptionPane.showInputDialog("아이디 입력:");
		String pwd=JOptionPane.showInputDialog("비밀번호 입력:");
		
		if(id.equalsIgnoreCase(myId) && pwd.equals(myPwd))
		{
			JOptionPane.showMessageDialog(null, "로그인되었습니다");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "아이디나 비밀번호가 틀립니다");
		}
        
	}

}
