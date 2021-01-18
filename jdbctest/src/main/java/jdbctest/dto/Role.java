package jdbctest.dto;

public class Role {
	private Integer roleId;
	private String description;

	public Role() {

	}

	public Role(int roleId, String description) {
		super();
		this.roleId = roleId;
		this.description = description;
	}

	/**
	 * @return the roleId
	 */
	public Integer getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return the description
	 */
	public String getDiscription() {
		return description;
	}

	/**
	 * @param discription the description to set
	 */
	public void setDiscription(String discription) {
		this.description = discription;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", discription=" + description + "]";
	}

}
