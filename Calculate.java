public class Calculate {
	public static void main (String[] arg) {
		System.out.println("Calculate...");
		double dFirst = Double.valueOf(arg[0]);
		double dSecond = Double.valueOf(arg[1]);
		int iFirst = (int)dFirst;
		int iSecond = (int)dSecond;
		//int iFirst = Integer.valueOf(arg[0]);
		//int iSecond = Integer.valueOf(arg[1]);
		int summ = iFirst + iSecond;
		int subtraction = iFirst - iSecond;
		int multiplication = iFirst * iSecond;
		int division = iFirst / iSecond;
		int pow = 1;
		while (iSecond > 0) {
			pow = pow * iFirst;
			iSecond = iSecond - 1;
		}
		
		System.out.println("Sum  " + summ);
		System.out.println("Sub  " + subtraction);
		System.out.println("mul  " + multiplication);
		System.out.println("div  " + division);
		System.out.println("pow  " + pow);
	}
}