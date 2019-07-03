import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.StringTokenizer;

public class uCalculateE {

	static HashMap<Integer, BigInteger> factorialTable;
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		//Read the number of elements that will be in the set
		int size = Integer.parseInt(in.readLine());
		//long startTime, endTime;

		//Creating the HashMap
		//startTime = System.currentTimeMillis();
		factorialTable = new HashMap<Integer, BigInteger>();
		BigInteger factorial = BigInteger.ONE;

		//Initialize the factorial table
		factorialTable.put(0, BigInteger.ONE);
		for (int i = 1; i <= size; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
			factorialTable.put(i, factorial);
		}
		//System.out.println("Hash table initialized");
		//endTime = System.currentTimeMillis();
		//System.out.println("Time taken to initialize the hashmap: " + (endTime-startTime) + " milliseconds");

		StringTokenizer tokenizer = new StringTokenizer(in.readLine());
		int numbersWithResidue0 = 0;	//like 3, 6, 9
		int numbersWithResidue1 = 0;	//like 1, 4, 7
		int numbersWithResidue2 = 0;	//like 2, 5, 8

		int testNumber;
		while (tokenizer.hasMoreTokens()) {
			testNumber = Integer.parseInt(tokenizer.nextToken());
			if(testNumber%3 == 0)
				++numbersWithResidue0;
			else if(testNumber%3 == 1)
				++numbersWithResidue1;
			else
				++numbersWithResidue2;
		}
		//System.out.println(numbersWithResidue0 + " " + numbersWithResidue1 + " " + numbersWithResidue2);

		//If there are no elements in the sets with remainder 1 or 2
		if(numbersWithResidue1 == 0 && numbersWithResidue2 == 0) {
			BigInteger powerSetSize = sizeOfPowerSet(numbersWithResidue0);
			BigInteger total = powerSetSize.subtract(BigInteger.ONE).mod(BigInteger.valueOf(1000000000));
			System.out.println(total);
		}
		else {
			//Now for the binomial sum
			BigInteger binomialCoefficientSumOfSet1, binomialCoefficientSumOfSet2, 
			binomialCoefficientSumOfSet3, sumOfAllSets;
			BigInteger temp1, temp2;

			//Getting the binomial sum
			binomialCoefficientSumOfSet1 = binomialSumV2(1, numbersWithResidue1).multiply(binomialSumV2(1, numbersWithResidue2));
			binomialCoefficientSumOfSet2 = binomialSumV2(2, numbersWithResidue1).multiply(binomialSumV2(2, numbersWithResidue2));
			temp1 = binomialSumV2(3, numbersWithResidue1);
			temp2 = binomialSumV2(3, numbersWithResidue2);
			binomialCoefficientSumOfSet3 = (temp1.multiply(temp2)).add(temp1.add(temp2));

			sumOfAllSets = binomialCoefficientSumOfSet1.add(binomialCoefficientSumOfSet2).add(binomialCoefficientSumOfSet3);

			//System.out.println("Binomial sum V2 calculated in " + (endTime-startTime) + " miliseconds\n");
			//System.out.println(binomialCoefficientSumOfSet1);
			//System.out.println(binomialCoefficientSumOfSet2);
			//System.out.println(binomialCoefficientSumOfSet3);
			//System.out.println(sumOfAllSets);

			BigInteger powerSetSize = sizeOfPowerSet(numbersWithResidue0);
			//System.out.println(powerSetSize);

			BigInteger total = sumOfAllSets.multiply(powerSetSize).add(powerSetSize).subtract(BigInteger.ONE).mod(BigInteger.valueOf(1000000000));
			System.out.println(total);
		}
	}

	public static BigInteger sizeOfPowerSet(int size) {
		return BigInteger.valueOf(2).pow(size);
	}

	public static BigInteger binomialV2(int n, int k) {
		if(k == 1)
			return BigInteger.valueOf(n);
		else if(k == n || n == 0)
			return BigInteger.ONE;
		else 
			return (factorialTable.get(n).divide(factorialTable.get(n-k))).divide(factorialTable.get(k));
	}

	public static BigInteger binomialSumV2(int startIndex, int setSize) {
		//System.out.println("Set size: " + setSize);
		BigInteger number = BigInteger.ZERO;

		for (int i = startIndex; i <= setSize; i+=3) {
			number = number.add(binomialV2(setSize, i));
			//System.out.println("Current sum value: " + number);
		}
		return number;
	}

}