package game.site.wep.dto;

public class Trade {
	private int tradenum ;
	private String userid;
	private int boardnum;
	private String subject;
	private String thumbnail;
	private String payment;
	public Trade() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Trade [tradenum=" + tradenum + ", userid=" + userid + ", boardnum=" + boardnum + ", subject=" + subject
				+ ", thumbnail=" + thumbnail + ", payment=" + payment + "]";
	}
	public int getTradenum() {
		return tradenum;
	}
	public void setTradenum(int tradenum) {
		this.tradenum = tradenum;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getBoardnum() {
		return boardnum;
	}
	public void setBoardnum(int boardnum) {
		this.boardnum = boardnum;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public Trade(int tradenum, String userid, int boardnum, String subject, String thumbnail, String payment) {
		super();
		this.tradenum = tradenum;
		this.userid = userid;
		this.boardnum = boardnum;
		this.subject = subject;
		this.thumbnail = thumbnail;
		this.payment = payment;
	}
}