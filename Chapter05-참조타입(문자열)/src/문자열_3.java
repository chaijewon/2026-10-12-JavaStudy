// 변환 
/*
 *     toUpperCase()
 *       => 대문자 변환  
 *     toLowerCase()
 *       => 소문자 변환 
 *     ***replace() : 일반 문자 
 *       => 문자변경 / 문자열 변경 
 *     replaceAll() : 정규식
 *       한글 전체 / 알파벳 전체 / 숫자 전체 
 *       [가-힣]    [A-Za-z]   [0-9] 
 *       => 문자변경 / 문자열 변경
 *       
 *     IP 
 *       [0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}
 *       
 *       <span class="rank"><span class="rank-up">1<span class="hide">상승</span></span></span>
 *       1상승
 */
import java.util.Scanner;
public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Scanner scan=new Scanner(System.in);
//        System.out.print("알파벳 입력:");
//        String alpha=scan.nextLine();
        /*
         *   nextLine() ABCD EFG
         *   next()  ABCD EFG
         *   
         *   UPPER / LOWER 
         */
//        System.out.println(alpha.toUpperCase());
//        System.out.println(alpha.toLowerCase());
//        System.out.println(alpha);
		String msg="Hello Java!!";
		System.out.println(msg=msg.replace('a', 'b'));
		System.out.println(msg); // Jbvb
		System.out.println(msg=msg.replace("Jbvb", "Oracle"));
		System.out.println(msg);
		
		/*
		 *   String s="a"
		 *          s="b"
		 *          
		 *          int a=10
		 *              a=5
		 */
		String s="ABDC가나다라12345";
		System.out.println(s.replaceAll("[가-힣]", ""));
		System.out.println(s.replaceAll("[A-Z]", ""));
		System.out.println(s.replaceAll("[0-9]", ""));
		System.out.println(s.replaceAll("[^가-힣]", ""));
	}

}
