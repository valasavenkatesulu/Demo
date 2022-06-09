package Access_modifiers_learn;

public class X {
	
	
	public int j=10;
	 public void print(String s)
	{
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		X x=new X();
		x.print("sun");//calling method
		System.out.println(x.j);
	}
		
		
	}

