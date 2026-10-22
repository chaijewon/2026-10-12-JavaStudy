import java.util.*;
/*
 *    
 *    3자리 정수 => 맞추는 프로그램 
 *    ----------------------------------
 *    힌트 
 *        포함 숫자가 있다 
 *        ------------
 *          = 같은 자리 : S
 *          = 다른 자리 : B
 *        123  => 235 ==> 0S-2B
 *                135 ==> 1S-1B
 *                123 ==> 3S => 종료
 *                
 *                1. break / continue
 *    ---------------------------------
 *    
 */
public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] com=new int[3];
        for(int i=0;i<com.length;i++)
        {
        	com[i]=(int)(Math.random()*9)+1; // 1~9
        	for(int j=0;j<i;j++)
        	{
        		if(com[j]==com[i])
        		{
        			i--;
        			break;
        		}
        	}
        }
        
	}

}
