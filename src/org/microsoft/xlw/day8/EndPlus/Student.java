package org.microsoft.xlw.day8.EndPlus;

public class Student extends Person {
	private double score;	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String id, String name, String sex, String birthday, String address, String phone,double score) {
		super(id, name, sex, birthday, address, phone);
		this.score=score;	
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String getContext() {
		// TODO Auto-generated method stub
		return "ѧ��������"+this.getName();
	}

}
