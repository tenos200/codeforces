#include <stdio.h>

int main(void) {

	int t;
	int w;
	int h;
	int n;
	int res;
	scanf("%d", &t);

	for(int i = 0; i < t; i++) {
		res = 1;
		scanf("%d %d %d", &w, &h, &n);
		while(w % 2 == 0) {

			w/=2;
			res*=2;
		}
		while(h % 2 == 0) {

			h/=2;
			res*=2;
		}
		if(res >= n) {
			printf("YES\n");

		} else {
			printf("NO\n");

		}
	}
	return 0;
}
