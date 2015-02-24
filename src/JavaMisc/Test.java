package JavaMisc;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		Employee e1 = new Employee("test", 1, "test");
		Employee e2 = new Employee("test", 1, "test");
		
		if(e1.equals(e2))
			System.out.println("Yes!");
		else
		{
			System.out.println("NO");
		}
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

	}

}
