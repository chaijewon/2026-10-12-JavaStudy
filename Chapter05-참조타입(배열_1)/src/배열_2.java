/*
 *    Arrays.copyOf()
 *       => 기존의 배열의 내용을 복사해서 => 새로운 배열을 만든 메소드 
 *          => 배열의 크기 UP / DOWN
 *    Arrays.copyOf(기존배열,length)
 *                    |      |
 *                    5      3
 */
import java.util.*;
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //int[] arr={100,200,300};
        /*int[] copy=Arrays.copyOf(arr, 2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copy));
        
        int[] copy2=new int[5];
        for(int i=0;i<arr.length;i++)
        {
        	copy2[i]=arr[i];
        }
        
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copy2));*/
        /*
         *   System.arraycopy()
         *    배열의 데이터를 다른 배열로 복사하는 메소드 
         */
        int[] arr= {10,20,30,40,50};
        int[] target=new int[5]; // target[5]
        System.arraycopy(arr, 2, target, 0, 3);
        //                | 원본
        //                    | 시작 인덱스
        //                         | 복사해서 저장 위치
        //                               | target 인덱스번호 
        //                                  | 갯수
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(target));
        /*
         *        System.arraycopy()      Arrays.copyOf() ==> ***
         *   목적  기존의 배열 데이터 복사       새로운 배열 생성 => 복사
         *        ...
         *   매개변수      5                      2
         *   복사범위   시작위치 => 갯수 지정   처음부터 지정된 길이만큼 
         *   배열크기   자동 변경 안됨         원하는 크기로 변경이 가능 
         *   주요사용   부분 복사 / 배열 통합    배열 크기 변경 / 전체복사
         *   
         *   참조  a=b /  Call By Reference 
         *   Arrays.copyOf() / clone()
         *   | 배열 변경 => 확대 / 축소 ======> 검색
         */
	}

}
