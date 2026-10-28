/*
 *   클래스 
 *     객체를 만들기 위한 설계도 => 설계도되로 사용 (객체) 
 *     클래스는 데이터형 / 객체 클래스변수 
 *     ---------------------------
 *     종류 
 *      ***= 데이터만 가지고 있는 경우 => ~VO , ~DTO
 *         => 데이터 모아서 관리 
 *        데이터클래스 / 사용자 정의 데이터형 
 *      = 메소드만 가지고 있는 경우 => ~DAO , ~Service , ~Manager
 *        액션 클래스 
 *      = 혼합 (데이터+메소드)
 *                   int malloc(클래스)
 *      Scanner scan=new Scanner(System.in)
 *                |  --- ------- 생성자 InputStream in=null
 *                |   | ---> finalize()
 *                -----
 *      클래스안에 선언되는 모든 변수
 *         => 기본 초기값이 존재 
 *            int == 100
 *            long == 0L
 *            double == 0.0
 *            float == 0.0F
 *            boolean == false
 *            String  == null
 *            
 *                
 *     클래스 구성 
 *     ---------
 *     class ClassName{
 *       ------------------
 *        변수 
 *          = 인스턴스 변수 : 객체마다 메모리를 따로 저장이 가능 
 *          = 정적 변수 (static) : 메모리 공간 1개만 => 공유 
 *          = 프로그램 종료시까지 유지 
 *       ------------------
 *        생성자 
 *          = 변수 초기화 
 *       ------------------
 *        메소드
 *       ------------------
 *       
 *     }
 *     
 */
class Student
{
	String name="홍길동";
	int hakbun=1;
	String sex;	
	Student() {
		// TODO Auto-generated constructor stub
	}
	Student(String n,int h,String s) {
		// TODO Auto-generated constructor stub
		name=n;
		hakbun=h;
		sex=s;
	}
}
/*
 *   Student hong=new Student("홍길동",1,"남자");
 *   ------------
 *   
 *       stack                heap
 *       hong
 *   -----------------    Student@2ff4acd0
 *   Student@2ff4acd0 ->  ------name-------
 *                            "홍길동"  hong.name .(주소 접근 연산자)
 *   -----------------    ------hakbun------
 *                               1
 *                        -------sex-------
 *                               남자
 *                        ----------------
 *       shim
 *   -----------------    Student@54bedef2
 *   Student@54bedef2 ->  ------name-------
 *                            "심청이"
 *   -----------------    ------hakbun------
 *                               2
 *                        -------sex-------
 *                               여자
 *                        ----------------
 *                        
 */
public class 클래스_1 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student hong=new Student("홍길동",1,"남자");
        // 생성자 => 초기화 : 일반 데이터(X) 
        // 외부 데이터를 읽어서 초기화 
        System.out.println(hong.name);
        System.out.println(hong);
        Student shim=new Student("심청이",2,"여자");
        System.out.println(shim.name);
        System.out.println(shim);
        Student park=new Student("박문수",1,"남자");
        System.out.println(park.name);
        System.out.println(park);
        
	}

}
