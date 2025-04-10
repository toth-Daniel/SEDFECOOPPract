public class AltHsz
{
	public static void main(String[] args)
	{
		int a = 1, b = 3, angle = 60;
		double c;
		double area, perimeter;

		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(angle)));

		area = 0.5 * a * b * Math.sin(Math.toRadians(angle));
		perimeter = a + b + c;

		System.out.println("A terület: " + area);
		System.out.println("A kerület: " + perimeter);
	}
}
