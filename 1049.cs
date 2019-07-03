using System;

namespace COJ_Programs_C
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			int n = int.Parse (Console.ReadLine ());

			if (n >= 0) {
				Console.WriteLine (n * (n + 1) / 2);
			} else {
				Console.WriteLine (-(-n * (-n + 1) / 2) + 1);
			}
		}
	}
}
