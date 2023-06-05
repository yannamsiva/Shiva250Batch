
public class StaticVaribleDemo {

	//static varibles
	static int i=1000;
	
	//static Method
	static void funA()
	{
System.out.println("Static Method");		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("Directly : "+i);
funA();
System.out.println("Using ClassName : "+StaticVaribleDemo.i);
StaticVaribleDemo.funA();
StaticVaribleDemo demo=new StaticVaribleDemo();

System.out.println(demo.i);
StaticVaribleDemo.funA();

StaticVaribleDemo demo1=null;
demo1.funA();
System.out.println(demo1.i);
		
	}

}
