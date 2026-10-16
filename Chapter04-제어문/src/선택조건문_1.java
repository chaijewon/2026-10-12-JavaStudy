/*
 *     true/false나눠서 작업 => 웹에서 가장 많이 사용
 *     형식) 
 *         if(조건)
 *         {
 *            조건 true명 실행문장 
 *         }
 *         else
 *         {
 *            조건 false일때 
 *         }
 *         
 *         if(조건)
 *         {
 *         }
 *         if(!조건)
 *         {
 *         }
 *         
 *         => 기본 
 *            1. 형식 
 *            2. 코딩 순서 / 동작 순서 
 *            3. 활용 
 *            4. 응용 
 *               ---- 영화 예매 
 *         
 */
public class 선택조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=11;
        if(a%2==0)
        {
        	// true
        	System.out.println(a+"은 짝수다");
        }
        //if(a%2!=0)
        else
        {
        	// false
        	System.out.println(a+"은 홀수다");
        }
	}

}
