package com.sist.etc;
/*
 *   Collections : Collection을 제어하는 클래스 
 *   Arrays : 배열을 제어하는 클래스 
 *   --------------------------------------
 *   모아서 출력 
 *   Iterator / ListIterator 
 *   
 *   => ArrayList / HashMap / HashSet 
 *   
 *   Iterator / ListIterator
 *   자바 컬렉션에 저장된 데이터를 하나씩 꺼내서 사용하는 방법 
 *                          --------------
 *   = 컬렉션의 데이터를 처음부터 끝까지 읽을 수 잇다 
 *   = 데이터를 읽으면서 삭제할 수 있다 
 *   = 한 방향으로 이동 
 *   --------------------------------------
 *   주요 메소드
 *   hasNext() => 확인 while(hsNext()) 
 *   next()    => 실제 데이터 읽기 
 *   remove()  => 현재 데이터 삭제 
 *   => 컬렉션 전체에서 사용 
 *   => ListIterator => List에서 사용이 가능 
 */
import java.util.*;
public class Iterator_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<10;i++)
        {
        	int a=(int)(Math.random()*10)+1;
        	list.add(a);
        }
        
        System.out.println("======= 목록 출력 ======");
        System.out.println(list);
        Collections.sort(list); // Arrays.sort()
        System.out.println("====== 정렬후 =======");
        System.out.println(list);
        
        List<String> list2=new ArrayList<String>();
        list2.add("홍길동");
        list2.add("홍길수");
        list2.add("홍길이");
        list2.add("홍길찬");
        list2.add("홍길신");
        Collections.sort(list2);
        System.out.println(list2); // ASC */
		List<String> list=new ArrayList<String>();
		list.add("사과");
		list.add("배");
		list.add("참외");
		list.add("수박");
		list.add("바나나");
		// Iterator생성 
		Iterator<String> it=list.iterator();
		// 데이터 출력 
		while(it.hasNext())
		{
			String f=it.next();
			if(f.equals("참외"))
				it.remove();
			System.out.println(f);
		}
		System.out.println(list);
		// Set / Map 
		/*while(it.hasNext())
		{
			String f=it.next();
			System.out.println(f);
		}*/
	}

}
