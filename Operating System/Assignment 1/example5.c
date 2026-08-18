#include <stdio.h>
#include <fcntl.h>
#include <stdio.h>
#include <unistd.h>
#include <errno.h>

extern int errno;

int main()
{
	//If file does not have to directory
	//then file foo.txt is created.
	
	int fd = open("foo.txt", O_RDONLY | O_CREAT, 0644);
	printf("File descriptor of foo.txt is = %d\n", fd);

	if(fd == -1)
	{
		//Print which type of error have in a code
		printf("Error Number %d\n", errno);

		//Print program detail "Success or failure"
		perror("Program");
	}
	
	if(fd != -1)
	{
		close(fd);
	}
	return 0;
}

