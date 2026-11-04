package com.sist.exception;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 *   1) 버튼 / 메뉴 / 텍스트 필드 
 *      ActionListener
 *      => actionPreformed() 
 *   2) 테이블 / 트리 / 이미지 
 *      MouseListener 
 *      => mouseClicked()
 *      => mousePressed()
 *      => mouseReleased()
 *      => mouseEntered()
 *      => mouseExited()
 *   3) 키보드 
 *      KeyListener
 *      => keyTyped() 
 *      => keyPressed()
 *      => keyReleased()
 *      
 *   4) combobox , list
 *      ItemListener
 *      => itemStateChange()
 */
public class 숫자야구게임 extends JFrame implements ActionListener{

	JButton b1,b2,b3;
	JTextField tf; // 한줄 입력 
	JTextArea ta;
	/*
	 *   캡슐화 
	 *     private 변수/ public 메소드 
	 *     => 개인 정보 / 맛집 정보 ...
	 *   생성자 => 다른 클래스에서 사용이 가능하게 만든다 
	 *    | public 
	 *   클래스 => 다른 클래스와 연결 
	 *    | public 
	 *   메소드 => 클래스와 클래스의 연결 
	 *    | public 
	 */
	private int[] com=new int[3];
	private int[] user=new int[3];
	int s,b;
	// 초기화 
	/*
	 *   0. 기본 초기화 
	 *   1. 명시적 초기화 
	 *   2. 초기화 블록 
	 *      = 인스턴스 블록 => 인스턴스변수 / static 변수 사용이 가능 
	 *        {
	 *           a=3;
	 *           b=10;
	 *        }
	 *      = static 블록 => static변수가 초기화 / static변수만 사용이 가능
	 *        static 
	 *        {
	 *           // 인스턴스는 사용이 안된다 
	 *        }
	 *    3. 생성자 : 인스턴스변수 / static 변수 사용이 가능
	 *    
	 *    우선 => 명시적 초기화
	 *    
	 *    기본 => 명시적 => static {} => {} => 생성자 
	 *    호출되는 순서 
	 *    
	 *    *** 클래스 블록안에서는 변수는 선언만 가능 
	 *        선언과 동시에 초기화 int a=10
	 *        int a;
	 *        a=100; 구현 
	 */
	public 숫자야구게임()
	{
		b1=new JButton("시작");
		b2=new JButton("전송");
		b3=new JButton("종료");
		
		tf=new JTextField(10);
		tf.setEnabled(false);
		ta=new JTextArea();
		ta.setEditable(false);
		JScrollPane js=new JScrollPane(ta);
		
		add("Center",js);
		
		JPanel p=new JPanel();
		p.add(tf);p.add(b1);p.add(b2);p.add(b3);
		
		add("South",p); 
		
		// Center / South / North / East / West
		
		setSize(450,500);
		setVisible(true);
		
		// 웹 => 자바스크립트 , 자바 => 이벤트 
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		tf.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new 숫자야구게임();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b3)
		{
			dispose();  // 윈도우 메모리 회수 
			System.exit(0); // 실제 프로그램 종료 
		}
		else if(e.getSource()==b1)
		{
			tf.setEnabled(true);
			b1.setEnabled(false);
			tf.requestFocus();
			JOptionPane.showMessageDialog(this, "게임을 시작합니다");
		}
	}
	// 메소드 
	/*
	 *   1. 기능 => 명령문을 모아서 관리 (한가지 일만 수행)
	 *   2. 재사용이 가능 
	 *   3. 다른 클래스와 통신 
	 *   4. 반복을 제거 
	 *   5. 구조적인 프로그램 => 단락을 나눠서 처리 
	 *   6. 에러처리 용이 
	 *   ==> 생성자는 메모리에 클래스 저장시에 한번만 호출된다 
	 *   
	 *   --------------------------
	 *        리턴형         매개변수
	 *        처리 결과값     사용자 요청값
	 *                     => 기본형 / 참조형 
	 *                               | 매개변수가 3개이상 
	 *        : 기본데이터형 / 참조형 
	 *   --------------------------
	 *          O            O
	 *   --------------------------
	 *          O            X
	 *   --------------------------
	 *          X            O
	 *        void 
	 *   --------------------------
	 *          X            X
	 *   --------------------------
	 *   
	 *   메소드 호출하면 => 항상 처음부터 실행된다 => 마지막까지 수행 
	 *               => 호출된 위치로 원상 복귀 
	 *               
	 *   public int add(int a, int b)
	 *   {
	 *      return a+b;
	 *   }
	 *       return 값을 받아서 저장 
	 *       |
	 *   int c=add(10,  20)
	 *       |     |
	 *      int a  int b
	 *   =================================
	 *   생성된 모든 사용이 가능 : static 
	 *   생성된 객체마다 따로 사용 : instance 
	 *   
	 *   => 객체지향의 핵심 : 재사용 
	 *      ------------------- 메소드 
	 */
	

}
