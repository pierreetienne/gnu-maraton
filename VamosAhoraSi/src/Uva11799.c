#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>

/**
 * @author Pierre Etienne Pradere Palacios
 * @linkDeArchivo http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=2899
 * @veredict Accepted
 * @problemId 11799
 * @problemName  Event Planning
 * @judge http://uva.onlinejudge.org/
 * @category AC
 * @level easy
 * @date 30/12/2011
 **/

char sor[800000], * po;
int a,max,num,caso;

int main()
{
    while(gets(sor)){
         sscanf(sor,"%d",&a);
         caso=1;
         while(a-->0){
              max = INT_MIN;
              gets(sor);
              po = strtok(sor," ");
              while(po != NULL)
              {
                num = atoi(po);
                if(num > max)
                {
                  max = num;
                }
                po = strtok(NULL," ");
              }
              printf("Case %d: %d\n", (caso++),max );
         }
    }
    return 0;
}
