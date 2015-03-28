import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.StringTokenizer;


public class MagicTrick {

	public static void main(String[] args) throws Exception{
		System.setOut(new PrintStream(new File("out.out")));
		System.setIn(new FileInputStream(new File("in.in")));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String ln;(ln=in.readLine())!=null;){
			int cases = Integer.parseInt(ln);
			int c = 1;
			while(cases-->0){
				int row = Integer.parseInt(in.readLine())-1;
				int[] pos = new int[4];
				for(int i=0;i<4;++i){
					StringTokenizer st = new StringTokenizer(in.readLine());
					for(int j=0;j<4;++j){
						if(i==row){
							String n = st.nextToken();
							pos[j]=Integer.parseInt(n);
						}
					}
				}
				int secondRow = Integer.parseInt(in.readLine())-1;
				int[] secondPos = new int[4];
				for(int i=0;i<4;++i){
					StringTokenizer st = new StringTokenizer(in.readLine());
					for(int j=0;j<4;++j){
						if(i==secondRow){
							String n = st.nextToken();
							secondPos[j]=Integer.parseInt(n);
						}
					}
				}
				int same = 0;
				int indexSame = -1;
				for(int i=0;i<4;++i){
					for(int j=0;j<4;++j){
						if(pos[i]==secondPos[j]){
							same++;
							indexSame=i;
							break;
						}
					}	
				}
				sb.append("Case #"+c+": ");
				c++;
				if(same == 0)sb.append("Volunteer cheated!");
				else if(same > 1) sb.append("Bad magician!");
				else sb.append(""+pos[indexSame]);
				sb.append("\n");
			}
		}
		System.out.print(new String(sb));
	}

}
