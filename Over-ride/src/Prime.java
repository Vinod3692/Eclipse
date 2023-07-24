
public class Prime {
	static int pri(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return 0;
			}
		}
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<10;i++) {
			int res=pri(i);
			if(res!=0) {
				System.out.println(res);
			}
		}

	}

}
