import java.io.*;

class Swap {

	public static void main(String a[])
	{
		int x = 10;
		int y = 5;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping:" + " x = " + x + ", y = " + y);
	}
}

