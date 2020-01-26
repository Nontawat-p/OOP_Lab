import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner kb =  new Scanner(System.in);
		System.out.print("ข้อความที่ต้องการตรวจสอบ :");
		String text = kb.nextLine();
		String rev ="" ;
		for(int i=(text.length()-1);i>=0;i--) {
		rev += text.charAt(i);
		}
		System.out.print("Revese ข้อความ :");
		System.out.println(rev);
		System.out.print("ผลลัพธ์ที่ได้ :");
		if(text.equalsIgnoreCase(rev)) {
			System.out.println("Yes เป็นข้อความ Palindorm");
		}
		else {
			System.out.println("NO ไม่เป็นข้อความ Palindorm");
		}
	}

}
