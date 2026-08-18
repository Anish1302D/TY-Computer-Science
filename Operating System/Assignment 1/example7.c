#include <stdio.h>
#include <fcntl.h>
#include <stdlib.h>
#include <unistd.h>

int main()
{
	//Assume that foo.txt is already created that has 3-5 lines
	int fd1 = open("foo.txt", O_RDONLY, 0);
	close(fd1);

	//assume that baz.txt is already created has 3-5 lines 
	int fd2 = open("baz.txt", O_RDONLY, 0);

	printf("fd2 = %d\n",fd2);
	exit(0);

	return 0;
}
