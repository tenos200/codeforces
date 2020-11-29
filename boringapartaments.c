#include <stdio.h>

int main(void) {
	int n;
	int t;
	scanf("%d", &t);

	for (int i = 0; i < t; i++) {

		scanf("%d", &n);

		int len = 0;
		int dig = n % 10;

		while(n != 0) {
			n/=10;
			len++;
		}
		int ans = 10 * (dig - 1) + len*(len + 1) /2;
		printf("%d\n", ans);
	}
	return 0;
}
