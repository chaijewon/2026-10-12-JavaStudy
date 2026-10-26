import java.util.*;
/*
 *   객체지향프로그램 
 *     객체 <==> 객체 
 *           |
 *          메소드 : 메세지(통신시에 사용) 
 */
public class 숫자야구게임_메소드 {
    static int[] rand()
    {
    	int[] com=new int[3];
        // 1 ~ 9 => 중복 없이 
        for(int i=0;i<com.length;i++)
        {
        	com[i]=(int)(Math.random()*9)+1;
        	// 중복 
        	for(int j=0;j<i;j++)
        	{
        		if(com[i]==com[j])
        		{
        			i--;
        			break;
        		}
        	}
        }
        return com;
    }
    static int[] userInput()
    {
    	Scanner scan=new Scanner(System.in);
        int[] user=new int[3];
        while(true)
        {
        	System.out.print("세자리 정수를 입력하세요:");
        	int input=scan.nextInt();
        	
        	if(input<100 || input>999)
        	{
        		System.err.println("잘못된 입력입니다. 세자리 정수만 입력해야 됩니다");
        		continue;
        	}
        	/*
        	 *    369/100  ==> 3
        	 *    369%100 => 69/10  6
        	 *    369%10  => 9
        	 */
        	user[0]=input/100;
        	user[1]=(input%100)/10;
        	user[2]=input%10;
        	
        	if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
        	{
        		System.err.println("같은 수는 사용할 수 없습니다!!");
        		continue;
        	}
        	
        	if(user[0]==0 || user[1]==0 || user[2]==0)
        	{
        		System.err.println("0은 사용할 수 없습니다!!");
        		continue;
        	}
        	break;
        }
        return user;
    }
    static void hint()
    {
    	
    }
    static int exit(int s)
    {
    	return 1;
    }
    static void process()
    {
    	int[] com=rand();
    	System.out.println(Arrays.toString(com));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
