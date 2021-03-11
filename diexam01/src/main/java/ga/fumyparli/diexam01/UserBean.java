package ga.fumyparli.diexam01;

public class UserBean {
	private String name;
	private int age;
	private boolean male;

	public UserBean() {
	}

	public UserBean(String name, int age, boolean male) {
		this.name = name;
		this.age = age;
		this.male = male;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the male
	 */
	public boolean isMale() {
		return male;
	}

	/**
	 * @param male the male to set
	 */
	public void setMale(boolean male) {
		this.male = male;
	}

}
