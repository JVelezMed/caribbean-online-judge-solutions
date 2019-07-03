#include <stdio.h>
int main( int argc, const char* argv[] ) {
	int n;
	while(scanf("%d", &n) != EOF) {
		int original = n;
		int reverse = 0;
		while( n != 0 )
		{
			reverse = reverse * 10;
			reverse = reverse + n%10;
			n = n/10;
		}
		printf("%s\n", (reverse > original) ? "YES" : "NO");
	}
}