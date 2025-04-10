public class KatPr
{
	static String sentenceToBeAnalyzed = "Ma szép az idő, nem esik az eső, és süt a nap.";

	public static void main(String[] args)
	{
		characterCounter(sentenceToBeAnalyzed);
	}

	public static void characterCounter(String sentence) {

		int charCount = sentence.length();
		int aCount = 0;
		int eCount = 0;
		int iCount = 0;
		int oCount = 0;
		int uCount = 0;
		int spaceCount = 0;
		int vowelCount = 0;
		char[] vowels = new char[] {'a', 'e', 'i', 'o', 'u'};

		for (int i = 0; i < charCount; i++)
		{
			char ch = sentence.charAt(i);
			for (char vowel : vowels)
			{
				if (ch == vowel)
				{
					vowelCount++;
				}
			}
		}

		for (int i = 0; i < charCount; i++)
		{
			if (sentence.charAt(i) == 'a') {
				aCount++;
			}
		}

		for (int i = 0; i < charCount; i++)
		{
			if (sentence.charAt(i) == 'e')
			{
				eCount++;
			}
		}

		for (int i = 0; i < charCount; i++)
		{
			if (sentence.charAt(i) == 'i')
			{
				iCount++;
			}
		}

		for (int i = 0; i < charCount; i++)
		{
			if (sentence.charAt(i) == 'o')
			{
				oCount++;
			}
		}

		for (int i = 0; i < charCount; i++)
		{
			if (sentence.charAt(i) == 'u')
			{
				uCount++;
			}
		}

		for (int i = 0; i < charCount; i++) {
			if (sentence.charAt(i) == ' ') {
				spaceCount++;
			}
		}

		System.out.println("Karakterek száma: " + charCount);
		System.out.println("Magánhangzók száma: " + vowelCount);
		System.out.println("	a darabszáma: " + aCount);
		System.out.println("	e darabszáma: " + eCount);
		System.out.println("	i darabszáma: " + iCount);
		System.out.println("	o darabszáma: " + oCount);
		System.out.println("	u darabszáma: " + uCount);
		System.out.println("Szóközök száma: " + spaceCount);
	}
}
