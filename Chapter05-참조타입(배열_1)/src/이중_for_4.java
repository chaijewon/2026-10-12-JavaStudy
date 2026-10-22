
public class 이중_for_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aaa:
        for(int i=1;i<=3;i++)
        {
        	for(int j=1;j<=3;j++)
        	{
        		if(j==2)
        			break aaa; // 자신의 반복문만 제어
        			// continue;
        		System.out.println("i="+i+",j="+j);
        	}
        }
	}

}
