#include <stdio.h>

int main (void) {

	int t;
	int n;
	int x;

	scanf("%d", &t);

	for (int i = 0; i < t; i++) {
	
		scanf("%d %d", &n, &x);

		if(n <= 2) {
			printf("%d\n", 1);
		}
		else {
			printf("%d\n", ((n-3)/x) + 2);
		}
	}
	return 0;
}
