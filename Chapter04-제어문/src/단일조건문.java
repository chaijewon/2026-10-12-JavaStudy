/*
 *    if(조건문) 
 *    {
 *       조건이 true면 수행문장 
 *    }  
 *    {} => 한개의 문장만 수행  ==> (for = if)
 *    
 *    조건문 : true/false가 나오는 연산자 사용 
 *    
 *    배수  % 
 *        num%3==0 
 *        --------
 *        num>=0 && num<=2
 *        -----------------
 *     
 */
import java.util.Scanner;
public class 단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        int com=(int)(Math.random()*3); // 0, 1, 2
        //            ------------- 0.0 ~ 0.99 ==> 0~2
        System.out.print("가위(0),바위(1),보(2):");
        int user=scan.nextInt();
        String[] ss= {"가위","바위","보"};
        System.out.print("컴퓨터:"+ss[com]);
        /*if(com==0)
        	System.out.print("가위");
        if(com==1)
        	System.out.print("바위");
        if(com==2)
        	System.out.print("보");*/
        
        System.out.println();
        System.out.print("사용자:"+ss[user]);
        /*
        System.out.print("사용자:");
        if(user==0)
        	System.out.print("가위");
        if(user==1)
        	System.out.print("바위");
        if(user==2)
        	System.out.print("보");*/
        
        System.out.println("\n====== 결과 =======");
        /*if(com==0 && user==0)
        	System.out.println("비겼다");
        if(com==0 && user==1)
        	System.out.println("사용자 win");
        if(com==0 && user==2)
        	System.out.println("컴퓨터 win");
        
        if(com==1 && user==0)
        	System.out.println("컴퓨터 win");
        if(com==1 && user==1)
        	System.out.println("비겼다");
        if(com==1 && user==2)
        	System.out.println("사용자 win");
        
        if(com==2 && user==0)
        	System.out.println("사용자 win");
        if(com==2 && user==1)
        	System.out.println("컴퓨터 win");
        if(com==2 && user==2)
        	System.out.println("비겼다");*/
        int res=com-user;
        if(res==-1 || res==2)
        	System.out.println("사용자 win");
        if(res==1 || res==-2)
        	System.out.println("컴퓨터 win");
        if(res==0)
        	System.out.println("비겼다");
        
        /*
         *      com-user
         *   com = 0  
         *           user = 0 ======> 0
         *           user = 1  user==> -1
         *           user = 2  com ==> -2
         *   com = 1  
         *           user = 0  com == 1
         *           user = 1      == 0
         *           user = 2  user == -1
         *   com = 2  
         *           user = 0  user ==> 2
         *           user = 1  com  ==> 1
         *           user = 2  ==> 0
         *   user => -1 , 2
         *   com  => 1 , -2
         *           
         *           
         */
        
	}

}
