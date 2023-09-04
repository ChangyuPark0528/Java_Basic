package oop.inter.good;

public class Join implements IUserService {

	@Override
	public void execute() {
		System.out.println("회원가입 로직이 실행됩니다.");
		System.out.println("DB접속, 입력값, 값을 집어넣고 등등등..");

	}

}
