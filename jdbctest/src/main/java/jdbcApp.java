import jdbctest.dao.RoleDao;
import jdbctest.dto.Role;

public class jdbcApp {
	public static void main(String[] args) {
		RoleDao dao = new RoleDao();
		Role role = dao.getRole(100);
		System.out.println(role);
	}
}
