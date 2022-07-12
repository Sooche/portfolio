package game.site.wep.service;

import javax.mail.Multipart;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

//공통모듈 : 파일처리
public interface FileService {
	String fileUpload(MultipartFile file) throws Exception;
	
	//파일 삭제
	void fileDelete(String filename);
	
	void fileDownload(String setupfile,HttpServletResponse res) throws Exception;
}
