package www.wuluyang.UserServiceImpl;

import www.wuluyang.IUserService.UserService;

public class UserServiceImpl implements UserService {

	public String getUserId(Integer id) {
		System.out.println("���ͻ�������....id"+id);
		if(id==1){
			return "��½��";
		}
		if(id==2){
			return "��ΰ��";
		}
		if(id==3){
			return "���";
		}
		return "δ�ҵ�";
	}

}
