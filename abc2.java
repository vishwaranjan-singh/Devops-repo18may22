// Java program to illustrate
// max of three numbers using
// ternary operator.
public class operators {
	public static void main(String[] args)
	{
		int a = 20, b = 10, c = 30, result;

		// result holds max of three
		// numbers
		result
			= ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
		System.out.println("Max of three numbers = "
						+ result);

	}
	#added by prakash
	public int sub()
	{
			return a-b;
	}
	
	#added by vishwa for multiplication
	public int mul()
	{
		return a*b;
	}
	
	#added by vishwa for multiplication
	public int div()
	{
		return a%b;
	}
}
