

package Ilija_5056;

public class myNumber{
	private int num;
	public int num2;
	public myNumber() {
		num=0;
		num2=100;
	}
	int getNum() {
		return num;
	}
	void setNum(int i) {
		num=i;
		num2=10*i;
		
	}
	int getNum2() {
		return num2;
	}
	void description() {
		System.out.println("The value of num is" +this.getNum());
		System.out.println("The value for num2 is" +this.getNum2());
		
	}
	float getAverage() {
		return (num+num2/2);
	}
}
public class myClass {
	public static void main(string[]args) {
		myNumber A =new myNumber();
		System.out.println(A.getNum());
		A.setNum(10);
		System.out.println(A.getNum());
		System.out.println(A.num2);
		
	}
}
