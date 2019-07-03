using System;

namespace COJ_Programs_C
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			double sum = 0;

			for (int i = 1; i <= 12; ++i) {
				sum += double.Parse(Console.ReadLine());
			}
			sum /= 12;

			Console.WriteLine(sum.ToString("$#.00"));
		}
	}
}
