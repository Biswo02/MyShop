class ABC 
{
	int id=101;
	String name="xyz";
	String addr="aaaa";
	void add(){
		System.out.println("adding");
	}
	void sub(){
		System.out.println("substracting");
	}
	void mul(){
		System.out.println("multiplying");
	}
}
class OPQ extends ABC
{
	int id=101;
	void perc(){
		System.out.println("calculating percentage");
	}
	public static void main(String[] args){
		OPQ o = new OPQ();
		System.out.println(o.id);
		System.out.println(o.name);
		System.out.println(o.addr);
		o.add();
		o.sub();
		o.mul();
		o.perc();
	}
}
