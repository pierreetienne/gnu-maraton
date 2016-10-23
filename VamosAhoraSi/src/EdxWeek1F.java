import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
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
				for(int i=0;i<H;++i){
					ln=in.nextLine();
					for(int j=0;j<W;++j){
						keys.put(ln.charAt(j), new int[]{i,j});
					}
				}
				in.nextLine();
				String betterLanguage=null;
				int len=Integer.MAX_VALUE;
				while(in.hasNextLine()){
					String nameLang=in.nextLine();
					List<String> lines=new ArrayList<>();
					while(in.hasNextLine()){
						String line=in.nextLine();
						if(line.trim().length()==0)
							break;
						lines.add(line);
					}
					int lenLang = len(lines);
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

	static int len(List<String> lines ){
		int len=0;
		Character last=null;
		for(int i=0;i<lines.size();++i){
			String line=lines.get(i);
			for(int j=0;j<line.length();++j){
				if(last!=null){
					System.out.println( distance(last,line.charAt(j)));
					len+=distance(last,line.charAt(j));
				}
				last=line.charAt(j);
			}
		}
		System.out.println();
		return len;
	}

	private static int distance(Character last, char current) {
		int[] posA=keys.get(last);
		int[] posB=keys.get(current);
		return Math.abs(posA[0]-posB[0])+Math.abs(posA[1]-posB[1]);
	}

}
