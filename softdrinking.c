#include <stdio.h>
#define MIN(a,b) ((a) < (b) ? (a) : (b))

int main(void) {

	int n, k, l, c, d, p, nl, np, cnt, cnt1, cnt2;
	scanf("%d %d %d %d %d %d %d %d", &n, &k, &l, &c, &d, &p, &nl, &np);
	cnt = (k*l) / nl;
	cnt1 = c * d;
	cnt2 = p / np;
	int min = MIN(cnt, cnt1);
	int min2 = MIN(cnt2, min);
	printf("%d\n", min2 / n);


	return 0;
}
