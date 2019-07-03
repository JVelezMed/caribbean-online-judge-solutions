using System;

namespace COJ_Programs_C
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			string[] words = Console.ReadLine().Split();

			Console.WriteLine(int.Parse(words[0])+ int.Parse(words[1]));
		}
	}
}
