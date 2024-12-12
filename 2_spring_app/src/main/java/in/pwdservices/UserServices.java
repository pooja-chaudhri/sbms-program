package in.pwdservices;

public class UserServices {

	private PwdServices pwdservices;
	
	public UserServices() {
		System.out.println("pwdservices::constructor");
	}
	
	public void setPwdServices(PwdServices pwdservices) {
		
		System.out.println("setPwdServices() -- called..");
		this.pwdservices = pwdservices;
		
	}
	public void savdUser(String name, String pwd, long phone) {
		
		String encodepwd = pwdservices.encodepwd(pwd);
		
		System.out.println("Encode pwd ::"+encodepwd);
		
		System.out.println("Record inserted into DB ...");
	}
}
