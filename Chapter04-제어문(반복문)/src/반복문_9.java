// 한개의 정수를 받아서 1부터 시작해서 입력받은 정수까지의 합을 출력 
// 10 1~10 / 5 1~5
import java.util.Scanner;
public class 반복문_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("정수 입력:");
        int num=scan.nextInt();
        
        int sum=0;
        //  초기값    조건식  증가식
        for(int i=1;i<=num;i++)
        {
        	sum+=i; // 실행문장 
        }
        System.out.println("1~"+num+"까지의 합:"+sum);
        /*
         *   반복문 
         *     초기값 : 어디부터 시작 
         *     조건식 : 어디까지 
         *     증가식 : 몇번 수행 
         *     ------------------ 어떤 문장을 반복 수행할 지 
         *     
         *     자바에서 지원하는 모든 제어문은 한문장만 수행한다 
         *      => 여러개의 문장 사용시에는 {}
         *      => 제어문 => {}
         */
	}

}
