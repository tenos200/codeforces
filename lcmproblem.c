#include <stdio.h>

int main(void) {

	int t;
	int l;
	int r;

	scanf("%d", &t);

	for(int i = 0; i < t; i++) {

		scanf("%d %d", &l, &r);

		if(l*2 > r) {

			printf("-1 -1\n");
		}
		else {
			
			printf("%d %d\n", l, l*2);
		
		}

	
	}

}
