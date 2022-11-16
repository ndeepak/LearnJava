class CommandLine
{
	public static void main(String[] args)
	{
		int i=0, count=0;
		String st;
		count = args.length; // Length of Args Array
		while(i<count)
		{
			st = args[i];
			System.out.println(st);
			i++;
		}
	}
}