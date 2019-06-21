package org.microsoft.xlw.day8.EndPlus;

public class MainTest03 {

	public static void main(String[] args) {
		Person p1=null;
		Person p2=null;
		
		p1=new Student(); //����ѧ��
		p2=new Worker();  // ������
		
		p1.setName("����");
		p2.setName("����");

		System.out.println(p1.getContext());
		System.out.println(p2.getContext());
	}

}
