
public class Calculate {

	int add(int fno,int sno)
	{
		int result=fno+sno;
		
		return result;
	}
	
	
	int sub(int f,int s)
	{
		int result=f-s;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate demo=new Calculate();
		
		int res=demo.add(100,200);
		System.out.println("Addtion of two numbers : "+res);
		
		int res1=demo.sub(500,100);
		System.out.println("Subtraction of two numbers : "+res1);
		
		
	}

}
