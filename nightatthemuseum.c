#include <stdio.h>
#include <string.h>
#define min(a,b) ((a)<(b)?(a):(b))
#define max(a,b) ((a)>(b)?(a):(b))
#define abs(x) ((x)>0?(x):-(x))
int main(void) {

	char c[101];
	int cnt = 0;
	int alp = 26;
	scanf("%s", c);
	int length = strlen(c);
	char tmp = 'a';

	for (int i = 0; i < length; i++) {

		cnt+= min(abs(c[i] - tmp), alp - (abs(c[i] - tmp)));
		tmp = c[i];
	}

	printf("%d\n", cnt);

	return 0;
}
