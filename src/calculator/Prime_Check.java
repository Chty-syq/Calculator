package calculator;

import java.awt.event.*;
import javax.swing.*;

public class Prime_Check {
	public static void main(String args[]) {
		new Prime_Check_Frame("�ж�����");
	}
}

class Prime_Check_Frame extends JFrame{
	JTextField In =new JTextField(20);
	JButton    Btn=new JButton("�ж�");
	JLabel     Out=new JLabel("������ʾ���");
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
				Out.setText(num+"��������");
				return;
			}
			for(int i=2;i<=Math.sqrt((double)num);++i) {
				if(num%i==0) {
					Out.setText(num+"��������");
					return;
				}
			}
			Out.setText(num+"������");
		}
	}
}
