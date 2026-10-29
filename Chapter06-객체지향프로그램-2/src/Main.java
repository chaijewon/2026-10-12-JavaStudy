import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MovieSystem ms=new MovieSystem();
        Scanner scan=new Scanner(System.in);
        while(true)
        {
        	System.out.println("==================Menu==============");
        	System.out.println("1. 영화 전체 목록");
        	System.out.println("2. 영화 상세 보기");
        	System.out.println("3. 영화 검색");
        	System.out.println("4. 종료");
        	System.out.println("====================================");
        	System.out.print("메뉴 선택:");
        	int menu=scan.nextInt();
        	if(menu==4)
        	{
        		System.out.println("프로그램 종료");
        		break;
        	}
        	else if(menu==1)
        	{
        		Movie[] movie=ms.movieListData();
        		for(Movie m:movie)
        		{
        			System.out.println(m.getMno()+"."+m.getTitle());
        		}
        	}
        	else if(menu==2)
        	{
        		System.out.print("1~1938까지 사이의 영화번호 입력:");
        		int mno=scan.nextInt();
        		Movie movie=ms.movieDetailData(mno);
        		System.out.println("======= 영화 상세 ======");
        		System.out.println("영화번호:"+movie.getMno());
        		System.out.println("영화명:"+movie.getTitle());
        		System.out.println("장르:"+movie.getGenre());
        		System.out.println("출연진:"+movie.getActor());
        		System.out.println("개봉일:"+movie.getRegdate());
        		System.out.println("등급:"+movie.getGrade());
        		System.out.println("감독:"+movie.getDirector());
        	}
        	else if(menu==3)
        	{
        		System.out.print("검색어 입력:");
        		String fd=scan.next();
        		Movie[] movie=ms.movieFindData(fd);
        		// => 1. 상세보기 , 2. 검색 , 3. 목록
        		// 영화 한개 정보 => Movie
        		// 영화가 여러개인 경우 => Movie[]
        		System.out.println("검색된 영화 갯수:"+movie.length);
        		for(Movie m:movie)
        		{
        			System.out.println(m.getMno()+"."+m.getTitle());
        		}
        	}
        	
        }
	}

}
