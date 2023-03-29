import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// 입출력에 사용할 객체
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트케이스 개수
        int T = Integer.parseInt(br.readLine());

        // 테스트케이스 개수만큼 반복
        for (int t = 0; t < T; t++) {

            // 건물개수, 건물건설규칙 정보 받아오기
            String[] info = br.readLine().split(" ");
            int N = Integer.parseInt(info[0]);
            int K = Integer.parseInt(info[1]);

            // 건물을 건설하는데 걸리는 누적 시간을 저장할 배열
            int[] result = new int[N + 1];

            // 각각의 건물을 건설하는데 걸리는 시간을 저장할 배열
            int[] buildTime = new int[N + 1];

            // 위상정렬을 사용하기 위해 진입차수를 저장할 배열
            int[] degree = new int[N + 1];

            // 건물의 건설규칙을 저장할 2차원 리스트
            ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

            // 2차원 리스트 초기화
            for (int i = 0; i < N + 1; i++) {
                graph.add(new ArrayList<Integer>());
            }

            // 건물 별 건설에 걸리는 시간 정보 받기
            String[] info2 = br.readLine().split(" ");

            for (int i = 0; i < info2.length; i++) {
                // 건물 건설에 걸리는 시간 저장
                buildTime[i + 1] = Integer.parseInt(info2[i]);
                // 건물 건설에 걸리는 누적시간 저장 (초기값은 위와 동일함)
                result[i + 1] = Integer.parseInt(info2[i]);
            }

            // 건물 건설규칙 정보 받기
            for (int i = 0; i < K; i++) {
                String[] temp = br.readLine().split(" ");
                int X = Integer.parseInt(temp[0]);
                int Y = Integer.parseInt(temp[1]);
                // 2차원 리스트에 건설규칙 저장
                graph.get(X).add(Y);
                // 진입차수 테이블에 진입차수 저장
                degree[Y]++;
            }

            // 승리하기 위해 건설해야할 건물 번호
           int W = Integer.parseInt(br.readLine());

            // 위상정렬에 사용할 큐
            Queue<Integer> q = new LinkedList<>();

            // 진입차수가 0인 건물번호를 큐에 넣어줍니다.
            for (int i = 1; i < degree.length; i++) {
                if (degree[i] == 0) {
                    q.offer(i);
                }
            }

            // 큐가 빌 때까지 반복
            while (!q.isEmpty()) {
                // 큐에서 건물번호를 꺼내줍니다.
                int now = q.poll();
                // 꺼낸 건물번호의 건설규칙을 가져옴
                ArrayList<Integer> list = graph.get(now);

                // 건설규칙 개수만큼 반복
                for (int i = 0; i < list.size(); i++) {
                    // 건설규칙에 따라 해당건물 다음에 지을 수 있는 건물번호 가져옴
                    int next = list.get(i);
                    // 진입차수 갱신
                    degree[next]--;
                    // 진입차수가 갱신된 건물의 차수가 0이면 큐에 번호를 넣기
                    if (degree[next] == 0) {
                        q.offer(next);
                    }
                    // 차수가 갱신된 건물을 짓는데 걸리는 시간 계산
                    int bt = buildTime[next] + result[now];
                    // 위에서 계산한 값과 기존에 가지고 있는 값중 큰값을 누적 값에 저장
                    // 왜냐하면 선후관계에 따라 앞 건물이 모두 건설되어야만 건설이 가능하기 떄문
                    result[next] = Math.max(bt, result[next]);
                }
            }

            // 승리하기 위한 건물을 건설하는필요한 누적건설 값 버퍼 저장
            bw.write(String.valueOf(result[W]));
            bw.newLine();
        }

        // 출력
        bw.flush();
	}
}
