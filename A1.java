class A1{
	int a;
	void AA(){
		a=50;
	}
}
class B1 extends A1{
	int b;
	void BB(){
		b=40;
	}
}
class C1 extends B1{
	int c;
	void CC(){
		c=30;
	}
}
class D1 extends C1{
	int d;
	void Method(){
		AA();
		BB();
		CC();
		d=20;
}
		void Add(){
			System.out.println("A="+a);
			System.out.println("B="+b);
			System.out.println("C="+c);
	        System.out.println("D="+d);
			System.out.println("A+B+C+D="+(a+b+c+d));
		}
		public static void main(String[] args){
			D1 cvb=new D1();
			cvb.Method();
			cvb.Add();
		}
}




