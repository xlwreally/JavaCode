package org.microsoft.xlw.day8.EndPlus;

public class Worker extends Person{
	private String job;

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Worker(String id, String name, String sex, String birthday, String address, String phone,String job) {
		super(id, name, sex, birthday, address, phone);
		this.job=job;
		// TODO Auto-generated constructor stub
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String getContext() {
		// TODO Auto-generated method stub
		return "���˵�������"+this.getName();
	}
	
}
