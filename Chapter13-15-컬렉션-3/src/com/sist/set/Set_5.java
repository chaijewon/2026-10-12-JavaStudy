package com.sist.set;
import java.util.*;
public class Set_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] names={
        	"홍길동","심청이","춘향이","박문수","강감찬",
        	"이순신","김두한","홍길동","박문수","심청이"
        };
        // 배열 => List로 변경 asList
        List<String> list=Arrays.asList(names);
        System.out.println("===== 전체 회원 목록 =====");
        for(String name:list)
        {
        	System.out.println(name);
        }
        System.out.println("===== 중복 제거 =======");
        Set<String> set=new HashSet<String>();
        set.addAll(list);
        System.out.println("===== 전체 회원 목록 =====");
        for(String name:set)
        {
        	System.out.println(name);
        }
        
        List<String> list2=new ArrayList<String>();
        list2.addAll(set);
        System.out.println("===== 전체 회원 목록 =====");
        for(String name:list2)
        {
        	System.out.println(name);
        }
        // Set => 중복 제거 
        // List가 제어가 간단하기 때문에 => index를 이용한다 
        
        
	}

}
