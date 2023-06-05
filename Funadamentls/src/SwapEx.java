
public class SwapEx {

	//non-static varible
	int fno, sno;
	
	//non-static varibles and Method can access Directly from non-static Method
	//non-static Mehtod
	void swapWithTemp()
	{
		
		fno=100;
		sno=200;
		System.out.println("Before Swapping");
		System.out.println("Fno  : " +"\t"+ fno+"\t"+"Sno :"+sno);
		//swapping
		//local varible
		int temp=0;
		temp=fno;
		fno=sno;
		sno=temp;
		System.out.println("After Swapping");
		System.out.println("Fno  : " +"\t"+ fno+"\t"+"Sno :"+sno);
		
		

	}
	void swapWithOutTemp()
	{
		
		fno=500;
		sno=300;
		System.out.println("Before Swapping");
		System.out.println("Fno  : " +"\t"+ fno+"\t"+"Sno :"+sno);
		//swapping
		//local varible
		
		fno=fno+sno;
		sno=fno-sno;
		fno=fno-sno;
		
		System.out.println("After Swapping");
		System.out.println("Fno  : " +"\t"+ fno+"\t"+"Sno :"+sno);
		
		

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To access Non-static varibles and non-static Method crate Object
SwapEx e=new SwapEx();

e.swapWithOutTemp();
e.swapWithTemp();
	
	
	}

}
