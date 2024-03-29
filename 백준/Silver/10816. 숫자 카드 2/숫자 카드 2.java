import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(st.nextToken());
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int x = Integer.parseInt(st.nextToken());
            if (map.get(x) == null) {
                sb.append("0").append(" ");
            } else {
                sb.append(map.get(x)).append(" ");
            }
        }
        System.out.println(sb);
    }
}
