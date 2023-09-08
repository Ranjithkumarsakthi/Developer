package javaintro;

public class Variable {
	static class id{
		static String var = "tution";
		static float varb = 2.2f;
	}

	public static void main(String[] args) {
		System.out.println(id.var);
		System.out.println(id.varb);
		int i=30;
		i=20;
		{
			System.out.println(i);
			System.out.println(i);
		}

	}

}
