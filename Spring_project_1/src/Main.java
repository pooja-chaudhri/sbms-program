
public class Main {

	public static void main(String[] args) {

		DateUtil du1 = DateUtil.getinstance();
		DateUtil du2 = DateUtil.getinstance();
		DateUtil du3 = DateUtil.getinstance();
		
		//DateUtil cdu = (DateUtil)du3.clone();
		
		System.out.println(du1.hashCode());
		System.out.println(du2.hashCode());
		System.out.println(du3.hashCode());
	}

}
