import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class CF611A {


	public static void main(String[] args) throws Exception {
		String ofWeek = "of week";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String ln;(ln=in.readLine())!=null;){
			int n = Integer.parseInt(ln.substring(0, ln.indexOf(' ')));
			String resto = ln.substring(ln.indexOf(' ')+1);
			Calendar c = Calendar.getInstance();
			c.set(Calendar.DAY_OF_MONTH, 1);
			c.set(Calendar.MONTH,Calendar.JANUARY);
			c.set(Calendar.YEAR,2016);
			if(resto.equals(ofWeek)){
				int day = 0 ;
				switch (n) {
				case 1:
					day= Calendar.MONDAY;
					break;
				case 2:
					day= Calendar.TUESDAY;
					break;
				case 3:
					day= Calendar.WEDNESDAY;
					break;
				case 4:
					day= Calendar.THURSDAY;
					break;
				case 5:
					day= Calendar.FRIDAY;
					break;
				case 6:
					day= Calendar.SATURDAY;
					break;
				case 7:
					day= Calendar.SUNDAY;
					break;
				default:
					break;
				}
				int count = 0;
				while(c.get(Calendar.YEAR)==2016){
					if(c.get(Calendar.DAY_OF_WEEK)== day)
						count++;
					c.add(Calendar.DAY_OF_MONTH, 1);
				}
				System.out.println(count);
			}else{
				int count = 0;
				while(c.get(Calendar.YEAR)==2016){
					if(c.get(Calendar.DAY_OF_MONTH)== n)
						count++;
					c.add(Calendar.DAY_OF_MONTH, 1);
				}
				System.out.println(count);
			}

		}	

	}

}
