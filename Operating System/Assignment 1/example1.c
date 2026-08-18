#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <fcntl.h>

int main()
{
  close(1);
  
  int fd = open("output.txt", O_WRONLY | O_CREAT | O_TRUNC, 0644);
  
  if(fd == -1)
  {
    perror("Failed to open file");
    return EXIT_FAILURE;
  }
  
  printf("This will be written to the file 'output.txt'\n");
  fflush(stdout);
  close(fd);
  
  return 0;
}
