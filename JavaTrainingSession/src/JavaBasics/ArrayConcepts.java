package JavaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {

		/*
		 * /declaring array int intArray[]; allocating memory to array intArray = new
		 * int[20]; // combining both statements in one int[] intArray = new int[20];
		 */
		int i = 0;
		System.out.println("hello");
		i = 20; // Value of I will be replaced with 20
		System.out.println(i);

		int j[] = { 12, 45, 67, 78, 34 }; // Only similar kind of data are allowed in this
		// to overcome this similar data issue, we can create a new object Array

		/*
		 * j[0]=10; j[1]=30; j[2]=40; j[3]=50; j[4]=100;
		 */

		for (int k = 0; k < j.length; k++) {
			System.out.println(j[k]);

		}

		System.out.println(j[2]);
		System.out.println(j[3]);

		System.out.println(j.length);

		double d[] = { 12.5, 45.55, 89.45 };

		/*
		 * d[0]=10; d[1]=30; d[2]=40; d[3]=50; d[4]=100;
		 */

		System.out.println(d[1]);
		System.out.println(d.length);

		String s[] = { "Hi", "$", "5555.5" };

		System.out.println(s[1]);

		Object ob[] = { 1, 1.1, 22.85, "$", "Hello", "Hello2" };

		System.out.println(ob[3]);

		System.out.println("----------------------");

		int o[] = new int[10]; // 2nd mothod of declaring an array of 10.
		//

		o[0] = 11;
		o[1] = 22;
		o[2] = 33;
		o[3] = 44;
		o[4] = 15;
		o[5] = 25;
		o[6] = 35;
		o[7] = 45;
		o[8] = 46;
		o[9] = 57;

		System.out.println(o[6]);

	}

}
