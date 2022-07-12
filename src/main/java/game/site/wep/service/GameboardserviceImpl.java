package game.site.wep.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import game.site.wep.advice.ErrorCode;
import game.site.wep.dto.GameFile;
import game.site.wep.dto.Gameboard;
import game.site.wep.dto.Page;
import game.site.wep.dto.Trade;
import game.site.wep.repository.GameFilerepository;
import game.site.wep.repository.Gameboardrepository;

@Service
public class GameboardserviceImpl implements Gameboardservice{

	@Autowired
	private Gameboardrepository gameboardrepository;
	@Autowired
	private GameFilerepository gameFilerepository;
	@Autowired
	private FileService fileService;
	@Autowired
	private HttpSession sesstion;
	
	@Transactional
	@Override
	public ErrorCode insert(Gameboard gameboard) throws Exception {
		
		
		//섬네일 저장
	MultipartFile thumbnail = gameboard.getThumbnailfile();
	String thumbfile= fileService.fileUpload(thumbnail);
	gameboard.setThumbnail(thumbfile);
		//회사 로고저장
	MultipartFile logo = gameboard.getLogofile();
	String logofile= fileService.fileUpload(logo);
	gameboard.setCompanylogo(logofile);
		//다운로드 파일 저장
	MultipartFile download = gameboard.getDownloadfile();
	String setupfile = fileService.fileUpload(download);
	gameboard.setSetupfile(setupfile);
	
	//게시물 추가
	gameboardrepository.insert(gameboard);


	
	//게시물 파일들 업로드 후 저장
	GameFileSave(gameboard);
		
		return ErrorCode.SUCCESS_ADD;
	}
	
	


	@Override
	public List<Gameboard> selectList(Page page) {
		//페이징 처리
				int curPage = page.getCurPage(); //현재페이지
				int perPage = page.getPerPage(); //한페이지당 게시물수
				int perBlock = page.getPerBlock(); //페이지 블럭의 수
				
				//1)게시물의 시작번호
				int startNum = (curPage-1) * perPage ;
				//2)게시물의 끝번호
				int endNum = startNum + perPage -1;
				
				//3)전체페이지수
				int totalCnt = gameboardrepository.selectTotalCnt(page); //전체게시물수
				int totPage = totalCnt/perPage;
				if (totalCnt%perPage!=0) totPage++; //나머지가 있으면 +1
				
				//4)페이지블럭의 시작페이지
				int startPage= curPage - ((curPage-1)%perBlock);
				//5)페이지블럭의 끝페이지
				int endPage = startPage + perBlock - 1;
				if (endPage>totPage) endPage=totPage; //endPage는 totPage보다 작거나 같아야 한다

				
				//page 세팅
				page.setStartNum(startNum);
				page.setEndNum(endNum);
				page.setStartPage(startPage);
				page.setEndPage(endPage);
				page.setTotPage(totPage);
		
		
		
		return gameboardrepository.selectList(page);
	}
	
	
	
	//게시물 파일들 저장
	private void GameFileSave(Gameboard gameboard) throws Exception {
		List<MultipartFile>files = gameboard.getFiles();
		for(MultipartFile file:files) {
			String filename = fileService.fileUpload(file); //파일저장
			if(filename.equals(""))continue; //파일이름이 공백일경우 저장하지 않는다
			
			//게시물파일db에 저장
			GameFile gamefile = new GameFile();
			gamefile.setBoardnum(gameboard.getBoardnum()); //게시물의 boardnum세팅
			gamefile.setFilename(filename);
			gameFilerepository.insert(gamefile);
			
			
		}
	}




	@Override
	public Gameboard selectOne(int boardnum) {
		
		return gameboardrepository.selectOne(boardnum);
	}




	@Override
	public int gamebuy(Trade trade) {
		
		
		return gameboardrepository.gamebuy(trade);
	}




	@Override
	public int tradelog(Trade trade) {
		
		
		return gameboardrepository.tradelog(trade);
	}




	@Override
	public int sellcnt(int boardnum) {
		
		return gameboardrepository.sellcnt(boardnum);
	}

}
