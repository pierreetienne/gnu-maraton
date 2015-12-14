import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;


public class Uva725 {


	static class NextPermutation {

		//retorna false si p es la última permutación
		//tiene en cuenta elementos repetidos, no hay que agregar nada
		static boolean nextPermutation(int[] p){
			int k,l,aux,i,j;
			for (k = p.length-1; k>0 && p[k-1]>=p[k]; k--);
			if (k!=0){
				for (l = p.length-1; l>0 && p[k-1]>=p[l]; l--);
				aux=p[k-1]; p[k-1]=p[l]; p[l]=aux;
				for (i = k, j = p.length-1; i<j ; i++,j--){
					aux=p[i]; p[i]=p[j]; p[j]=aux;
				}
				return true;
			} 	
			else return false;
			//para prevPermutation solo hay que cambiar los dos >= por <=
		}

		static boolean prevPermutation(int[] p){
			int k,l,aux,i,j;
			for (k = p.length-1; k>0 && p[k-1]<=p[k]; k--);
			if (k!=0){
				for (l = p.length-1; l>0 && p[k-1]<=p[l]; l--);
				aux=p[k-1]; p[k-1]=p[l]; p[l]=aux;
				for (i = k, j = p.length-1; i<j ; i++,j--){
					aux=p[i]; p[i]=p[j]; p[j]=aux;
				}
				return true;
			} 	
			else return false;
		}

	}
	
	static HashMap<Integer,ArrayList<int[]>> h;
	
