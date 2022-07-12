package game.site.wep.dto;

import java.sql.Date;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import game.site.wep.advice.ErrorCode;

public class Gameboard {
	private int boardnum;
	private String RS;
	private String thumbnail;
	private String companylogo;
	private String setupfile;
	private String kategorie;
	private int likecnt;
	private int dislike;
	private String subject;
	private String content;
	private String removeyn ;
	private String buy;
	private String companyname;
	private int sellcnt;
	private int gcode;
	private int price;
	private	String regidate;
	private Date modidate;
	
	MultipartFile downloadfile;
	MultipartFile logofile;
	MultipartFile thumbnailfile;
	List<MultipartFile> files;


	public Gameboard() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getBoardnum() {
		return boardnum;
	}


	public void setBoardnum(int boardnum) {
		this.boardnum = boardnum;
	}


	public String getRS() {
		return RS;
	}


	public void setRS(String rS) {
		RS = rS;
	}


	public String getThumbnail() {
		return thumbnail;
	}


	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}


	public String getCompanylogo() {
		return companylogo;
	}


	public void setCompanylogo(String companylogo) {
		this.companylogo = companylogo;
	}


	public String getSetupfile() {
		return setupfile;
	}


	public void setSetupfile(String setupfile) {
		this.setupfile = setupfile;
	}


	public String getKategorie() {
		return kategorie;
	}


	public void setKategorie(String kategorie) {
		this.kategorie = kategorie;
	}


	public int getLikecnt() {
		return likecnt;
	}


	public void setLikecnt(int likecnt) {
		this.likecnt = likecnt;
	}


	public int getDislike() {
		return dislike;
	}


	public void setDislike(int dislike) {
		this.dislike = dislike;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getRemoveyn() {
		return removeyn;
	}


	public void setRemoveyn(String removeyn) {
		this.removeyn = removeyn;
	}


	public String getBuy() {
		return buy;
	}


	public void setBuy(String buy) {
		this.buy = buy;
	}


	public String getCompanyname() {
		return companyname;
	}


	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}


	public int getSellcnt() {
		return sellcnt;
	}


	public void setSellcnt(int sellcnt) {
		this.sellcnt = sellcnt;
	}


	public int getGcode() {
		return gcode;
	}


	public void setGcode(int gcode) {
		this.gcode = gcode;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getRegidate() {
		return regidate;
	}


	public void setRegidate(String regidate) {
		this.regidate = regidate;
	}


	public Date getModidate() {
		return modidate;
	}


	public void setModidate(Date modidate) {
		this.modidate = modidate;
	}


	public MultipartFile getDownloadfile() {
		return downloadfile;
	}


	public void setDownloadfile(MultipartFile downloadfile) {
		this.downloadfile = downloadfile;
	}


	public MultipartFile getLogofile() {
		return logofile;
	}


	public void setLogofile(MultipartFile logofile) {
		this.logofile = logofile;
	}


	public MultipartFile getThumbnailfile() {
		return thumbnailfile;
	}


	public void setThumbnailfile(MultipartFile thumbnailfile) {
		this.thumbnailfile = thumbnailfile;
	}


	public List<MultipartFile> getFiles() {
		return files;
	}


	public void setFiles(List<MultipartFile> files) {
		this.files = files;
	}


	@Override
	public String toString() {
		return "Gameboard [boardnum=" + boardnum + ", RS=" + RS + ", thumbnail=" + thumbnail + ", companylogo="
				+ companylogo + ", setupfile=" + setupfile + ", kategorie=" + kategorie + ", likecnt=" + likecnt
				+ ", dislike=" + dislike + ", subject=" + subject + ", content=" + content + ", removeyn=" + removeyn
				+ ", buy=" + buy + ", companyname=" + companyname + ", sellcnt=" + sellcnt + ", gcode=" + gcode
				+ ", price=" + price + ", regidate=" + regidate + ", modidate=" + modidate + ", downloadfile="
				+ downloadfile + ", logofile=" + logofile + ", thumbnailfile=" + thumbnailfile + ", files=" + files
				+ "]";
	}


	public Gameboard(int boardnum, String rS, String thumbnail, String companylogo, String setupfile, String kategorie,
			int likecnt, int dislike, String subject, String content, String removeyn, String buy, String companyname,
			int sellcnt, int gcode, int price, String regidate, Date modidate, MultipartFile downloadfile,
			MultipartFile logofile, MultipartFile thumbnailfile, List<MultipartFile> files) {
		super();
		this.boardnum = boardnum;
		RS = rS;
		this.thumbnail = thumbnail;
		this.companylogo = companylogo;
		this.setupfile = setupfile;
		this.kategorie = kategorie;
		this.likecnt = likecnt;
		this.dislike = dislike;
		this.subject = subject;
		this.content = content;
		this.removeyn = removeyn;
		this.buy = buy;
		this.companyname = companyname;
		this.sellcnt = sellcnt;
		this.gcode = gcode;
		this.price = price;
		this.regidate = regidate;
		this.modidate = modidate;
		this.downloadfile = downloadfile;
		this.logofile = logofile;
		this.thumbnailfile = thumbnailfile;
		this.files = files;
	}


	
}