package org.microsoft.xlw.day8.EndPlus;

public class MainInterface {

	public static void main(String[] args) {
		Computer c1=new Computer();
		Upan u1=new Upan();
		Printer p1=new Printer();
		
		c1.plugin(u1); //  usb=u1
		c1.plugin(p1); //  usb=p1

	}

}
