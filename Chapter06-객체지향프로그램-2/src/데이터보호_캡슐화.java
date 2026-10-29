/*
 *    캡슐화 : 데이터 보호할 목적으로 사용 
 *    -----
 *      접근 지정어 
 *      
 *      ----------------------------------------------
 *             자신의 클래스  같은 폴더  같은 폴더+상속  모든 클래스
 *                         (패키지)
 *      ----------------------------------------------
 * private         O
 *      ----------------------------------------------
 * default         O         O
 *      ----------------------------------------------
 * protected       O         O          O
 *      ----------------------------------------------
 * public          O         O          O          O
 *      ----------------------------------------------
 *      private : 인스턴스 변수 
 *      public : 생성자 , 메소드 , 클래스
 *      ----------------------------
 *      public을 사용하는 인스턴스 
 *        |= 윈도우 Button / TextField 
 *        
 *      형식)
 *           변수 
 *           => 접근지정어 데이터형 변수명 
 *              제어어 : static / final
 *                               | 마지막인 
 *                     | 공통적인 
 *           메소드 
 *           => 접근지정어 리턴형 메소드명(매개변수) 
 *              제어어 : static / final / abstract
 *                                      | 추상적인 => 구현없이 선언만 가능 
 *                              | 마지막인 
 *                     | 공통적인 
 *           생성자 
 *           => 접근지정어 클래스명()
 *           클래스 
 *           => 접근지정어 class ClassName
 *              제어어 : final / abstract / static 
 *                     |=> System/String/Math
 *      
 */
import lombok.*;
@Data
class Sawon{
	//@Getter
	//@Setter
  	private int sabun;
	//@Getter
	//@Setter
  	private String name;
  	protected String job;
  	String dept;
  	public int pay;
  	
	/*public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;

import lombok.Getter;


import lombok.Setter;

}*/
  	
}
public class 데이터보호_캡슐화 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sawon s=new Sawon();
        s.job="과장";
        s.dept="개발부";
        s.pay=4500;
        s.setSabun(1);
        s.setName("홍길동");
        
        System.out.println(s.getName());
        System.out.println(s.getSabun());
        System.out.println(s.job);
        System.out.println(s.dept);
        System.out.println(s.pay);
        
	}

}
