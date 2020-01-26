
public class Myvector {
	private int[] vector1 = new int[3];
	private int[] vector2 = new int[3];
	private int[] results = new int[3];
	
	public Myvector () {
		
	}
	public Myvector (int[] vector1, int[] vector2) {
		this.vector1 = vector1;
		this.vector2 = vector2;
	}
	
	public void setVac1(int[] var1) {
		//setter
		this.vector1 = var1;
	}
	public int[] getVac1() {
		//getter
		return this.vector1;
	}
	public void setVac2(int[] var2) {
		//setter
		this.vector2 = var2;
	}
	public int[] getVac2() {
		//getter
		return this.vector2;
	}
	public void setResult(int[] var3) {
		//setter
		this.results = var3;
	}
	public int[] getResult() {
		//getter
		return this.results;
	}
	public void sumVectors() {
		for(int i=0;i<3;i++) {
			this.results[i] = this.vector1[i]+this.vector2[i];
		}
	}
	public void showResults() {
		for(int i=0;i<3;i++) {
			System.out.print(results[i]+" ");
		}
	}
	
}
