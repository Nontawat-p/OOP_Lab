
public class Main {
	//�����¹�͡�ѧ��ѹ���繿������ҹ��!!
	public static void main(String[] args) {
		//������¡�� constructor ����ͧ ��С�õ���á���
		AccountReceivable ac = new AccountReceivable();
		ac.setName("Notawat");
		ac.setBalance(20000);
		ac.setMaximum(500000);
		System.out.println("Account ID :"+ac.getId()+"\n"+"Account Name :"+
							ac.getName()+"\n"+"Balance :"+ac.getBalance()+
							"\n"+"MaximumDep :"+ac.getMaximum());
		ac.setDebit(10000);
	}
	

}
