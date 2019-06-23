package calculator;

import java.awt.event.*;
import javax.swing.*;

public class Start {
	public static void main(String args[]) {
		new AppFrame("常用计算工具");
	}
}

class AppFrame extends JFrame{
	JButton Btn1=new JButton("求逆元");
	JButton Btn2=new JButton("判素数");
	public AppFrame(String title) {
		JFrame JF=new JFrame(title);
		JF.setLayout(null);
		JF.setBounds(400,150,400,400);
		JF.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JF.setVisible(true);
		Btn1.setBounds(40,40,100,20);
		Btn2.setBounds(40,70,100,20);
		Btn1.addActionListener(new BtnActionAdapter1());
		Btn2.addActionListener(new BtnActionAdapter2());
		JF.getContentPane().add(Btn1);
		JF.getContentPane().add(Btn2);
	}
	class BtnActionAdapter1 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			new Multiply_Inverse_Frame("乘法逆元计算");
		}
	}
	class BtnActionAdapter2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			new Prime_Check_Frame("判断素数");
		}
	}
}
