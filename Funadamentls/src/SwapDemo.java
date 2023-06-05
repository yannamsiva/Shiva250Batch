
public class SwapDemo {
	
	void swap(int fno,int sno)
	{
		System.out.println("Before Swapping");
		System.out.println("Fno : "+fno+"Sno :"+sno);
		int temp=0;
		temp=fno;
		fno=sno;
		sno=temp;
		System.out.println("After Swapping");
		System.out.println("Fno : "+fno+"Sno :"+sno);
		
		
	}
	
	static void swapWihOutTemp(int fno,int sno)
	{
		
		System.out.println("Before Swapping");
		System.out.println("Fno : "+fno+"Sno :"+sno);
		fno=fno+sno;
		sno=fno-sno;
		fno=fno-sno;
		System.out.println("After Swapping");
		System.out.println("Fno : "+fno+"Sno :"+sno);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapDemo demo=new SwapDemo();
		demo.swap(100, 200);
		System.out.println("================================================");
		swapWihOutTemp(250, 236);
	}

}
