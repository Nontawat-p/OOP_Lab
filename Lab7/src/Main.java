import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner kb =  new Scanner(System.in);
		System.out.print("��ͤ�������ͧ��õ�Ǩ�ͺ :");
		String text = kb.nextLine();
		String rev ="" ;
		for(int i=(text.length()-1);i>=0;i--) {
		rev += text.charAt(i);
		}
		System.out.print("Revese ��ͤ��� :");
		System.out.println(rev);
		System.out.print("���Ѿ������ :");
		if(text.equalsIgnoreCase(rev)) {
			System.out.println("Yes �繢�ͤ��� Palindorm");
		}
		else {
			System.out.println("NO ����繢�ͤ��� Palindorm");
		}
	}

}
