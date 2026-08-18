#include <stdio.h>
#include <stdlib.h>

int main()
{
  char c;
  int i, l;
  
  fprintf(stdout, "Enter the string length");
  fscanf(stdin, "%d", &l);
  fprintf(stdout, "Enter a value : ");
  
  for(i = 0; i <= l; i ++)
  {
    c = getc(stdin);
    putc(c, stdout);
  }
  
  fprintf(stdout, "\n");
  return 0;
}
