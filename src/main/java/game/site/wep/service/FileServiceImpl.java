package game.site.wep.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import game.site.wep.repository.GameFilerepository;

@Service
public class FileServiceImpl implements FileService{
	@Value("${file.savedir}")
	private String savedir;
	
	@Override
	public String fileUpload(MultipartFile file) throws Exception {
		//파일을 업로드 하고 파일명을 리턴
		String originFileName =file.getOriginalFilename();
		if(originFileName.equals(""))return ""; //파일 이름이 없다면
		//파일이름이 겹치지 않도록 시스템날짜를 붙이기
		String filename= System.currentTimeMillis()+ "_" + originFileName;
		
		//오늘 날짜 구하기
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
		String today=sf.format(new Date());
		
		//저장할 디렉토리
		String savedirToday = savedir;
		if(!new File(savedirToday).isDirectory()) {
			Files.createDirectory(Paths.get(savedirToday));
		}
		//파일을 전송
		file.transferTo(new File(savedirToday,filename));
		
		return filename;
	}

	@Override
	public void fileDelete(String filename) {
		
		
		
	}
	@Override
	public void fileDownload(String setupfile,HttpServletResponse res) throws Exception {
	//파일 다운로드	
		String fileUrl = savedir + "/" + setupfile;
		//파일 읽기 스트림
		FileInputStream fis =new FileInputStream(fileUrl);
		
		//파일이름 인코딩
		setupfile = URLEncoder.encode(setupfile,"utf-8");
		
		//첨부파일로 파일 전송
		res.setHeader("Content-Dispnsition", "attachment;setupfile="+setupfile);
		
		//파일 내보내기 스트림 생성
		OutputStream out = res.getOutputStream();
		
		
		FileCopyUtils.copy(fis,out);//input stream에서 읽어서 out stream 으로 보내기
		
		
	}
		
	
}
