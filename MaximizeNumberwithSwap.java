class MaximizeNumberwithSwap {

	public static void main(String[] args) {
		MaximizeNumberwithSwap obj = new MaximizeNumberwithSwap();
		int result = obj.maximizeResult(31320);
		System.out.println(result);
	}


	public int maximizeResult(int n) {
		String num = Integer.toString(n);
		for (int i = 0; i < num.length() - 1; i++) {
			char curChar = num.charAt(i);
			char maxChar = curChar;
			int index = i;
			for (int j = i + 1; j < num.length(); j++) {
				char nextChar = num.charAt(j);
				if (nextChar >= maxChar) {
					maxChar = nextChar;
					index = j;
				}
			}
			if (maxChar > curChar) {
				return createNewString(num, i, index);
			}
		}
		return n;
	}

	private int createNewString(String num, int smallIndex, int largeIndex) {
		StringBuilder sb = new StringBuilder();
		sb.append(num.substring(0, smallIndex));
		sb.append(num.charAt(largeIndex));
		sb.append(num.substring(smallIndex + 1, largeIndex));
		sb.append(num.charAt(smallIndex));
		sb.append(num.substring(largeIndex + 1, num.length()));
		return Integer.parseInt(sb.toString());
	}
}
