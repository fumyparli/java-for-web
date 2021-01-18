import java.util.ArrayList;
import java.util.List;

import jdbctest.dao.RoleDao;
import jdbctest.dto.Role;

public class jdbcApp {
	public static void main(String[] args) {
		int roleId = 1000;
		String description = "CTO";
		Role role = new Role(roleId, description);
		RoleDao dao = new RoleDao();

		int insertCount = dao.addRole(role);
		System.out.println(insertCount);

		role = dao.getRole(roleId);
		System.out.println(role);

		role.setRoleId(roleId);
		role.setDescription("CEO");
		int updateCount = dao.updateRole(role);
		System.out.println(updateCount);

		role = dao.getRole(roleId);
		System.out.println(role);

		int deleteCount = dao.deleteRole(roleId);
		System.out.println("deleted: " + roleId + " " + role);

		List<Role> list = new ArrayList<>();
		list = dao.getRoles();
		System.out.println(list);
	}
}
