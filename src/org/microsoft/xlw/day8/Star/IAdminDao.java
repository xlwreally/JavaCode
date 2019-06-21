package org.microsoft.xlw.day8.Star;

public interface IAdminDao {
	public boolean add(); //����
	public boolean remove(); // ɾ��
	public boolean update();// ��
	public Object findId(); // ��ѯID
	public Object[] findAll(); // ������Ϣ
}
