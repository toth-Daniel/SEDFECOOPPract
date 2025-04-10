public class Orok2
{
	public static void main(String[] args)
	{
		Kiir();
	}

	public static void Kiir() {
		Teglalap tl = new Teglalap(1, 2);
		tl.Szamol1(1, 2);
		tl.Szamol2(1, 2);
		Teglatest tt = new Teglatest(3, 4);
		tt.Szamol1(1, 2, 3);
		tt.Szamol2(1, 2, 3);
	}
}
