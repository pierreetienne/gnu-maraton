
import java.util.Arrays;
import java.util.Comparator;


public class Birthday {

	public static void main(String ... args){
		System.out.println(new Birthday().getNext("06/17", new String[]{"02/17 Wernie", "10/12 Stefan"}));
	}
	
	public String getNext(String date, String[] birthdays){
		int[][] fechas = new int[birthdays.length][2];
		for(int i=0;i<birthdays.length;++i){
			String aux[] = birthdays[i].split(" ")[0].split("/");
			fechas[i][0]= Integer.parseInt(aux[0]);
			fechas[i][1]= Integer.parseInt(aux[1]);
		}
		Arrays.sort(fechas, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				return (o1[0]==o2[0]&&o1[1]==o2[1])?0:(o1[0]>o2[0])?1:(o1[0]<o2[0])?-1:(o1[0]==o2[0]&& o1[1]<o2[1])?-1:1;
			}
		});

		String fechaActual[] = date.split("/");
		for(int i=0;i<birthdays.length;++i){
//			System.out.println(fechas[i][0] +  " -- " + fechas[i][1]  );
//			System.out.println("Actual " + fechaActual[0]+"---" + fechaActual[1]);
			if(fechas[i][0]>Integer.parseInt(fechaActual[0])){
				return ((fechas[i][0]<10)?"0"+fechas[i][0]:fechas[i][0])+"/"+((fechas[i][1]<10)?"0"+fechas[i][1]:fechas[i][1]);
			}else if(fechas[i][0]==Integer.parseInt(fechaActual[0]) &&fechas[i][1]>=Integer.parseInt(fechaActual[1]) ){
				return ((fechas[i][0]<10)?"0"+fechas[i][0]:fechas[i][0])+"/"+((fechas[i][1]<10)?"0"+fechas[i][1]:fechas[i][1]);
			}
		}
		return ((fechas[0][0]<10)?"0"+fechas[0][0]:fechas[0][0])+"/"+((fechas[0][1]<10)?"0"+fechas[0][1]:fechas[0][1]);
	}
	
}
