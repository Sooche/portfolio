package game.site.wep.dto;

public class GameFile {
	private int gfnum;
	private String filename;
	private int boardnum;
	public GameFile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GameFile(int gfnum, String filename, int boardnum) {
		super();
		this.gfnum = gfnum;
		this.filename = filename;
		this.boardnum = boardnum;
	}
	public int getGfnum() {
		return gfnum;
	}
	public void setGfnum(int gfnum) {
		this.gfnum = gfnum;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public int getBoardnum() {
		return boardnum;
	}
	public void setBoardnum(int boardnum) {
		this.boardnum = boardnum;
	}
	@Override
	public String toString() {
		return "GameFile [gfnum=" + gfnum + ", filename=" + filename + ", boardnum=" + boardnum + "]";
	}
	
}
