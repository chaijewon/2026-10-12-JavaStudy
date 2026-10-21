// 배열 선언 => 배열 초기화 = 배열 출력 
// 배열 값 변경 
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char[] alpha=new char[10]; // 선언 
        // 초기화
        for(int i=0;i<alpha.length;i++)
        {
        	alpha[i]=(char)((Math.random()*26)+65);
        	//              0~25+65  => 65~90
        	for(int j=0;j<i;j++)
        	{
        		if(alpha[j]==alpha[i])
        		{
        			i--;
        			break;
        		}
        	}
        }
        // 'A' , 'B' , 'C'  => c='A' c='B'
        for(char c:alpha)
        {
        	System.out.print(c+" ");
        }
	}

}
