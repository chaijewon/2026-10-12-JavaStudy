class Card{
	int no;
	String type;
	static int width; // 객체.변수 , 클래스.변수 
	static int height;
	
}
public class UserMain {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Card a=new Card();
        a.no=2;
        a.type="♥";
        a.width=200;
        a.height=300;
        Card b=new Card();
        b.no=3;
        b.type="◆";
        b.width=250;
        b.height=350;
        Card c=new Card();
        c.no=4;
        c.type="♣";
        c.width=500;
        c.height=700;
        
        Card.width=1000;
        Card.height=2000;
        
        System.out.println(a.width);
        System.out.println(a.height);
        System.out.println(a.type);
	}

}
