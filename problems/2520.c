#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <string.h>


int main(){

	int i,j, cases, number,p,ja,f, input;
	//char pavel[], jayme[], filler[];
	int mcount;


	scanf("%d",&cases);

	for(i = 0; i < cases; i++){
		scanf("%d %d %d %d",&number, &p, &ja, &f);
		char episodes[number];

		//Empty and recorded
		for (j = 0; j < number; ++j) {
			if(j < p)
				episodes[j] = 's';
			else
				episodes[j] = 'e';
		}


		if(ja == 0)
			getchar();
		else {
			//printf("Recorded episodes: %d\n", ja);
			//What did jaime record
			for (j = 0; j < ja; ++j) {
				scanf("%d", &input);
				episodes[input-1] = 'r';
			}
		}

		while(getchar() != '\n');

		if(f == 0)
			getchar();
		else {
			//printf("Recorded fillers: %d\n", f);
			//filler episodes
			for (j = 0; j < f; ++j) {
				//printf("Reading...%d\n", j);
				scanf("%d", &input);
				if(episodes[input-1] == 'r')
					episodes[input-1] = 'x';
				else
					episodes[input-1] = 'f';
				//printf("%c\n", episodes[input-1]);
			}
		}

		//printf("Checking for missing things\n");

		//Count and show
		mcount = 0;
		for (j = 0; j < number; ++j) {
			if(episodes[j] == 'e') {
				mcount++;
			}
		}

		printf("%d", mcount);
		for (j = 0; j < number; ++j) {
			if(episodes[j] == 'e') {
				printf(" %d", j+1);
			}
		}
		printf("\n");

		//Count and show again
		mcount = 0;
		for (j = 0; j < number; ++j) {
			if(episodes[j] == 'x' || (episodes[j] == 'r' && j<p)) {
				mcount++;
			}
		}

		printf("%d", mcount);
		for (j = 0; j < number; ++j) {
			if(episodes[j] == 'x' || (episodes[j] == 'r' && j<p)) {
				printf(" %d", j+1);
			}
		}
		printf("\n");


		//		//What did jaime record
//		for (j = 0; j < number; ++j) {
//			printf("%c ", episodes[j]);
//		}

	}
	return 0;
}
