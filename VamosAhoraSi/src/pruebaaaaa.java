import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class pruebaaaaa {


	// String lista[] = { "miel", "extraterrestre", "al", "automovil", "auto", "revestir" };
	// String alfabeto = "zyxwvutsrqponmlkjihgfedcba";
	public static String[] ordenar_extraterrestre(String desordenadas[], String orden_alfabeto)
	{
		//	    String ordenada[] = { "revestir", "miel", "extraterrestre", "auto", "automovil", "al" };
		//	    return ordenada;
		Arrays.sort(desordenadas, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int min = Math.min(o1.length(), o2.length());
				int k = 0;
				while(k<min){
					if(o1.charAt(k)!=o2.charAt(k)){
						return orden_alfabeto.indexOf(o1.charAt(k))-orden_alfabeto.indexOf(o2.charAt(k));
					}
					++k;
				}

				return o1.length()- o2.length();
			}
		});
		return desordenadas;
	}

	public static  String quien_es_el_mas_popular(String mensaje1[], String mensaje2[], String mensaje3[])
	{
		Map<String, Integer> c = new HashMap<>();
		String[][] m = {mensaje1, mensaje2, mensaje3};
		int max = 0 ;
		String name = "";
		for(int i=0;i<m.length;++i){
			if(c.get(m[i][1].trim().toLowerCase())==null){
				c.put(m[i][1].trim().toLowerCase(), m[i][2].length());
			}else{
				c.put(m[i][1].trim().toLowerCase(),m[i][2].length());
			}
			if(c.get(m[i][1].trim().toLowerCase())>max){
				name = m[i][1];
				max = c.get(m[i][1].trim().toLowerCase());
			}
		}
		return name;
	}

	public static void main(String[] args) {

		String mensaje1[] = { "juan", "pedro", "asdasdasdasdasdasda sd asdasda s das das dasbuen dia matias!!a" };
		String mensaje2[] = { "agus", "matias  ", "as" };
		String mensaje3[] = { "jorge", "  Matias", "asdasdasdasdasdasda sd asdasda s das das dasbuen dia matias!!ss" };
		System.out.println("-> " + quien_es_el_mas_popular(mensaje1, mensaje2, mensaje3));
		System.out.println("Arr -- "+  Arrays.toString(ordenar_extraterrestre(new String[]{"a","b", "c","d" ,"za","zas","a","miel", "extraterrestre", "al", "automovil", "auto", "revestir" },"zyxwvutsrqponmlkjihgfedcba")));

	}

}
