package ch9;

public class Object03 {

	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = "ȫ�浿";
		
		// == �� ���� �������� �޸� ������ ������ ��
		System.out.println(str1 == str2);
		
		// String�� Hash �Լ��� �������̵��Ǽ�
		// ���� ���ڿ��̸� ���� �ؽ��� �̾Ƴ���.
		String str3 = "�Ӳ���";
		String str4 = new String("�Ӳ���");
		String str5 = new String("�Ӳ���");
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str5.hashCode());
		
		System.out.println(str3 == str4);
		
		// == ���� ���� ��. ������ true
		// == ���� ���ߴµ� false�� ������ ���������� ���� ��		
		System.out.println(str3.equals(str4));
	}

}