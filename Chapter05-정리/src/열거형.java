// 상수를 쉽게 관리하는 클래스 일종 
/*
 *    enum 전화번호{
 *       서울("02"),
 *       ..
 *       ..
 *       ..
 *       ..
 *       ..
 *    }
 *    
 *    => 정해진 값 하나를 선택할 사용 
 *       ------- 상수
 *       예) 요일 , 주문 상태 , 사용자 권한 , 결제 상태 
 *       enum Week{
 *         일요일 , 월요일 ....
 *       }
 *       
 */
import java.util.*;
// 서버 연결 
/*
 *    LOGIN
 *    LOGOUT
 *    MAKEROOM
 *    ROOMIN 
 */
enum 전화국번{
	서울("02"),
	경기도("031"),
	인천("032"),
	강원도("033"),
	충청남도("041"),
	대전("042"),
	충청북도("043"),
	세종("044"),
	부산("051"),
	울산("052"),
	대구("053"),
	경상북도("054"),
	경상남도("055"),
	전라남도("061"),
	광주("062"),
	전라북도("063"),
	제주("064");
	
	String code;
	전화국번(String code)
	{
		this.code=code;
	}
	String getCode()
	{
		return code;
	}
}
public class 열거형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("지역 입력:");
        String loc=scan.next();
        
        for(전화국번 n:전화국번.values())
        {
        	if(n.name().contains(loc))
        	{
        		System.out.println(loc+"의 국번은 "+n.getCode());
        	}
        }
        System.out.println(032);
	}

}
