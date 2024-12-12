
public final class DateUtil  {

	private static DateUtil instance;
	
	private DateUtil() {
		System.out.println("DateUtil :: constructor");
	}
	
	public static DateUtil getinstance() {
		
		if(instance == null) {
			instance  = new DateUtil();
		}
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
