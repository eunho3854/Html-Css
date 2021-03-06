package ch9;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


// Swing은 내부적으로 while이 돌고 있음. 데몬 프로세스 (끌때까지 안 꺼짐)
public class Swing01 extends JFrame{

	public Swing01() {
		setTitle("제목");
		setSize(300, 500);
		
		// JPannel = (JFrame이 기본적으로 가지고 있는 패널)
		Container c = getContentPane(); 
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		JButton btn6 = new JButton("버튼6");
		
		JPanel jp1 = new JPanel();
		jp1.add(btn6);
		
		c.add(btn1, Batch.WEST);
		c.add(btn2, Batch.EAST); // 인터페이스 활용.
		c.add(btn3, Batch.NORTH);
		c.add(jp1, Batch.CENTER);
		c.add(btn5, BorderLayout.SOUTH); // 원래 만들어져 있음.
		
		setVisible(true); // 화면에 표시하는 함수
	}
	
	public static void main(String[] args) {
		System.out.println(MyLayout.WEST);
		System.out.println(MyLayout.WEST.name());
		System.out.println(MyLayout.WEST.ordinal());
		System.out.println(MyLayout.WEST.getValue());

		new Swing01();
	}

}
