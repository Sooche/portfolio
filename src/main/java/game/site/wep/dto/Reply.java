package game.site.wep.dto;

import java.sql.Date;

public class Reply {
	private int rnum;
	private int boardnum;
	private String userid;
	private String content;
	private int restep;
	private int relevel;
	private Date regidate;
	private Date modidate;
	public Reply() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRnum() {
		return rnum;
	}
	public void setRnum(int rnum) {
		this.rnum = rnum;
	}
	public int getBoardnum() {
		return boardnum;
	}
	public void setBoardnum(int boardnum) {
		this.boardnum = boardnum;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getRestep() {
		return restep;
	}
	public void setRestep(int restep) {
		this.restep = restep;
	}
	public int getRelevel() {
		return relevel;
	}
	public void setRelevel(int relevel) {
		this.relevel = relevel;
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
		return "Reply [rnum=" + rnum + ", boardnum=" + boardnum + ", userid=" + userid + ", content=" + content
				+ ", restep=" + restep + ", relevel=" + relevel + ", regidate=" + regidate + ", modidate=" + modidate
				+ "]";
	}
}
