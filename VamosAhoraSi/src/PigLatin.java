
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class PigLatin {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Character ch = null;
		StringBuffer string = new StringBuffer();
		while((ch = (char) bf.read())!=null){
			string.append(ch);
		}
		StringBuffer salida = new StringBuffer();
		int aux = string.indexOf(" "); 
		while(aux!=-1){
			String palabra =  string.toString();
			palabra = palabra.substring(0,aux);
			if(palabra.length()>0 && isVocal(palabra.charAt(0))){
				int index = -1;
				for(int i=0;i<palabra.length()&&index==-1;++i){
					if(!Character.isLetterOrDigit(palabra.charAt(i))){
						index=i;
					}
				}
				if(index==-1)
					index=palabra.length();
				palabra = palabra.substring(0,index)+"ay"+palabra.substring(index);
			}else if( palabra.length() >0 ){
				
				int index = -1;
				for(int i=0;i<palabra.length()&&index==-1;++i){
					if(!Character.isLetterOrDigit(palabra.charAt(i))){
						index=i;
					}
				}
				if(index==-1)
					index=palabra.length();
				palabra = palabra.substring(1,index)+palabra.charAt(0)+"ay"+palabra.substring(index);
				
			}
			
			salida.append(palabra+" ");
			string = new StringBuffer(string.substring(aux+1));
			aux = string.indexOf(" ");
		}
		String palabra =  string.toString();
		if(isVocal(palabra.charAt(0))){
			int index = -1;
			for(int i=0;i<palabra.length()&&index==-1;++i){
				if(!Character.isLetterOrDigit(palabra.charAt(i))){
					index=i;
				}
			}
			if(index==-1)
				index=palabra.length();
			palabra = palabra.substring(0,index)+"ay"+palabra.substring(index);
		}else{
			
			int index = -1;
			for(int i=0;i<palabra.length()&&index==-1;++i){
				if(!Character.isLetterOrDigit(palabra.charAt(i))){
					index=i;
				}
			}
			if(index==-1)
				index=palabra.length();
			palabra = palabra.substring(1,index)+palabra.charAt(0)+"ay"+palabra.substring(index);
			
		}
		salida.append(palabra);
		System.out.println(salida.toString());
	}
	
	
	public static boolean isVocal(char a ){
		return (a=='A'||a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='o'||a=='u');
	}

}
