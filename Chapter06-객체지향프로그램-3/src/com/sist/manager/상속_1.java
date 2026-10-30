package com.sist.manager;
/*
 *   자바 프로그램의 구조 
 *   
 *   1. package : 폴더 구조 
 *      => 관련된 클래스를 쉽게 찾기 위해서 저장 
 *      => 다른 패키지에서 사용을 하려면 => 접근지정어
 *      => 접근지정어 (접근 범위)
 *         -----------------
 *         클래스 : 모든 패키지에서 사용  
 *                public class ClassName
 *         메소드 : 모든 패키지에서 사용  
 *                 객체와 객체의 통신 
 *                public 리턴형 메소드명(매개변수...)
 *         생성자 : 모든 패키지에서 사용  
 *                public 생성자()
 *         --------------------------------------
 *         변수   : 모든 패키지에서 사용  
 *                 은닉화 : private 
 *                 --------------- 기능 공개 public 
 *                 => 읽기 / 쓰기 => 메소드 public 
 *   2. import : 라이브러리 / 사용자 정의 클래스 
 *                         | => 패키지가 다르면 import를 사용해서 가지고 온다
 *               => import 여러개 사용이 가능 
 *               => import java.util.Scanner 
 *                                   -------
 *                         java.util.*
 *                         ------------ 여러개 클래스가 가지고 올 경우
 *                         => 3개 이상이면 
 *   3. public class ClassName
 *      {
 *          ----------------------------------
 *           변수 영역 
 *             인스턴스 변수 / 정적(static) 변수
 *          ----------------------------------
 *           생성자 => 여러개가 가능하다 
 *                => 사용이 없는 경우 => 디폴트 생성자 (없는 경우 자동 생성)
 *          ----------------------------------
 *           메소드 : 기능 (변수를 이용해서 처리)
 *                => 객체 관련 기능 
 *                => 독립적인 기능 => static 
 *          ----------------------------------
 *      
 *          ==> 순서는 상관없다 
 *      }
 *      
 *   4. 프로그램에서는 변수 / 메소드 / 클래스 무조건 메모리에 저장후에 사용 
 *                       | => 여러개 저장후에 => 제어 (리모콘 역할) 
 *                         => 참조 데이터 (주소)
 *                         => new 생성자()
 *                            => 리플랙션 : class 정보 얻어서 
 *                               => 메소드 / 변수 / 메모리할당 
 *                               => 스프링 / 부트 
 *                               => ----- 클래스 관리자 
 *                         => 예외: 자동 저장 => static 
 *                 | => 일반 값을 저장후 사용
 *   5. 가급적이면 변수를 은닉화 / 사용이 가능 
 *                           --------- 기능 (읽기 getter,쓰기 setter)
 *                           --------- 캡슐화 
 *   6. 공통으로 사용 기능 : 모아서 재사용 
 *      => 반복 제거 
 *      => 확장 
 *      => 유지보수가 쉽다 
 *      => 가독성 좋다 
 *      => 상속 / 포함 
 *               | => 있는 그대로 사용 
 *         | => 기능을 변경해서 사용
 *   7. 필요시에는 기능 변경 / 추가해서 사용 
 *      ---------------------------- 다형성 
 *      
 *   8. 관련된 클래스는 한개로 묶어서 제어 => 추상화
 *                                    | 인터페이스 / 추상 클래스 
 *      => 클래스가 공동으로 사용 변수 / 메소드가 있는 경우에는 내부 클래스 
 *      => class A
 *         {
 *             접속자 명단 
 *             class B
 *             {
 *                접속자 명단 사용이 가능 
 *             }
 *         }
 *    9. 종료하지 않는 프로그램 : 예외처리 
 *    ------------------------------------- 기본 
 *    
 *    상속 
 *     = extends : 확장해서 사용 
 *       class A extends B
 *            ---       --- 상속을 내리는 클래스 (부모 , super클래스)
 *            상속을 받는 클래스 (자식 , sub클래스 , 파생클래스)
 *     = 자바 상속은 단일 상속만 가능 
 *     = 상속이 안되는 것 
 *       static : 공통으로 사용이 가능 
 *       생성자 / 초기화 블록 
 *       *** private은 상속은 된다 => 사용할 수 없다 
 *           ------------------
 *           | => protected : 상속받는 클래스까지 사용이 가능 
 *     = 공통으로 사용되는 변수/메소드를 모아서 재사용을 할 수 있게 만든다 
 *     예) 
 *         
 *         학생 
 *          => 학번 , 이름 , 성별 , 나이 , 전공  ...
 *         회사원 
 *          => 사번 , 이름 , 성별 , 나이 , 부서 ...
 *         ------------------------------------
 *         사람 
 *           이름 , 성별 , 나이 
 *           
 *         학생 extends 사람 
 *             학번 / 전공 
 *         회사원 extends 사람 
 *             사번 / 부서
 *         => 수정시에 편리 / 반복 제거 
 *            ---------- 오버라이딩
 *      
 *      예)
 *           게시판 is-a
 *            목록출력() / 글쓰기() / 상세보기() / 수정() / 삭제() / 검색()
 *           답변형게시판 has-a
 *             게시판 
 *            목록출력() / 글쓰기() / 상세보기() / 수정() / 삭제() / 검색()
 *            => 답변하기()  => 확장 
 *           댓글게시판
 *             게시판 
 *            목록출력() / 글쓰기() / 상세보기() / 수정() / 삭제() / 검색()
 *            => 댓글
 *           => 소스가 간결해 진다 / 분석도 간단하다 / 가독성 
 *       단점 
 *        제약조건 
 *        => 상속내린 클래스 메모리 할당 / 상속 받은 클래스 메모리 할당 
 *                  |                        |
 *                  --------------------------
 *                  | 메모리가 비대해 진다 
 *                  | 실행 속도가 느려진다 
 *        => 최적화 => 상속은 가급적이면 자제
 *        
 *    상속 
 *      class Super
 *      {
 *         int a;
 *         public void display(){}
 *      }
 *      
 *      class Sub extends Super => 사용
 *      {
 *         int b;
 *         public void bbb(){}
 *      }
 *      
 *      Sub sub=new Sub();
 *      ------------------   
 *       stack           heap
 *      ----sub----    
 *          100
 *      -----------      100------------------
 *                           ------super------
 *                                --a--
 *                                  0
 *                                -----
 *                                
 *                                ------------
 *                                  display()
 *                                ------------
 *                           
 *                           -----------------
 *                           
 *                           -------this------
 *                                 ---b---
 *                                    0
 *                                 -------
 *                           
 *                                  -------
 *                                    bbb()
 *                                  -------
 *                           -----------------
 *                          ------------------
 *      
 *     
 */
