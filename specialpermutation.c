#include <stdio.h>

int main (void) {

	int t;
	int n;
	scanf("%d", &t);

	for(int i = 0; i < t; i++) {
		
		scanf("%d", &n);

		if(n % 2 == 1) {
		
			for (int j = n; j > 0; j--) {

				if(j == (n / 2) + 1) {
					printf("%d ",n / 2);
				
				} else if(j == (n / 2)) {
				
					printf("%d ", (n/2) + 1);
				} else {

					printf("%d ", j);
				
				}
			}
			printf("\n");
		}
		else {
		
			for (int j = n; j > 0; j--) {
					printf("%d ", j);
			}
			printf("\n");
		}
	}
}
