package game.site.wep.dto;

import java.sql.Date;

public class User {
	private String userid;
	private String passwd;
	private String usernickname;
	private String username;
	private String email;
	private String emailauth;
	private String zipcode;
	private String addrload;
	private String addrdetail;
	private Date regidate;
	private Date modidate;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userid, String passwd, String usernickname, String username, String email, String emailauth,
			String zipcode, String addrload, String addrdetail, Date regidate, Date modidate) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.usernickname = usernickname;
		this.username = username;
		this.email = email;
		this.emailauth = emailauth;
		this.zipcode = zipcode;
		this.addrload = addrload;
		this.addrdetail = addrdetail;
		this.regidate = regidate;
		this.modidate = modidate;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getUsernickname() {
		return usernickname;
	}
	public void setUsernickname(String usernickname) {
		this.usernickname = usernickname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmailauth() {
		return emailauth;
	}
	public void setEmailauth(String emailauth) {
		this.emailauth = emailauth;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddrload() {
		return addrload;
	}
	public void setAddrload(String addrload) {
		this.addrload = addrload;
	}
	public String getAddrdetail() {
		return addrdetail;
	}
	public void setAddrdetail(String addrdetail) {
		this.addrdetail = addrdetail;
	}
	public Date getRegidate() {
		return regidate;
	}
	public void setRegidate(Date regidate) {
		this.regidate = regidate;
	}
	public Date getModidate() {
		return modidate;
	}
	public void setModidate(Date modidate) {
		this.modidate = modidate;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", passwd=" + passwd + ", usernickname=" + usernickname + ", username="
				+ username + ", email=" + email + ", emailauth=" + emailauth + ", zipcode=" + zipcode + ", addrload="
				+ addrload + ", addrdetail=" + addrdetail + ", regidate=" + regidate + ", modidate=" + modidate + "]";
	}
}