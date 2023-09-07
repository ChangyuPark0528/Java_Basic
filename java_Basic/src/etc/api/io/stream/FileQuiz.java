package etc.api.io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileQuiz {

	public static void main(String[] args) {
		
		/*
        1. 스캐너를 통해서 파일명을 정확히 입력받습니다.
        
        2. mywork폴더에 해당 파일이 존재한다면 해당 파일을 
        upload폴더로 복사하세요.(upload 폴더는 없습니다.)
        파일이 존재하지 않는다면 "파일명이 없습니다." 예외구문을 출력하세요.
        
        3. 복사 도중에 에러가 발생하면 "파일 처리 중 예외 발생!" 구문을 출력.
        */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("파일명을 적어주세요: ");
		String fileName = sc.next();
		
		
		FileOutputStream fos = null;
		
		
		
		try {
			fos = new FileOutputStream("C:\\mywork" + fileName + ".txt");
			System.out.println("파일이 정상적으로 저장되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		FileInputStream oldFile = null;
		FileOutputStream newFile = null;
		
		try {
			oldFile = new FileInputStream("C:/mywork");
			newFile = new FileOutputStream("C:/mywork/upload");
			
			byte[] arr = new byte[100];
			
			while(true) {
				//읽어들인 데이터가 있다면 읽은 데이터 길이 반환, 없다면 -1을 반환.
				int result = oldFile.read(arr);
				if(result == -1) break;
				
				//바이트 단위로 0부터 읽은 크기까지의 파일을 작성.
				newFile.write(arr, 0, result);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oldFile.close();
				newFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

		File file = new File("C:/mywork/upload");
		
		if(!file.exists()) {
			file.mkdir();
			System.out.println("폴더 생성 완료!");
		}else {
			System.out.println("해당폴더가 존재합니다.");
		}
	}

}
