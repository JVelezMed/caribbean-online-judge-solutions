import java.math.BigInteger;
import java.util.Scanner;
 
class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
        
                BigInteger num = sc.nextBigInteger();
                int N = sc.nextInt();
                int i, c=0;
                
                String res = num.pow(N).toString();
                for(i=1;i<=res.length();i++){
                        System.out.print(res.charAt(i-1));
                        c++;
                        if(c==70){
                                System.out.println();
                                c=0;
                        }
                }
                if(c>0)
                        System.out.println();
        }
}