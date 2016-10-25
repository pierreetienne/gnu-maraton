import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class EdxWeek1F {

	static Map<Character, int[]> keys;
	public static void main(String[] args)throws Exception  {
		System.setIn(new FileInputStream("template.in"));
		System.setOut(new PrintStream("template.out"));
		try(Scanner in=new Scanner(System.in);){
			for(String ln;in.hasNextLine()&&(ln=in.nextLine())!=null;){
				StringTokenizer st=new StringTokenizer(ln);
				int W=Integer.parseInt(st.nextToken());
				int H=Integer.parseInt(st.nextToken());
				keys=new TreeMap<>();
				for(int i=H-1;i>=0;--i){
					ln=in.nextLine();
					for(int j=0;j<W;++j){
						keys.put(ln.charAt(j), new int[]{i+1,j+1});
					}
				}
				in.nextLine();
				String betterLanguage=null;
				int len=Integer.MAX_VALUE;
				while(in.hasNextLine()){
					String nameLang=in.nextLine();
					StringBuilder sb = new StringBuilder();
					while(in.hasNextLine()){
						String line=in.nextLine();
						sb.append(line);
						if(line.length()==0)
							break;
					}
					int lenLang = len(new String(sb));
					if(lenLang<len){
						betterLanguage=nameLang;
						len=lenLang;
					}
				}
				System.out.println(betterLanguage);
				System.out.println(len);
			}
		}
	}

	static int len(String line ){
		int len=0;
		Character last=null;
		for(int j=0;j<line.length();++j){
			if(last!=null){
				len+=distance(line.charAt(j),last);
			}
			last=line.charAt(j);
		}
		return len;
	}

	private static int distance(Character last, char current) {
		int[] posA=keys.get(last);
		int[] posB=keys.get(current);
		return distA(posA, posB) ;
	}
	
	private static int distA(int[] posA , int[] posB){
		return Math.max( Math.abs(posA[0]-posB[0]),Math.abs(posA[1]-posB[1]));
	}
	
	private static int distB(int[] posA,int[] posB){
		return (int) (Math.sqrt(  ((posB[0]-posA[0])*(posB[0]-posA[0])) + ((posB[1]-posA[1])*(posB[1]-posA[1]))  ));
	}
}
