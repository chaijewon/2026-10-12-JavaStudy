/*
 *    논리연산자 
 *       &&   ||
 *       ---  ---
 *            | 병렬연산자 
 *       | 직렬연산자 
 *       
 *       형식) 
 *           (조건) && (조건) 
 *           -----   ------ true/false => 비교연산자 , 부정연산자 
 *           true     true   ==> true 
 *           true     false  ==> false
 *           false    true   ==> false
 *           false    false  ==> false
 *           => 사용 : 범위안에 포함된 경우 / id , pwd 
 *            |         |
 *            -----------
 *               | 결과값 추출 
 *           
 *           (조건) || (조건) 
 *           -----   ------ true/false => 비교연산자 , 부정연산자 
 *           true     true   ==> true 
 *           true     false  ==> true
 *           false    true   ==> true
 *           false    false  ==> false
 *           => 사용 : 범위밖에 있는 경우 
 *            |         |
 *            -----------
 *               | 결과값 추출 
 */
import java.util.Scanner;
public class 이항연산자_논리연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("알파벳 입력:");
        char c=scan.next().charAt(0);
        
        System.out.println(c>='A' && c<='Z');
        System.out.println(c>='a' && c<='z');
        
        System.out.println(
        		!((c>='A' && c<='Z')||(c>='a' && c<='z'))
        );
        
	}

}
