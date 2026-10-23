// Arrays.sort()
/*
 *    30  20  50  10  40  => 올림차순 (ASC)/ 내림차순 (DESC)
 *    --  --
 *    20  30                 i=0 j=1~4
 *    --      -- 
 *    20      50             i=1 j=2~4
 *    --          --
 *    10          20         i=2 j=3~4
 *    --              --     i=3 j=4
 *    10              40
 *    ------------------------- 1 round
 *    10  30  50  20  40
 *        --  --
 *        30  50
 *        --      --
 *        20      30
 *        --          --
 *        20          40
 *   --------------------------- 2 round
 *    10  20  50  30  40
 *            --  --
 *            30  50
 *            --      --
 *            30      40
 *   --------------------------- 3 round
 *    10  20  30  50  40
 *                --  --
 *                40  50
 *   --------------------------- 4 round
 *    10  20  30  40  50
 *                    --
 *                    
 *    i   j(s)  j(e)   i+1=j => j=i+1  j=4 
 *    0    1     4
 *    1    2     4
 *    2    3     4
 *    3    4     4
 *    ----------------
 *        
 */
import java.util.*;
public class 선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*int[] arr=new int[5];
        // 초기화 
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("정렬전:"+Arrays.toString(arr));
        
        for(int i=0;i<arr.length-1;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]>arr[j])
        		{
        			int temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        		System.out.println((i+1)+"Round:"+Arrays.toString(arr));
        	}
        	
        }
        System.out.println("정렬후:"+Arrays.toString(arr));*/
		char[] arr=new char[5];
        // 초기화 
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(char)((Math.random()*26)+65);
        }
        System.out.println("정렬전:"+Arrays.toString(arr));
        
        for(int i=0;i<arr.length-1;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]<arr[j])
        		{
        			char temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        		System.out.println((i+1)+"Round:"+Arrays.toString(arr));
        	}
        	
        }
        System.out.println("정렬후:"+Arrays.toString(arr));
		
	}

}
