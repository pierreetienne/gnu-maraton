import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class EdxWeek2C {

	static class QueueCustom {
		int min;
		Node head;
	}
	
	static class Node{
		int value;
		Node next;
		Node prev;
	}
	
	public static void main(String[] args)throws Exception  {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int N=Integer.parseInt(ln);
			QueueCustom q = new QueueCustom();
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<N;++i){
				ln=in.readLine();
				StringTokenizer st=new StringTokenizer(ln);
				String token=st.nextToken();
				if(token.equals("+")){
					Node n=new Node();
					n.value=Integer.parseInt(st.nextToken()); 
				}else if(token.equals("-")){
				}else{
				}
			}
			System.out.print(new String(sb));
		}
	}

}
