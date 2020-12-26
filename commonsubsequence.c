#include <stdio.h>
#include <stdbool.h>

int main (void) {

	int t;

	scanf("%d", &t);


	while(t--) {

		int n = 0;
		int m = 0;
		int index = 0;
		int boolean = 0;
		scanf("%d %d", &n, &m);
		int a[n];
		int b[m];

		for(int i = 0; i < n; i++) {
			scanf("%d", &a[i]);
		}
		for(int i = 0; i < m; i++) {
			scanf("%d", &b[i]);
		}

		for (int i = 0; i < n; i++) {

			if(boolean > 0) {
				break;
			}

			for (int j = 0; j < m; j++) {
				if(a[i] == b[j]) {
					index = i;
					boolean = 1;
					break;
				}
			}
		}

		if(boolean > 0) {
			printf("YES\n1 %d\n", a[index]);
		}
		else {
			printf("NO\n");
		
		}
	}
	return 0;
}
