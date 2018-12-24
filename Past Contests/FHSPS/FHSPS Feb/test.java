import java.util.*;
import java.io.*;
import java.math.*;
public class test {
    public static int start, end, total, max2;
    public static ArrayList<Integer>[] adjacency;
    public static int[] arr = {0, 5, 10, 20, 30, 40};
    public static boolean killAll = false;
    public static void main(String[] args) throws IOException{
        FastScanner kb = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        int kase = kb.nextInt();
        for(int kk = 1; kk <= kase; kk++){
            int numCities = kb.nextInt(); int numConnections = kb.nextInt(); int numGoals = kb.nextInt();
            adjacency = new ArrayList[numCities];
            for(int i = 0; i < numCities; i++) adjacency[i] = new ArrayList<Integer>();
            for(int i = 0; i < numConnections; i++){
                int a = kb.nextInt()-1; int b = kb.nextInt()-1;
                adjacency[a].add(b); adjacency[b].add(a);
            }
            total = 0;
            for(int i = 0; i < numGoals; i++){
                start = kb.nextInt()-1; end = kb.nextInt()-1;
                recurse1(new boolean[numCities], start, true, false);
            }
            System.out.println(total);
            out.println(arr[Math.min(total, 5)]);
        }
    }
    public static void recurse1(boolean[] seen, int curr, boolean begin, boolean e){
        if(killAll) return;
        if(curr == start && !begin && e){
            total++; killAll = true;
            return;
        }
        seen[curr] = true;
        for(int i = 0; i < adjacency[curr].size(); i++)
            if(!seen[adjacency[curr].get(i)] || adjacency[curr].get(i) == start){
                int x = adjacency[curr].get(i);
                if(x == end) e = true;
                recurse1(seen, x, false, e);
                e = false;
                if(killAll) return;
            }
        seen[curr] = false;
    }
    static class FastScanner{
        BufferedReader br;
        StringTokenizer st;
        public FastScanner(InputStream i){
            br = new BufferedReader(new InputStreamReader(i));
            st = new StringTokenizer("");
        }
        public String next() throws IOException{
            if(st.hasMoreTokens()) return st.nextToken();
            else st = new StringTokenizer(br.readLine());
            return next();
        }
        public int nextInt() throws IOException{ return Integer.parseInt(next()); }
        public long nextLong() throws IOException{ return Long.parseLong(next()); }
        public double nextDouble() throws IOException{ return Double.parseDouble(next()); }
        public String nextLine() throws IOException{
            if(!st.hasMoreTokens()) return br.readLine();
            String ret = st.nextToken();
            while(st.hasMoreTokens()) ret += " " + st.nextToken();
            return ret;
        }
    }
}