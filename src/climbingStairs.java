public class climbingStairs {
	public static int countPath(int n, int[] qb) {
		if (n == 0) {
			return 1;
		} else if (n < 0) {
			return 0;
		}
		if (qb[n] != 0) {
			return qb[n];
		}
		int path1 = countPath(n - 1, qb);
		int path2 = countPath(n - 2, qb);
		int path3 = countPath(n - 3, qb);
		int res = path1 + path2 + path3;
		qb[n] = res;
		return res;
	}

		public static int countPathTab(int n) {
			int[] dp = new int[n + 1];
			dp[0] = 1;
			for (int i = 1; i <= n; i++) {
				if (i == 1) {
					dp[i] = dp[i - 1];
				} else if (i == 2) {
					dp[i] = dp[i - 1] + dp[i - 2];
				} else {
					dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
				}
	
			}
	
			return dp[n];
		}
	
		public static void main(String[] args) {
			System.out.println(countPath(10, new int[10 + 1]));
			System.out.println("using tabulation " + countPathTab(10));
		}
	}
