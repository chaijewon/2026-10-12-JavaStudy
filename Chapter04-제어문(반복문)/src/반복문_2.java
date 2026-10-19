// => 1~100까지의 총합 
/*
 *    변수의 범위 
 *    
 *    if(조건)
 *    {
 *       int a=10;
 *       if(조건)
 *       {
 *          int b=20;
 *          if(조건)
 *          {
 *             int c=30;
 *          } // c
 *       }// b
 *       
 *    }// a
 */
public class 반복문_2 {
    // 지역변수는 {}을 안에서만 사용이 가능 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 누적변수 1~100합 
		int sum=0; // main에서 사용되는 변수 => 장바구니  
		for(int i=1;i<=100;i++)
		{
			//int sum=0;
			System.out.println("sum="+sum+",i="+i);
			sum+=i;
			// sum=sum+i => sum=0 , i=1 => sum=1
			//              sum=1 , i=2 => sum=3
			//              ... sum=4950 , i=100 => sum=5050
		}
		System.out.println("1~100까지의 합:"+sum);
	}

}