	static void init(){
		h=new HashMap<Integer, ArrayList<int[]>>();
		h.put(68, new ArrayList<int[]>());
		h.get(68).add(new int[]{98736,1452});
		h.put(2, new ArrayList<int[]>());
		h.get(2).add(new int[]{13458,6729});
		h.get(2).add(new int[]{13584,6792});
		h.get(2).add(new int[]{13854,6927});
		h.get(2).add(new int[]{14538,7269});
		h.get(2).add(new int[]{14586,7293});
		h.get(2).add(new int[]{14658,7329});
		h.get(2).add(new int[]{15384,7692});
		h.get(2).add(new int[]{15846,7923});
		h.get(2).add(new int[]{15864,7932});
		h.get(2).add(new int[]{18534,9267});
		h.get(2).add(new int[]{18546,9273});
		h.get(2).add(new int[]{18654,9327});
		h.get(2).add(new int[]{26970,13485});
		h.get(2).add(new int[]{27096,13548});
		h.get(2).add(new int[]{27690,13845});
		h.get(2).add(new int[]{29076,14538});
		h.get(2).add(new int[]{29370,14685});
		h.get(2).add(new int[]{29670,14835});
		h.get(2).add(new int[]{29706,14853});
		h.get(2).add(new int[]{29730,14865});
		h.get(2).add(new int[]{30972,15486});
		h.get(2).add(new int[]{32970,16485});
		h.get(2).add(new int[]{37092,18546});
		h.get(2).add(new int[]{37290,18645});
		h.get(2).add(new int[]{41358,20679});
		h.get(2).add(new int[]{41538,20769});
		h.get(2).add(new int[]{41586,20793});
		h.get(2).add(new int[]{46158,23079});
		h.get(2).add(new int[]{53418,26709});
		h.get(2).add(new int[]{53814,26907});
		h.get(2).add(new int[]{54138,27069});
		h.get(2).add(new int[]{54186,27093});
		h.get(2).add(new int[]{54618,27309});
		h.get(2).add(new int[]{58134,29067});
		h.get(2).add(new int[]{58146,29073});
		h.get(2).add(new int[]{58614,29307});
		h.get(2).add(new int[]{61458,30729});
		h.get(2).add(new int[]{61584,30792});
		h.get(2).add(new int[]{61854,30927});
		h.get(2).add(new int[]{62970,31485});
		h.get(2).add(new int[]{64158,32079});
		h.get(2).add(new int[]{65418,32709});
		h.get(2).add(new int[]{65814,32907});
		h.get(2).add(new int[]{69702,34851});
		h.get(2).add(new int[]{70296,35148});
		h.get(2).add(new int[]{70962,35481});
		h.get(2).add(new int[]{76290,38145});
		h.get(2).add(new int[]{76902,38451});
		h.get(2).add(new int[]{90276,45138});
		h.get(2).add(new int[]{90372,45186});
		h.get(2).add(new int[]{90762,45381});
		h.get(2).add(new int[]{92370,46185});
		h.get(2).add(new int[]{93702,46851});
		h.get(2).add(new int[]{96270,48135});
		h.get(2).add(new int[]{96702,48351});
		h.get(2).add(new int[]{97026,48513});
		h.get(2).add(new int[]{97032,48516});
		h.get(2).add(new int[]{97062,48531});
		h.get(2).add(new int[]{97230,48615});
		h.get(2).add(new int[]{97302,48651});
		h.put(3, new ArrayList<int[]>());
		h.get(3).add(new int[]{17469,5823});
		h.get(3).add(new int[]{17496,5832});
		h.get(3).add(new int[]{50382,16794});
		h.get(3).add(new int[]{53082,17694});
		h.get(3).add(new int[]{61749,20583});
		h.get(3).add(new int[]{69174,23058});
		h.get(3).add(new int[]{91746,30582});
		h.get(3).add(new int[]{96174,32058});
		h.put(4, new ArrayList<int[]>());
		h.get(4).add(new int[]{15768,3942});
		h.get(4).add(new int[]{17568,4392});
		h.get(4).add(new int[]{23184,5796});
		h.get(4).add(new int[]{31824,7956});
		h.get(4).add(new int[]{60948,15237});
		h.get(4).add(new int[]{68940,17235});
		h.get(4).add(new int[]{69408,17352});
		h.get(4).add(new int[]{81576,20394});
		h.get(4).add(new int[]{81756,20439});
		h.get(4).add(new int[]{86940,21735});
		h.get(4).add(new int[]{94068,23517});
		h.get(4).add(new int[]{94860,23715});
		h.put(5, new ArrayList<int[]>());
		h.get(5).add(new int[]{13485,2697});
		h.get(5).add(new int[]{13845,2769});
		h.get(5).add(new int[]{14685,2937});
		h.get(5).add(new int[]{14835,2967});
		h.get(5).add(new int[]{14865,2973});
		h.get(5).add(new int[]{16485,3297});
		h.get(5).add(new int[]{18645,3729});
		h.get(5).add(new int[]{31485,6297});
		h.get(5).add(new int[]{38145,7629});
		h.get(5).add(new int[]{46185,9237});
		h.get(5).add(new int[]{48135,9627});
		h.get(5).add(new int[]{48615,9723});
		h.get(5).add(new int[]{67290,13458});
		h.get(5).add(new int[]{67920,13584});
		h.get(5).add(new int[]{69270,13854});
		h.get(5).add(new int[]{72690,14538});
		h.get(5).add(new int[]{72930,14586});
		h.get(5).add(new int[]{73290,14658});
		h.get(5).add(new int[]{76920,15384});
		h.get(5).add(new int[]{79230,15846});
		h.get(5).add(new int[]{79320,15864});
		h.get(5).add(new int[]{92670,18534});
		h.get(5).add(new int[]{92730,18546});
		h.get(5).add(new int[]{93270,18654});
		h.put(66, new ArrayList<int[]>());
		h.get(66).add(new int[]{83754,1269});
		h.put(6, new ArrayList<int[]>());
		h.get(6).add(new int[]{17658,2943});
		h.get(6).add(new int[]{27918,4653});
		h.get(6).add(new int[]{34182,5697});
		h.put(7, new ArrayList<int[]>());
		h.get(7).add(new int[]{16758,2394});
		h.get(7).add(new int[]{18459,2637});
		h.get(7).add(new int[]{31689,4527});
		h.get(7).add(new int[]{36918,5274});
		h.get(7).add(new int[]{37926,5418});
		h.get(7).add(new int[]{41832,5976});
		h.get(7).add(new int[]{53298,7614});
		h.get(7).add(new int[]{98532,14076});
		h.put(8, new ArrayList<int[]>());
		h.get(8).add(new int[]{25496,3187});
		h.get(8).add(new int[]{36712,4589});
		h.get(8).add(new int[]{36728,4591});
		h.get(8).add(new int[]{37512,4689});
		h.get(8).add(new int[]{37528,4691});
		h.get(8).add(new int[]{38152,4769});
		h.get(8).add(new int[]{41896,5237});
		h.get(8).add(new int[]{42968,5371});
		h.get(8).add(new int[]{46312,5789});
		h.get(8).add(new int[]{46328,5791});
		h.get(8).add(new int[]{46712,5839});
		h.get(8).add(new int[]{47136,5892});
		h.get(8).add(new int[]{47328,5916});
		h.get(8).add(new int[]{47368,5921});
		h.get(8).add(new int[]{51832,6479});
		h.get(8).add(new int[]{53928,6741});
		h.get(8).add(new int[]{54312,6789});
		h.get(8).add(new int[]{54328,6791});
		h.get(8).add(new int[]{54712,6839});
		h.get(8).add(new int[]{56984,7123});
		h.get(8).add(new int[]{58496,7312});
		h.get(8).add(new int[]{58912,7364});
		h.get(8).add(new int[]{59328,7416});
		h.get(8).add(new int[]{59368,7421});
		h.get(8).add(new int[]{63152,7894});
		h.get(8).add(new int[]{63528,7941});
		h.get(8).add(new int[]{65392,8174});
		h.get(8).add(new int[]{65432,8179});
		h.get(8).add(new int[]{67152,8394});
		h.get(8).add(new int[]{67352,8419});
		h.get(8).add(new int[]{67512,8439});
		h.get(8).add(new int[]{71456,8932});
		h.get(8).add(new int[]{71536,8942});
		h.get(8).add(new int[]{71624,8953});
		h.get(8).add(new int[]{71632,8954});
		h.get(8).add(new int[]{73248,9156});
		h.get(8).add(new int[]{73264,9158});
		h.get(8).add(new int[]{73456,9182});
		h.get(8).add(new int[]{74528,9316});
		h.get(8).add(new int[]{74568,9321});
		h.get(8).add(new int[]{74816,9352});
		h.get(8).add(new int[]{75328,9416});
		h.get(8).add(new int[]{75368,9421});
		h.get(8).add(new int[]{76184,9523});
		h.get(8).add(new int[]{76248,9531});
		h.get(8).add(new int[]{76328,9541});
		h.get(8).add(new int[]{83672,10459});
		h.get(8).add(new int[]{83752,10469});
		h.get(8).add(new int[]{84296,10537});
		h.get(8).add(new int[]{84632,10579});
		h.get(8).add(new int[]{84736,10592});
		h.get(8).add(new int[]{85392,10674});
		h.get(8).add(new int[]{85432,10679});
		h.get(8).add(new int[]{85936,10742});
		h.get(8).add(new int[]{86352,10794});
		h.get(8).add(new int[]{87456,10932});
		h.get(8).add(new int[]{87536,10942});
		h.get(8).add(new int[]{87624,10953});
		h.get(8).add(new int[]{87632,10954});
		h.get(8).add(new int[]{96584,12073});
		h.get(8).add(new int[]{98456,12307});
		h.get(8).add(new int[]{98760,12345});
		h.put(9, new ArrayList<int[]>());
		h.get(9).add(new int[]{57429,6381});
		h.get(9).add(new int[]{58239,6471});
		h.get(9).add(new int[]{75249,8361});
		h.get(9).add(new int[]{95742,10638});
		h.get(9).add(new int[]{95823,10647});
		h.get(9).add(new int[]{97524,10836});
		h.put(12, new ArrayList<int[]>());
		h.get(12).add(new int[]{45792,3816});
		h.get(12).add(new int[]{73548,6129});
		h.get(12).add(new int[]{89532,7461});
		h.get(12).add(new int[]{91584,7632});
		h.put(13, new ArrayList<int[]>());
		h.get(13).add(new int[]{67392,5184});
		h.get(13).add(new int[]{81549,6273});
		h.get(13).add(new int[]{94653,7281});
		h.put(14, new ArrayList<int[]>());
		h.get(14).add(new int[]{25746,1839});
		h.get(14).add(new int[]{27384,1956});
		h.get(14).add(new int[]{41538,2967});
		h.get(14).add(new int[]{46158,3297});
		h.get(14).add(new int[]{51492,3678});
		h.get(14).add(new int[]{54768,3912});
		h.get(14).add(new int[]{61572,4398});
		h.get(14).add(new int[]{65982,4713});
		h.put(15, new ArrayList<int[]>());
		h.get(15).add(new int[]{27945,1863});
		h.get(15).add(new int[]{92745,6183});
		h.put(17, new ArrayList<int[]>());
		h.get(17).add(new int[]{26843,1579});
		h.get(17).add(new int[]{28543,1679});
		h.get(17).add(new int[]{29546,1738});
		h.get(17).add(new int[]{36958,2174});
		h.get(17).add(new int[]{45713,2689});
		h.get(17).add(new int[]{45781,2693});
		h.get(17).add(new int[]{54689,3217});
		h.get(17).add(new int[]{59126,3478});
		h.get(17).add(new int[]{64957,3821});
		h.get(17).add(new int[]{65297,3841});
		h.get(17).add(new int[]{67184,3952});
		h.get(17).add(new int[]{67218,3954});
		h.get(17).add(new int[]{76823,4519});
		h.get(17).add(new int[]{76891,4523});
		h.get(17).add(new int[]{78132,4596});
		h.get(17).add(new int[]{78523,4619});
		h.get(17).add(new int[]{78591,4623});
		h.get(17).add(new int[]{81532,4796});
		h.get(17).add(new int[]{83572,4916});
		h.get(17).add(new int[]{83657,4921});
		h.get(17).add(new int[]{89437,5261});
		h.get(17).add(new int[]{89471,5263});
		h.get(17).add(new int[]{89641,5273});
		h.get(17).add(new int[]{91426,5378});
		h.get(17).add(new int[]{92837,5461});
		h.get(17).add(new int[]{92871,5463});
		h.get(17).add(new int[]{93126,5478});
		h.put(16, new ArrayList<int[]>());
		h.get(16).add(new int[]{45936,2871});
		h.get(16).add(new int[]{73296,4581});
		h.get(16).add(new int[]{98352,6147});
		h.put(19, new ArrayList<int[]>());
		h.get(19).add(new int[]{51984,2736});
		h.get(19).add(new int[]{81567,4293});
		h.put(18, new ArrayList<int[]>());
		h.get(18).add(new int[]{28674,1593});
		h.put(23, new ArrayList<int[]>());
		h.get(23).add(new int[]{36294,1578});
		h.get(23).add(new int[]{81627,3549});
		h.get(23).add(new int[]{81972,3564});
		h.put(22, new ArrayList<int[]>());
		h.get(22).add(new int[]{51678,2349});
		h.put(24, new ArrayList<int[]>());
		h.get(24).add(new int[]{39528,1647});
		h.get(24).add(new int[]{46872,1953});
		h.put(27, new ArrayList<int[]>());
		h.get(27).add(new int[]{39852,1476});
		h.get(27).add(new int[]{49572,1836});
		h.get(27).add(new int[]{69741,2583});
		h.get(27).add(new int[]{96714,3582});
		h.put(26, new ArrayList<int[]>());
		h.get(26).add(new int[]{42978,1653});
		h.get(26).add(new int[]{56498,2173});
		h.get(26).add(new int[]{61854,2379});
		h.get(26).add(new int[]{67314,2589});
		h.get(26).add(new int[]{67418,2593});
		h.get(26).add(new int[]{76518,2943});
		h.get(26).add(new int[]{82654,3179});
		h.get(26).add(new int[]{89726,3451});
		h.get(26).add(new int[]{92846,3571});
		h.put(29, new ArrayList<int[]>());
		h.get(29).add(new int[]{37584,1296});
		h.get(29).add(new int[]{73689,2541});
		h.put(28, new ArrayList<int[]>());
		h.get(28).add(new int[]{75348,2691});
		h.put(35, new ArrayList<int[]>());
		h.get(35).add(new int[]{48265,1379});
		h.get(35).add(new int[]{63945,1827});
		h.get(35).add(new int[]{64295,1837});
		h.get(35).add(new int[]{74865,2139});
		h.get(35).add(new int[]{93485,2671});
		h.put(32, new ArrayList<int[]>());
		h.get(32).add(new int[]{75168,2349});
		h.put(38, new ArrayList<int[]>());
		h.get(38).add(new int[]{65892,1734});
		h.get(38).add(new int[]{74328,1956});
		h.put(37, new ArrayList<int[]>());
		h.get(37).add(new int[]{65934,1782});
		h.put(43, new ArrayList<int[]>());
		h.get(43).add(new int[]{93654,2178});
		h.put(46, new ArrayList<int[]>());
		h.get(46).add(new int[]{58374,1269});
		h.put(44, new ArrayList<int[]>());
		h.get(44).add(new int[]{58476,1329});
		h.get(44).add(new int[]{59268,1347});
		h.get(44).add(new int[]{67892,1543});
		h.get(44).add(new int[]{69432,1578});
		h.get(44).add(new int[]{95348,2167});
		h.put(53, new ArrayList<int[]>());
		h.get(53).add(new int[]{65879,1243});
		h.get(53).add(new int[]{75896,1432});
		h.get(53).add(new int[]{84376,1592});
		h.get(53).add(new int[]{92538,1746});
		h.put(52, new ArrayList<int[]>());
		h.get(52).add(new int[]{95472,1836});
		h.put(59, new ArrayList<int[]>());
		h.get(59).add(new int[]{73986,1254});
		h.put(62, new ArrayList<int[]>());
		h.get(62).add(new int[]{79546,1283});
		h.get(62).add(new int[]{94736,1528});
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		init();
		StringBuilder sb = new StringBuilder();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for(String linea;(linea = bf.readLine())!=null;){
			int N = Integer.parseInt(linea);
			if(N == 0)break;
			if(h.get(N)==null){
				sb.append("There are no solutions for "+N+".\n");
			}
			else{
				ArrayList<int[]> n = h.get(N);
				for(int i=0;i<n.size();++i){
					String a = n.get(i)[0]+"";
					String b = n.get(i)[1]+"";
					if(a.length()<5)a = "0"+a;
					if(b.length()<5)b= "0"+b;
					sb.append(a +" / "+ b +" = " + N+"\n");
				}
			}
			sb.append("\n");
		}
		System.out.print(new String(sb.substring(0,sb.length()-1)));
		
//		HashMap<Integer, ArrayList<int[]>> h = new HashMap<Integer, ArrayList<int[]>>();
//		int[]m = new int[]{0,1,2,3,4,5,6,7,8,9};
//		int cont = 0;
//		System.out.println(79546 %1283);
//		while(NextPermutation.nextPermutation(m)){
//			int a = Integer.parseInt(m[0]+""+m[1]+""+m[2]+""+m[3]+""+m[4]), b = Integer.parseInt(m[5]+""+m[6]+""+m[7]+""+m[8]+""+m[9]);
//			if(a%b==0){
//				int val = ( a / b );
//				if(h.get(val)==null)
//					h.put(val, new ArrayList<int[]>());
//				h.get(val).add(new int[]{a,b});
//			}
//			cont++;
//		}
//		System.out.println(h.keySet());
//		System.out.println(h.size());
//		for(int x : h.keySet()){
//			System.out.println("h.put("+x+", new ArrayList<int[]>());");
//			ArrayList<int[]> lista = h.get(x);
//			for(int i=0;i<lista.size();++i){
//				System.out.println("h.get("+x+").add(new int[]{"+lista.get(i)[0]+","+lista.get(i)[1]+"});");
//			}
//					
//		}
//		for(int i=0;i<h.get(62).size();++i){
//			System.out.println(h.get(62).get(i)[0]+" - " +h.get(62).get(i)[1] + " mod  " +h.get(62).get(i)[0] %h.get(62).get(i)[1]);
//		}
//		System.out.println(h.get(62).size());
	}

}
