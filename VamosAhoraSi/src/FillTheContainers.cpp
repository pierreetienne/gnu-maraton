#include <iostream>
#include <fstream>
#include <climits>
using namespace std;
int main()
{
//	ifstream cin("fillContaine.in");
	int v, c ;
	while(cin >> v >> c ){
		int cap[v];
		int suma =0, indexmayor = 0 ;
		for(int i=0;i<v;++i){
			cin >> cap[i];suma+=cap[i];
			indexmayor=(cap[indexmayor]<cap[i])?i:indexmayor;
		}
		if(c >= v ) cout << cap[indexmayor]<< endl;
		else{
			int po = cap[indexmayor];
			int pf = suma;
			int pm = (po+pf)/2;
			int sol= suma;
			int ultimo = -1;
			while(po<=pm && pm < pf && po < pf){
				int cont=0,contenedores = 1;
				for(int i=0;i<v;++i){
					cont+=cap[i];
					if(cont>pm){
						contenedores ++;
						cont -= cap[i];					
						cont=cap[i];
					}
				}
				if(contenedores > c)
					po=pm;	
				else{
					if(pm < sol ) sol = pm;
					pf=pm;	
				}
				pm = (po+pf)/2;
				if(ultimo == pm)
					break;
				else ultimo = pm;
			}
			cout<< sol << endl;	
		}
	}
	return 0;
}


