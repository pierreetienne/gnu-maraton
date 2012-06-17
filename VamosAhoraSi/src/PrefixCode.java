
public class PrefixCode {
	public static void main(String[] args) {
		String[] a = new String[]{"1010", "11", "100", "0", "1011"};
		System.out.println(new PrefixCode().isOne(a));
	}
	public String isOne(String[] words){
		if(words.length==1)
			return "Yes";
		else{
			int index = Integer.MAX_VALUE;
			for(int i=0;i<words.length;++i){
				for(int j=0;j<words.length;++j){
					if(i!=j && words[i].length() >= words[j].length() && words[j].equals(words[i].substring(0, words[j].length()))){
						if(j< index){
							index=j;
						}
					}
				}
			}
			return (index == Integer.MAX_VALUE)?"Yes":"No, "+index;
		}
	}
}
//19800