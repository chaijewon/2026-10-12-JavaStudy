package com.sist.set;
// => ArrayList / HashMap / Set (접속자 목록)
import java.util.*;
// Random => 원하는 부분의 난수 발생이 가능 => nextInt(100) 0~99 
// 형변환없이 사용 
public class Set_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set<Integer> set=new HashSet<Integer>();
        Random r=new Random();
        for(int i=0;i<10;i++)
        {
        	int k=r.nextInt(100)+1; // int 전체
        	set.add(k);
        }
        TreeSet<Integer> tSet=new TreeSet<Integer>();
        tSet.addAll(set);
        System.out.println("===== 전체 데이터 =====");
        for(int i:tSet)
        {
        	System.out.print(i+" ");
        }
        //System.out.println(tSet);
        System.out.println("\n*****===== 50 이상 =====");
        System.out.println(tSet.tailSet(50));
        System.out.println("*****===== 50 이하 =====");
        System.out.println(tSet.headSet(50));
        System.out.println("===== 바로 위에 값 =====");
        System.out.println(tSet.higher(30));
        System.out.println("===== 바로 밑에 있는 값=====");
        System.out.println(tSet.lower(30));
        System.out.println("====== 같거나 큰 값 =====");
        System.out.println(tSet.ceiling(50));
        System.out.println("====== 같거나 작은 값 =====");
        System.out.println(tSet.floor(50));
        System.out.println(tSet.first());
        System.out.println(tSet.last());
        // 자동 정렬 / 검색이 빠르다 
	}

}
