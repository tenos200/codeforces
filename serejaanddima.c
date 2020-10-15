#include <stdio.h>

int main(void) {


	int n, l, r;
	int cnt = 0; 
	int s = 0; 
	int d = 0;
	int store;

	scanf("%d", &n);
	int a[n];
	r = n - 1;
	l = 0;

	for (int i = 0; i < n; i++) {

		scanf(" %d", &store);
		a[i] = store;
	}

	while(l <= r) {

		int pick = 0;
		
		if(a[l] > a[r]) {
			
			pick = a[l];
			l++;

		}
		else {
			pick = a[r];
			r--;
		
		}

		if(cnt % 2 == 0) {
		
			s += pick;
		}

		else {
			d += pick;
		
		}
		cnt++;
	
	}
	printf("%d %d\n", s, d);

	return 0;
}
