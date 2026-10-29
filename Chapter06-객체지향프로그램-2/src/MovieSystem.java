import java.io.*;
import java.util.*;
// 데이터형 : 기본형 / 사용자 정의 
public class MovieSystem {
    private static Movie[] movies = new Movie[1938];// 목록 , 접속자 ..
    // 초기화 
    /*
     *   1. 예외 복구 try~catch
     *   2. 예외 회피 throws => 메소드 뒤에 
     *   3. 예외 발생 throw
     */
    static
    {
    	// static 변수 초기화
    	// instance => 생성자 
    	// {} / static{} =>  자동 처리 (호출없이 사용)
    	try
    	{
    		FileReader fr=
    				new FileReader("c:\\javaDev\\movie.txt");
    		StringBuffer sb=new StringBuffer();
    		// 문자열 => 임시 저장에 한번에 모아서 처리 
    		// + => 문자열 결합시마다 메모리 변경 
    		int i=0; // 한글자 
    		while((i=fr.read())!=-1) // -1 EOF
    		{
    			sb.append((char)i);
    		}
    		fr.close(); // 파일 닫기
    		System.out.println(sb.toString());
    		// 저장된 모든 데이터를 출력 
    		String[] movie=sb.toString().split("\n");
    		// 1927|그레이트 뷰티|코미디, 드라마|https://movie-phinf.pstatic.net/20140515_253/1400122597123SipFi_JPEG/movie_image.jpg?type=m77_110_2|토니 세르빌로(젭 감바르델라), 사브리나 페릴리(라모나), 세레나 그랜디(로레나)|2014 .06.12 개봉|청소년 관람불가|파올로 소렌티노
    		i=0;// 배열의 인덱스 
    		for(String m:movie)
    		{
    			String[] info=m.split("\\|");
    			movies[i]=new Movie();
    			movies[i].setMno(Integer.parseInt(info[0]));  //int mno="1"
    			movies[i].setTitle(info[1]);
    			movies[i].setGenre(info[2]);
    			movies[i].setActor(info[4]);
    			movies[i].setRegdate(info[5]);
    			movies[i].setGrade(info[6]);
    			movies[i].setDirector(info[7]);
    			i++;
    		}
    		
    	}catch(Exception ex) {
    		// 예외복구 
    		//System.out.println(ex.getMessage());// 에러 메세지 출력 
    		ex.printStackTrace();
    	}
    }// 데이터 수집 
    // 기능 
    //1. 목록 출력 
    public Movie[] movieListData() {
    	return movies;
    }
    //2. 상세보기
    public Movie movieDetailData(int mno)
    {
    	return movies[mno-1];
    }
    //3. 검색 
    public Movie[] movieFindData(String fd)
    {
    	int count=0;
    	for(Movie m:movies)
    	{
    		if(m.getTitle().contains(fd))
    		{
    			count++;
    		}
    	}
    	Movie[] m=new Movie[count];
    	int i=0;
    	for(Movie mm:movies)
    	{
    		if(mm.getTitle().contains(fd))
    		{
    			m[i]=mm;
    			i++;
    		}
    	}
    	return m;
    	
    }
}
