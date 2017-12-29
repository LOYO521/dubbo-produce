package www.wuluyang.UserServiceImpl;

import www.wuluyang.IUserService.UserService;

public class UserServiceImpl implements UserService {

	public String getUserId(Integer id) {
		System.out.println("被客户端消费....id"+id);
		if(id==1){
			return "吴陆阳";
		}
		if(id==2){
			return "郭伟坤";
		}
		if(id==3){
			return "赵楠";
		}
		return "未找到";
	}

}
