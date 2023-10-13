class ExamResult{
	private int num;
	public int num2;
	public myNumber() {
		num=0;
		num2=100;
		
	}
	int getNum() {
		return num;
	}
	void getNum(int i) {
		num=i;
		num2=10*i;
	}
	
		public static void main(String[]ar) {
			ExamResult A=new ExamResult();
			System.out.println(A.getNum());
			A.ExamResult(10);
			System.out.println(A.getNum());
			System.out.println(A.num2);
		}
	}
}
