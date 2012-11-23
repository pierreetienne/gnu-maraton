import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Uva12526 {

	static class Trie {
		 
	  	//máximo número prefijos.
	  	static int N=1000;
	 
	  	int[][] nodes = new int[N][26];
	  	int nNodes;
	  	String[] list;
	  	int nList;
	  	
	  	void initTrie(){
	        	for (int i = 0; i < N; i++) {
	              	Arrays.fill(nodes[i], -1);
	        	}
	        	nNodes = 1;
	  	}
	  	
	  	void insert(String ss){
	        	char[] s = ss.toCharArray();
	        	int node = 0;
	        	for (int i = 0; i < s.length; i++) {
	              	int let = (int)(s[i]-'a');
	              	if (nodes[node][let] == -1){
	                    	nodes[node][let] = nNodes;
	                    	node = nNodes;
	                    	nNodes++;
	              	}else node = nodes[node][let];
	        	}
	  	}
	  	
	  	
	  	void listPrefix(){
	        	list = new String[nNodes];
	        	nList = 0;
	        	listPrefixRec("",0);
	  	}
	  	
	  	void listPrefixRec(String pre, int node){
	        	if (node>=nNodes) return;
	        	list[nList] = pre;
	        	nList++;
	        	for (int i = 0; i < 26; i++) {
	              	if (nodes[node][i]!=-1)
	                    	listPrefixRec(pre+((char)(i+'a')), nodes[node][i]); 
	        	}
	  	}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for(String linea;(linea = bf.readLine())!=null;){
			int N = Integer.parseInt(linea);
			Trie t = new Trie();
			t.initTrie();
			for(int i=0;i<N;++i)t.insert(bf.readLine());
			
			
		}
	}

}
