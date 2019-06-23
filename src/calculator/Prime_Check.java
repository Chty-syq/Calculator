package calculator;

import java.awt.event.*;
import javax.swing.*;

public class Prime_Check {
	public static void main(String args[]) {
		new Prime_Check_Frame("判断素数");
	}
}

class Prime_Check_Frame extends JFrame{
	JTextField In =new JTextField(20);
	JButton    Btn=new JButton("判断");
	JLabel     Out=new JLabel("这里显示结果");
	public Prime_Check_Frame(String title) {
		JFrame JF=new JFrame(title);
		JF.setLayout(null);
		JF.setBounds(0,150,400,100);
		JF.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JF.setVisible(true);
		In.setBounds(20,20,100,20);
		Btn.setBounds(130,20,60,20);
		Out.setBounds(200,20,200,20);
		Btn.addActionListener(new BtnActionAdapter());
		JF.getContentPane().add(In);
		JF.getContentPane().add(Btn);
		JF.getContentPane().add(Out);
	}
	class BtnActionAdapter implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String S=In.getText();
			int num=Integer.parseInt(S);
			if(num<0) num=-num;
			if(num<=1) {
				Out.setText(num+"不是素数");
				return;
			}
			for(int i=2;i<=Math.sqrt((double)num);++i) {
				if(num%i==0) {
					Out.setText(num+"不是素数");
					return;
				}
			}
			Out.setText(num+"是素数");
		}
	}
}
