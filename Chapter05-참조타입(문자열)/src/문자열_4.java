// 자르기 
/*
 *   ******X100000 String substring(int index) MVC
 *   String substring(int start,int end) 
 *   ---------------------------- 서울시 마포구 
 *                                서울시 동작구
 *   int indexOf(찾는 문자) => 앞에서부터 찾기 
 *   int lastIndexOf(찾는 문자) => 뒤에서부터 찾기  a.a.a.txt
 *   ---------------------- index번호 확인 
 *   C:\Users\vcand\git\java-study\Chapter01-자바소개\src\MainClass.java
 *   01234445
 */
public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String msg="Hello Java!!";
        //          01234567891011
        System.out.println(msg.substring(6));
        System.out.println(msg.substring(0,5));// end-1
        String s="자바.java";
        //        0 123456
        System.out.println(s.substring(s.indexOf(".")+1));
        String path="C:\\Users\\vcand\\git\\java-study\\Chapter01-자바소개\\src\\MainClass.java";
        System.out.println(path.substring(path.lastIndexOf("\\")+1));
	}

}
