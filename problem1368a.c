#include <stdio.h>

int main(void) {

	int a;
	int b;
	int n;
	int t;

	scanf("%d", &t);

	for (int i = 0; i < t; i++) {
	
		int cnt = 1;

		scanf("%d %d %d", &a, &b, &n);

		while(a+b <= n) {
			
			if(a>b) {
				b+=a;
			} else {
				a+=b;
			}
		
			cnt++;
		}
		printf("%d\n", cnt);
	}

	return 0;
}
