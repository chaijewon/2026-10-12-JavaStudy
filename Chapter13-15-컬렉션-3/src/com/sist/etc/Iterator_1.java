package com.sist.etc;
/*
 *   Collections : Collection을 제어하는 클래스 
 *   Arrays : 배열을 제어하는 클래스 
 *   --------------------------------------
 *   모아서 출력 
 *   Iterator / ListIterator 
 *   
 *   => ArrayList / HashMap / HashSet 
 */
import java.util.*;
public class Iterator_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> list=new ArrayList<Integer>();
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
        System.out.println(list2); // ASC 
	}

}
