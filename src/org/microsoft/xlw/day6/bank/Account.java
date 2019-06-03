package org.microsoft.xlw.day6.bank;

public class Account {
	private String id;  //��ˮ��
	private String accountID; //�˺�
	private String password;  //����
	private double balance;   //���
	
	
	public Account() {
		super();
	}
	public Account(String id, String accountID, String password, double balance) {
		super();
		this.id = id;
		this.accountID = accountID;
		this.password = password;
		this.balance = balance;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccountID() {
		return accountID;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
