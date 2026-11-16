package com.sist.map;
import java.util.*;
// 클래스 관리 
interface I
{
	public void execute();
}
class A implements I
{

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("A:execute() Call...");
	}
	
}
class B implements I
{

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("B:execute() Call...");
	}
	
}
class C implements I
{

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("C:execute() Call...");
	}
	
}

class D implements I
{

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("D:execute() Call...");
	}
	
}
// Spring
class Container
{
	Map<String,I> map=
			new HashMap<String,I>();
	// XML => class , id 
	public Container()
	{
		map.put("a", new A());
		map.put("b", new B());
		map.put("c", new C());
		map.put("d", new D());
	}
	public I getBean(String key)
	{
		return map.get(key);
	}
}
// 주로 프레임워크에 사용 (Spring,SpringBoot,MyBatis,JPA)
// => 최신 방문 => Cookie 
public class Map_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Container c=new Container();
        // 싱글턴 
        I i=c.getBean("a");
        System.out.println("i="+i);
        i.execute();
        
        i=c.getBean("a");
        System.out.println("i="+i);
        i.execute();
        
        i=c.getBean("a");
        System.out.println("i="+i);
        i.execute();
        
        i=c.getBean("a");
        System.out.println("i="+i);
        i.execute();
        
        i=c.getBean("a");
        System.out.println("i="+i);
        i.execute();
        
        i=c.getBean("a");
        System.out.println("i="+i);
        i.execute();
        
        i=c.getBean("b");
        i.execute();
        
        i=c.getBean("c");
        i.execute();
        
        i=c.getBean("d");
        i.execute();
	}

}
