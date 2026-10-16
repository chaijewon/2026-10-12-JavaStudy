/*
 *    사용자 => 년도 입력  : year 
 *            --------
 *            | 윤년인지 확인 
 *              = 4년마다 
 *                year%4==0
 *              = 100년마다 제외
 *                year%100!=0 
 *              = 400년마다
 *                year%400==0
 *              ------------- 로마시대 
 *          (year%4==0 && year%100!=0) || year%400==0
 *          ---------------------------------------
 *          윤년 처리 공식 
 */
import java.util.Scanner;
public class 단일조건문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        int b=20;
        int mx=a,mi=a;
        if(a<b)
        	mx=b;
        	//System.out.println("최소값:"+a);
        else
        	mi=a;
        	//System.out.println("최대값:"+b);
        System.out.println("최소값:"+Math.min(a, b));
        System.out.println("최대값:"+Math.max(a, b));
	}

}






