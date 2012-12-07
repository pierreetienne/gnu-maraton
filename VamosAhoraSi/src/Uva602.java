import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.StringTokenizer;


public class Uva602 {

	static HashMap<Integer , String > dias;
	static HashMap<Integer , String > meses;
	public static void main(String[] args)throws Exception {
		dias = new HashMap<Integer, String>();
		dias.put(Calendar.SUNDAY , "Sunday");
		dias.put(Calendar.MONDAY , "Monday");
		dias.put(Calendar.TUESDAY , "Tuesday");
		dias.put(Calendar.WEDNESDAY , "Wednesday");
		dias.put(Calendar.THURSDAY , "Thursday");
		dias.put(Calendar.FRIDAY , "Friday");
		dias.put(Calendar.SATURDAY , "Saturday");

		meses = new HashMap<Integer, String>();
		meses.put(0,"January");
		meses.put(1,"February");
		meses.put(2,"March");
		meses.put(3,"April");
		meses.put(4,"May");
		meses.put(5,"June");
		meses.put(6,"July");
		meses.put(7,"August");
		meses.put(8,"September");
		meses.put(9,"October");
		meses.put(10,"November");
		meses.put(11,"December");

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(String linea;(linea = bf.readLine())!=null;){
			StringTokenizer st = new StringTokenizer(linea);
			int mes = Integer.parseInt(st.nextToken());
			int dia = Integer.parseInt(st.nextToken());
			int anio = Integer.parseInt(st.nextToken());
			if(mes == 0 && dia == 0 && anio == 0)break;
			
			System.out.println("Anio " + anio + " mes  " + mes + " dia " + dia);
			Calendar c = Calendar.getInstance(Locale.US);
			c.clear();
			c.set(anio, mes-1, dia);
			
			System.out.println(c.getTime());
			sb.append(meses.get(c.get(Calendar.MONTH)) +" "+ dia + ", " + c.get(Calendar.YEAR) +" is a "+ dias.get(c.get(Calendar.DAY_OF_WEEK))+"\n");
		//	sb.append((mes+"/"+dia+"/"+anio)+" is an invalid date.\n");
		}
		System.out.print(new String(sb));
	}

	

}
