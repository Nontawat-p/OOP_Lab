
public class Main {

	public static void main(String[] args) {
		Shape sp;   // เป็นคลานนามธรรม   
		//	Shape sp  = new Shape();ไม่สามารถนำไปสร้างออบเจ็บได้
		sp = new circle(3.45);   // shape is a subclass of shape
		System.out.println(sp.area());  // area is an Override method
		System.out.println(sp.toString());  //มันจะเลือกตัวที่อยู่ใกล้ที่สุด   มาแสดง  ก็จะปริ้นออกมาเป็ฯ   circle  แทนที่     Shape
		sp = new Rectangle(2.0,3.0);
		System.out.println(sp.area()); // polymophism  คือ  write same but give ผล  diffrent
		System.out.println(sp.toString());//polymophism 1.ตัวแปรอ้างอิงต้องเป็น ชืื่อ คลาส แม่    2. ต้องมีการ  @Override
		
		Shape[] arrShape = new Shape[5];
		arrShape[0] = new circle(2.5);
		arrShape[1] = new Rectangle(2,3);
		double totalArea = 0.0;

		for(int i=0;i<arrShape.length;i++) {
			if(arrShape[i]!=null) {
				totalArea += arrShape[i].area(); //เกิดโพลีมอริซึม
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
