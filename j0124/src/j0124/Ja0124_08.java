package j0124;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ja0124_08 {

	public static void main(String[] args) {

		// FileOutputStream : 글 저장
		try {
			// 폴더 확인 및 생성
			String folder = "c:/save4";
			File f = new File(folder);
			if(!f.exists()) {
				f.mkdir();  // 폴더 생성
				System.out.println("폴더가 생성 되었습니다.");
			}
			// 파일 생성
			File file = new File(folder+"/ccc.txt");
			if(!file.exists()) {
				file.createNewFile();
				System.out.println("파일이 생성 되었습니다.");
			}
			// 글 저장 
			FileOutputStream fos = new FileOutputStream(folder+"/ccc.txt");
			String str = "1,hong홍,100,100,100,300,100.0,0\r\n";
			str += "2,you유,90,90,90,270,90.0,0\r\n";
			// String -> byte 단위로 분리를 해야함.
			byte[] bytes = str.getBytes();  // byte 단위로 분리
			for(byte b:bytes) {
				fos.write(b);
			}
			fos.close();
		} catch (Exception e) {e.printStackTrace();}
		
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		// FileInputStream
//		try {
//			FileInputStream fis = new FileInputStream("c:/save/bbb.txt");
//			int read = 0;
//			while((read = fis.read()) != -1) {
//				System.out.print((char)read);
//			}
//			fis.close();
//		} catch (Exception e) {e.printStackTrace();}

//		System.out.println("프로그램 종료");
				
				
				
				
				
				
				
				
				
				
				
	}

}
