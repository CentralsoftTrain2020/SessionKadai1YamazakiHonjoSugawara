package bean;

public class LoginBean {
	private String id;
	private String pass;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "LoginBean [id=" + id + ", pass=" + pass + "]";
	}

}
