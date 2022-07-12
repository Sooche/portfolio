package game.site.wep.dto;

public class Gamese {
	private String companyid;
	private String companyname;
	private int gcode;
	private String gname;
	private int price;
	public Gamese() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCompanyid() {
		return companyid;
	}
	public void setCompanyid(String companyid) {
		this.companyid = companyid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public int getGcode() {
		return gcode;
	}
	public void setGcode(int gcode) {
		this.gcode = gcode;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Gamese [companyid=" + companyid + ", companyname=" + companyname + ", gcode=" + gcode + ", gname="
				+ gname + ", price=" + price + "]";
	}
	
}
