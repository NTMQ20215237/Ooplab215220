package linh;

public class tst {
	public int tst() {
		int x = 10;
		int sum = 0;
		outer: for (int i = 0; i < x; i++) {
			inner: for (int j = i; j < x; j++) {
				sum++;
				if (j == 1)
					continue;
				if (j == 2)
					continue outer;
				if (i == 3)
					break;
				if (j == 4)
					break outer;
			}
		}
		return sum;
	}
}
