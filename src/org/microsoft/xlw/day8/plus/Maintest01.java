package org.microsoft.xlw.day8.plus;

public class MainTest01 {

	public static void main(String[] args) {
//		Play p1=new Play(); 
//		p1.play();
		
		 IPlay p1=new Play(); //  �������ֵ������������ͣ�����ת��
//	     p1.play();
	     
	     Play p2=new Play(); //�������
	     
	     IPlay p3=p2;//��ϵ
	     
	     Play p5=(Play)p3; // �������������ת��
		pppp aaa=new pppp();
		prin(aaa);


	}
	public static void prin(Play ss)
	{
		ss.look();
	}

}
