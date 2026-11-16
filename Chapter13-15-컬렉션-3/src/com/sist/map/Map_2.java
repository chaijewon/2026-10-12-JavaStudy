package com.sist.map;
import java.util.*;
public class Map_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<String,String> map=new HashMap<String,String>();
        map.put("boardList", "SELECT * FROM board");
        map.put("boardDetail", "SELECT * FROM board WHERE no=1");
        map.put("boardInsert", "INSERT INTO board VALUES(?,?,?,?,?)");
        map.put("boardUpdate", "Update board SET name=''");
        map.put("boardDelete", "DELETE FROM board WHERE no=1");
        // MyBatis => XML
        Set<String> set=map.keySet();
        for(String key:set)
        {
        	System.out.println(key+":"+map.get(key));
        }
	}

}
