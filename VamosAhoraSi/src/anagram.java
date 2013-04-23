import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		TreeMap<String, Set<String>> tree = new TreeMap<String, Set<String>>();
		for (String ln; (ln = in.readLine()) != null;) {
			char[] m = ln.toCharArray();
			Arrays.sort(m);
			String x = new String(m);
			if (!tree.containsKey(x))
				tree.put(x, new TreeSet<String>());
			tree.get(x).add(ln);
		}
		int[][] m = new int[tree.size()][2];
		final String[] k = new String[tree.size()];
		int pos = 0;
		for (String x : tree.keySet()) {
			k[pos] = x;
			m[pos][1] = pos;
			m[pos++][0] = tree.get(x).size();
		}
		Arrays.sort(m, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0] == 0 ? k[o1[1]].compareTo(k[o2[1]])
						: o1[0] - o2[0];
			}
		});

		String[] aux = new String[tree.size()];
		pos = 0;
		for (String xx : tree.keySet()) {
			aux[pos++] = tree.get(xx).iterator().next();
		}

		Arrays.sort(aux);
		System.out.println(tree);
		for (int i = m.length - 1, j = 0; i >= 0 && j < 5; --i, j++) {
			sb.append("Group of size " + m[i][0] + ": ");
			Set<String> x = tree.get(k[m[i][1]]);
			int si = x.size();
			for (String xx : x) {
				sb.append(xx + ((si - 1 == 0) ? "" : " "));
			}
			sb.append("\n");
		}
		System.out.print(new String(sb));
	}

}
