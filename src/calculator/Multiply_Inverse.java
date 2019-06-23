package calculator;

import java.awt.event.*;
import javax.swing.*;

public class Multiply_Inverse{
	public static void main(String args[]){
		new Multiply_Inverse_Frame("乘法逆元计算");
	}
}

class Multiply_Inverse_Frame extends JFrame{
	JTextField In1=new JTextField(10);
	JTextField In2=new JTextField(10);
	JButton    Btn=new JButton("求逆元");
	JLabel     Def=new JLabel("模");
	JLabel     Out=new JLabel("这里显示结果");
	public Multiply_Inverse_Frame(String title){
		JFrame JF=new JFrame(title);
		JF.setLayout(null);
		JF.setBounds(0,0,400,150);
		JF.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JF.setVisible(true);
		In1.setBounds(20,20,100,20);
		In2.setBounds(160,20,100,20);
		Btn.setBounds(270,20,80,20);
		Def.setBounds(130,20,20,20);
		Out.setBounds(100,70,300,20);
		Btn.addActionListener(new BtnActionAdapter());
		JF.getContentPane().add(In1);
		JF.getContentPane().add(Def);
		JF.getContentPane().add(In2);
		JF.getContentPane().add(Btn);
		JF.getContentPane().add(Out);
	}
	class BtnActionAdapter implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String s1=In1.getText();
			String s2=In2.getText();
			int A=Integer.parseInt(s1);
			int M=Integer.parseInt(s2);
			int[] Sol={0,0};
			int g=exgcd(A,M,Sol);
			while(Sol[0]<0) Sol[0]+=M;
			while(Sol[0]>M) Sol[0]-=M;
			if(g>1) Out.setText(A+"模"+M+"的逆元不存在");
			else Out.setText(A+"模"+M+"的逆元为"+Sol[0]);
		}
		int exgcd(int a,int b,int[] Sol){
			if(b==0){
				Sol[0]=1; Sol[1]=0;
				return a;
			}
			int d=exgcd(b,a%b,Sol),t=Sol[0]; 
			Sol[0]=Sol[1]; 
			Sol[1]=t-(a/b)*Sol[1];
			return d;
		}
	}
}
