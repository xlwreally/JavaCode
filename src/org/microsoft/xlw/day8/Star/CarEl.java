package org.microsoft.xlw.day8.Star;

public class CarEl extends Car implements IA {

	@Override
	public void speak() {
		
		System.out.println("���ƣ�"+this.getName()+"CarEL speak");
	}

	@Override
	public String getColor() {
		return super.getColor();
	}
}
