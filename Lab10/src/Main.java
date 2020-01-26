
public class Main {

	public static void main(String[] args) {
		Shape sp;   // �繤�ҹ�������   
		//	Shape sp  = new Shape();�������ö������ҧ�ͺ����
		sp = new circle(3.45);   // shape is a subclass of shape
		System.out.println(sp.area());  // area is an Override method
		System.out.println(sp.toString());  //�ѹ�����͡��Ƿ������������ش   ���ʴ�  ��л����͡�����   circle  ᷹���     Shape
		sp = new Rectangle(2.0,3.0);
		System.out.println(sp.area()); // polymophism  ���  write same but give ��  diffrent
		System.out.println(sp.toString());//polymophism 1.�������ҧ�ԧ��ͧ�� ����� ���� ���    2. ��ͧ�ա��  @Override
		
		Shape[] arrShape = new Shape[5];
		arrShape[0] = new circle(2.5);
		arrShape[1] = new Rectangle(2,3);
		double totalArea = 0.0;

		for(int i=0;i<arrShape.length;i++) {
			if(arrShape[i]!=null) {
				totalArea += arrShape[i].area(); //�Դ������ԫ��
			}
		}
		System.out.println(totalArea);
		totalArea = 0.0;
		for(Shape e :arrShape) {
			if(e!=null) {
				totalArea += e.area();
			}
		}
		System.out.println(totalArea);
		
		IArear area;
		area = new Triangle(6,6);
		System.out.println(area.area());
		area = new Cubic(3);
		System.out.println(area.area());
		
		Volume volume;
		volume = new Cubic(4);
		System.out.println(volume.volume());
	}

}
