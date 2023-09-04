package oop.inter.good;

public class Delete implements IUserService {

	@Override
	public void execute() {
		System.out.println("사용자 아이디를 받아서 데이터베이스에서 찾아 삭제 조치");
	}

}
