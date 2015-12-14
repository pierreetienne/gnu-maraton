
public class prueba {


	static int strcmp(char []s, char []t)
	{
		int i;
		for (i=0; s[i]==t[i]; i++)
			if (s[i]=='\0')
				return 0;
		return (int)s[i] -(int) t[i];
	}
	public static void main(String[] args) {
		System.out.println(strcmp("thaN".toCharArray(),"thaT".toCharArray()));

	}

}
