package level2;

public class UniqueSum {
	public int sum(int val1, int val2, int val3) {
		int result=0;
		boolean[] fail= {false,false,false};
		if (val1==val2) {
			fail[0]=true;
			fail[1]=true;
		}
		if (val2==val3) {
			fail[1]=true;
			fail[2]=true;
		}
		if (val3==val1) {
			fail[0]=true;
			fail[2]=true;
		}
		if (!fail[0])
			result+=val1;
		if (!fail[1])
			result+=val2;
		if (!fail[2])
			result+=val3;
		return(result);
	}
}
