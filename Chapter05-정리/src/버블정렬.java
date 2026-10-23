// 인접한 수끼리 비교 => 마지막부터 고정 
/*
 *    30  20  50  10  40
 *    --  --
 *    20  30
 *        --  --
 *        30  50
 *            --  --
 *            10  50
 *                --  --
 *                40  50
 *    -------------------
 *    20  30  10  40  50
 *    --  --
 *    20  30
 *        --  --
 *        10  30 
 *            --  --
 *            30  40
 *    -------------------
 *    20  10  30  40  50
 *                ------
 *    --  --
 *    10  20
 *        --  --
 *        20  30
 *    -------------------
 *    10  20  30  40  50
 *            ----------
 *    --  --
 *    10  20
 *    -------------------
 *    10  20  30  40  50
 *        ---------------
 *    
 *    i   js  je
 *    0   0   4
 *    1   0   3
 *    2   0   2
 *    3   0   1
 *    
 *    => i+je=4 ==> je=4-i
 *    
 *    
 *    이중 for : web (X) ==> 라이브러리 
 *    문자열배열 : web (X) ==> ArrayList
 *    ------------------- 애플리케이션 
 *    
 */
import java.util.*;
public class 버블정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
        // 초기화 
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("정렬전:"+Arrays.toString(arr));
        
        Arrays.sort(arr);
        /*for(int i=0;i<arr.length-1;i++)
        {
        	for(int j=0;j<arr.length-1-i;j++)
        	{
        		if(arr[j]>arr[j+1])
        		{
        			int temp=arr[j];
        			arr[j]=arr[j+1];
        			arr[j+1]=temp;
        		}
        	}
        }*/
        System.out.println("정렬후:"+Arrays.toString(arr));
	}

}
