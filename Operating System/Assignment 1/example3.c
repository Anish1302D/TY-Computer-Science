#include <stdio.h>

int main()
{
  char a[100];
  fprintf(stdout, "Enter a string: ");
  fscanf(stdin, "%s", a);
  
  fprintf(stdout, "\nYou entered the following string: %s", a);
  fprintf(stdout, "\n");
  return 0;
}
