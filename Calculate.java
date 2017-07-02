public class Calculate {
	public static void main (String[] arg) {
		System.out.println("Calculate...");
		double dFirst = Double.valueOf(arg[0]);
		double dSecond = Double.valueOf(arg[1]);
		int iFirst = (int)dFirst;
		int iSecond = (int)dSecond;
		//int iFirst = Integer.valueOf(arg[0]);
		//int iSecond = Integer.valueOf(arg[1]);
				
			
		int summ = Summ(iFirst, iSecond);
		int subtraction = Sub(iFirst, iSecond);
		double multiplication = Mult(dFirst, dSecond);
		double division = Div(dFirst, dSecond);
		int pow = Pow(iFirst, iSecond);
		
		System.out.println("Sum  " + summ);
		System.out.println("Sub  " + subtraction);
		System.out.println("mul  " + multiplication);
		System.out.println("div  " + division);
		System.out.println("pow  " + pow);
		
		}
		
		
	static int Summ (int first, int second) {
		int summ = first + second;
		return summ;
		}
	
	static int Sub (int first, int second)
		{
		int subtraction = first - second;
		return subtraction;
		}
		
	static double Mult (double first, double second)
		{
		double multiplication = first * second;
		return multiplication;
		}
		
	static double Div (double first, double second)
		{
		double division = first / second;
		return division;
		}
		
	static int Pow (int first, int second)
		{
		int pow = 1;
		while (second > 0) {
			pow = pow * first;
			second = second - 1;
			}
			return pow;
		}
}