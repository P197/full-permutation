package 全排列算法;

public class Recursive {
	
	public static void ReCursive(int a[], int n) {
		ReCursive(a, 0, new int[n], new boolean[n]);
	}
	
	private static void ReCursive(int a[], int n, int res[], boolean[] visited) {
		if (n == a.length) {
			// 输出结果，省略
			return;
		}
		for (int i = 0; i < a.length; i++) {
			if (!visited[i]) {
				visited[i] = true;
				res[n] = i;
				ReCursive(a, n + 1, res, visited);
				res[n] = 0;
				visited[i] = false;
			}
		}
	}
}
