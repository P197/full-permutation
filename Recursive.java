package ȫ�����㷨;

public class Recursive {
	
	public static void ReCursive(int a[], int n) {
		ReCursive(a, 0, new int[n], new boolean[n]);
	}
	
	private static void ReCursive(int a[], int n, int res[], boolean[] visited) {
		if (n == a.length) {
			// ��������ʡ��
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
