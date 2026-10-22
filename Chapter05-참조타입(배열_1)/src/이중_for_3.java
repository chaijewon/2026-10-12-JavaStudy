// 등수 구하기
/*
 *    3명 국어 / 영어 / 수학 / 총점 / 평균 / 학점 / 등수 
 *    
 *    형식 
 *    
 *                1    2 => 종료 false 
 *          for(초기값;조건식;증가식)
 *          {         |    |false
 *                  3     4    6
 *             for(초기값;조건식;증가식)
 *             {
 *                반복 수행문장  5
 *             }
 *          }
 */
import java.util.*;
public class 이중_for_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] score=new char[3];
		int[] rank=new int[3];
		
		for(int i=0;i<3;i++)
		{
			System.out.print((i+1)+"' 국어 입력:");
			kor[i]=scan.nextInt();
			
			System.out.print((i+1)+"' 영어 입력:");
			eng[i]=scan.nextInt();
			
			System.out.print((i+1)+"' 수학 입력:");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
			
			//   정수/문자/문자열
			switch((total[i]/30)) // //
			{
			case 10,9 -> score[i]='A';
			case 8 -> score[i]='B';
			case 7 -> score[i]='C';
			case 6 -> score[i]='D';
			default -> score[i]='F';
			}
		}
		// 등수 구하기 
		for(int i=0;i<3;i++)
		{
			rank[i]=1;
			for(int j=0;j<3;j++)
			{
				if(total[i]<total[j])
				{
					rank[i]++;
				}
			}
			
		}
		// 결과값 
		System.out.println("================성적표=================");
		for(int i=0;i<3;i++)
		{
			System.out.printf(
			  "%-5d%-5d%-5d%-7d%-7.2f%5c%5d\n",
			   kor[i],eng[i],math[i],total[i],avg[i],score[i],rank[i]
			);
		}
	}

}
