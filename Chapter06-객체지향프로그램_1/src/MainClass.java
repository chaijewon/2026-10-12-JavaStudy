/*
 *   class A
 *   {
 *      int a=200,b,c,d,e,f;
 *   }
 *   class B extends A
 *   {
 *      //int a,b,c,d,e,f;
 *   }
 *   
 *   B b=new B()
 *   
 *       b  ------super-------------
 *           int a,b,c,d,e,f
 *         -------this------------
 *           
 *         -----------------------
 *         Student s=malloc(Student)
 *                   --------------- new Student()
 *                   delete s => free(s)
 *                   ------------------- GC
 *         모든 클래스는 this를 가지고 있다 
 */
import java.util.*;
class Student
{
	int hakbun; // 0
	String name; // null
	int kor,eng,math;
	static String schoolName;
	// this , super
	Student() {
		// TODO Auto-generated constructor stub
		System.out.println("변수의 초기화 담당");
		System.out.println("처음 실행시 기능이 필요한 경우...");
		System.out.println("this="+this);
		
	}
	// 매개변수가 있는 생성자 => 초기값을 다르게 만들 경우 
	public Student(int hakbun, String name, int kor, int eng, int math) {
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		System.out.println("this:"+this);
	}

	
	
}
public class MainClass {
	int a;
    public MainClass(int a) {
		// TODO Auto-generated constructor stub
    	System.out.println("MainClass="+this);
    	this.a=a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MainClass m=new MainClass();
		Student std=new Student();
		System.out.println("std="+std);
		// this=std
		Student std2=new Student();
		// this=std2
		System.out.println("std2="+std2);
		Student s1=new Student(2, "홍길동",90, 90, 90);
		System.out.println("s1="+s1);
		Student s2=new Student(2, "심청이",70, 70, 70);
		System.out.println("s2="+s2);
		Student s3=new Student(3, "박문수",80, 80, 80);
		System.out.println("s3="+s3);
		//Student[] std=new Student[3];
		System.out.println("학번:"+s1.hakbun);
		System.out.println("이름:"+s1.name);
		System.out.println("국어:"+s1.kor);
		System.out.println("영어:"+s1.eng);
		System.out.println("수학:"+s1.math);
		
		System.out.println("학번:"+s2.hakbun);
		System.out.println("이름:"+s2.name);
		System.out.println("국어:"+s2.kor);
		System.out.println("영어:"+s2.eng);
		System.out.println("수학:"+s2.math);
		
		System.out.println("학번:"+s3.hakbun);
		System.out.println("이름:"+s3.name);
		System.out.println("국어:"+s3.kor);
		System.out.println("영어:"+s3.eng);
		System.out.println("수학:"+s3.math);
		
	}

}
