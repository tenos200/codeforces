#include <stdio.h>
#include <stdlib.h>
int max(int y, int x);

int main (void) {

	int y;
	int w;
	int m;
	char *a[7] = {"0/1", "1/1", "5/6", "2/3", "1/2", "1/3", "1/6"};
	scanf("%d %d", &y, &w);

	m = max(y, w);
	printf("%s\n", a[m]);

	return 0;
}

int max(int y, int x) {

	return (y > x) ? y : x;
}
