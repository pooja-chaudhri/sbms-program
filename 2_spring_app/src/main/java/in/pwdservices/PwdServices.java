package in.pwdservices;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdServices {

	public PwdServices() {
		System.out.println("pwdservices::constructor");

	}

	public String encodepwd(String pwd) {

		Encoder encoder = Base64.getEncoder();

		String encodedPwd = encoder.encodeToString(pwd.getBytes());

		return encodedPwd;
	}

}