class Animal 
{
	int age=10;
	public void eat() {
		System.out.println("먹는다");
	}
	public void run() {
		System.out.println("걷는다");
	}
}
// age , eat() , run()
class Pig extends Animal{
	// 재정의 => 오버라이딩 
	/*
	 *   조건 
	 *    1. 상속을 받은 클래스
	 *    2. 메소드명이 동일 
	 *    3. 매개변수가 동일 
	 *    4. 리턴형이 동일 
	 *    5. 확장은 가능 / 축소는 불가능 
	 *       접근 지정어 
	 *    private < default < protected < public 
	 */
	int age;
	public Pig()
	{
		age=5;
	}
	public void eat() {
		System.out.println("돼지처럼 먹는다");
	}
	public void run() {
		System.out.println("돼지처럼 걷는다");
	}
}
class Dog extends Animal{
	int age;
	public Dog()
	{
		age=3;
	}
	public void eat() {
		System.out.println("개처럼 먹는다");
	}
	public void run() {
		System.out.println("개처럼 걷는다");
	}
}
class Horse extends Animal{
	int age;
	public Horse()
	{
		age=7;
	}
	public void eat() {
		System.out.println("말처럼 먹는다");
	}
	public void run() {
		System.out.println("말처럼 걷는다");
	}
}
/*
 *       ------------ Animal
 *        int age=10
 *        eat()
 *        run()
 *       ------------ Pig
 *        int age=5
 *        eat() => 돼지
 *        run() => 돼지
 *       ---------
 */
public class 상속_1 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal pig=new Pig();
                  // 메소드는 생성자 
        // 변수 => Animal 클래스형 
        System.out.println("나이:"+pig.age);
        pig.eat();
        pig.run();
        
        Animal dog=new Dog();
        System.out.println("나이:"+dog.age);
        dog.eat();
        dog.run();
        
        Animal horse=new Horse();
        System.out.println("나이:"+horse.age);
        horse.eat();
        horse.run();
	}

}
