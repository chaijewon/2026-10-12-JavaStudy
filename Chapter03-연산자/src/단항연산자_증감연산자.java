/*
 *    증감연산자 / 형변환연산자 / 산술연산자 / 비교연산자 / 논리연산자 / 대입 연산자
 *    --------
 *      ++ , -- : 한개 증가 / 한개 감소 => 반복문에서 주로 사용 
 *                카운트 처리 
 *                장바구니 / 게임 / 검색 결과 / 좋아요 / 찜 갯수 
 *      전위연산 / 후위연산 
 *      => int a=10;
 *         ++a => 먼저 증가 나중에 대입 
 *         a++ => 먼저 대입 나중에 증가 
 *         
 *         int a=10;
 *         int b = a++;
 *             -----
 *             b=a 1
 *             a=a+1 2
 *         
 *         int a=10;
 *         int b=++a;
 *               --
 *               a=a+1
 *             b=a
 *             
 *             
 *         int a=10;
 *         int b= ++a + ++a + a++
 *                11    12    12  ==> 35
 *                
 *         int a=10;
 *                    +1         +1
 *         int b= a++ + ++a + a++ + ++a
 *                10     12   12     14 ==> 48
 *         
 */
public class 단항연산자_증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        System.out.println("a="+a); // 10
        a++;
        System.out.println("a="+a); // 11
        a++;
        System.out.println("a="+a); // 12
        
        a=10;
        System.out.println("a="+a); // 10
        ++a;
        System.out.println("a="+a); // 11
        ++a;
        System.out.println("a="+a); // 12
        
        
        System.out.println("=================");
        a=10;
        System.out.println("a="+ ++a); // 증가한후 출력 
        System.out.println("a="+ ++a);
        System.out.println("a="+ ++a);
        
        a=10;
        System.out.println("a="+ a++); // 출력하고 증가
        System.out.println("a="+ a++);
        System.out.println("a="+ a++);
        
        System.out.println("===============");
        a=10;
        System.out.println("a="+a); // 10
        a--;
        System.out.println("a="+a); // 9
        a--;
        System.out.println("a="+a); // 8
        
        a=10;
        System.out.println("a="+a); // 10
        --a;
        System.out.println("a="+a); // 9
        --a;
        System.out.println("a="+a); // 8
        
        
        System.out.println("=================");
        a=10;
        System.out.println("a="+ --a); // 증가한후 출력  9
        System.out.println("a="+ --a); // 8
        System.out.println("a="+ --a); // 7
        
        a=10;
        System.out.println("a="+ a--); // 출력하고 증가 10
        System.out.println("a="+ a--); // 9
        System.out.println("a="+ a--);  //8
        
        /*
         *   한개 증가 
         *   int a=10
         *       a++ / ++a 
         *       a=a+1
         *       a+=1
         */
        
	}

}
