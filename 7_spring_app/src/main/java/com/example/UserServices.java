package com.example;

public class UserServices {

	private IuserPwd userpwd;
	private IuserDao userdao;
	private IuserEmail useremail;

	public UserServices() {
		System.out.println("UserServices :: constructor");
	}

	public UserServices(IuserPwd userpwd, IuserDao userdao, IuserEmail useremail) {
		super();
		this.userpwd = userpwd;
		this.userdao = userdao;
		this.useremail = useremail;
	}

	public void AccountCreate() {

		userpwd.GeneratePwd();
		userdao.SaveUser();
		useremail.SendEmail();
		System.out.println(" Account Created Successfully !");
	}

}
