package ch05;

public class Users {
	int id;
	String name;
	String username;
	String email;
	Address address;
	String phone;
	String website;
	Company company;

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", address="
				+ address + ", phone=" + phone + ", website=" + website + ", company=" + company + "]";
	}

}
