import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Uva10363 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine().trim());
		StringBuilder sb = new StringBuilder();
		while(N-->0){
			char[][] m = new char[3][];
			m[0]=bf.readLine().trim().toCharArray();
			m[1]=bf.readLine().trim().toCharArray();
			m[2]=bf.readLine().trim().toCharArray();

			boolean ganaX = false;
			if((m[0][0]=='X' && m[0][1]=='X' && m[0][2]=='X' )||
					(m[1][0]=='X' && m[1][1]=='X' && m[1][2]=='X')||
					(m[2][0]=='X' && m[2][1]=='X' && m[2][2]=='X' )||
					(m[0][0]=='X' && m[1][0]=='X' && m[2][0]=='X' )||
					(m[0][1]=='X' && m[1][1]=='X' && m[2][1]=='X' )||
					(m[0][2]=='X' && m[1][2]=='X' && m[2][2]=='X' )||
					(m[0][0]=='X' && m[1][1]=='X' && m[2][2]=='X' )||
					(m[0][2]=='X' && m[1][1]=='X' && m[2][0]=='X' ))
				ganaX= true;

			boolean gangO = false;

			if((m[0][0]=='O' && m[0][1]=='O' && m[0][2]=='O' )||
					(m[1][0]=='O' && m[1][1]=='O' && m[1][2]=='O')||
					(m[2][0]=='O' && m[2][1]=='O' && m[2][2]=='O' )||
					(m[0][0]=='O' && m[1][0]=='O' && m[2][0]=='O' )||
					(m[0][1]=='O' && m[1][1]=='O' && m[2][1]=='O' )||
					(m[0][2]=='O' && m[1][2]=='O' && m[2][2]=='O' )||
					(m[0][0]=='O' && m[1][1]=='O' && m[2][2]=='O' )||
					(m[0][2]=='O' && m[1][1]=='O' && m[2][0]=='O' ))
				gangO= true;

			int cantidadX = 0;
			int cantidadO = 0;
			for(int i=0;i<3;++i){
				for(int j=0;j<3;++j)
				{
					if(m[i][j]=='X')cantidadX++;
					else if(m[i][j]=='O')cantidadO++;
				}
			}

			if(ganaX&&!gangO)
			{
				if(cantidadX == cantidadO+1)
					sb.append("yes\n");
				else
					sb.append("no\n");
			}
			else if(gangO&&!ganaX)
			{
				if(cantidadO==cantidadX)
					sb.append("yes\n");
				else
					sb.append("no\n");
			}
			else if(!gangO && !ganaX)
			{
				if(cantidadO==cantidadX)
					sb.append("yes\n");
				else
					sb.append("no\n");
			}
			else
				sb.append("no\n");
			
			if(N > 0 )
			bf.readLine();
		}
		System.out.print(new String(sb));
	}
}
