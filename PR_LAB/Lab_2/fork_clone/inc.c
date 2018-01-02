#include<stdlib.h>
#include<stdio.h>
#include<unistd.h>

int main(int argc, char **argv) {
	int temp;
	temp = (int)(argv[1][0] - '0');
	temp++;
	printf(" zmienna globalna : %i ", temp );
	printf("\n");

	return temp;
}