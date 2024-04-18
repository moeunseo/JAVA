package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException{

		// 외부에서 파일 입출력에 대한 예외처리를 진행해줘야 한다.
//		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
//		bw.write("창 섭 이");
//		bw.newLine(); // 엔터를 때려라! 메모장에서 커서위치가 창섭이 밑에 존재
//		bw.close(); // 통로를 닫음, 버퍼를 비우는 기능도 함께 존재
		
		// 입력 테스트
//		File file = new File("test.txt");
//		BufferedReader br = new BufferedReader(new FileReader(file));
		
		
		// 해당 폴더에 저장된 파일이 없다면 try-catch로 묶어서 하기
		File file = new File("test1.txt");
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = br.readLine()) !=null) {
				System.out.println(line);
			}
			br.close();		
		} catch (FileNotFoundException e) {
			System.out.println("해당 경로가 존재하지 않습니다.");
		}
		
//		System.out.println(br.readLine());
//		System.out.println(br.readLine()); // null이 나왔다면 파일에 더 이상 추가된 줄이 없다는 것
		
		// 파일에 있는 모든 텍스트를 출력해보자
//		String line = null;
//		while((line = br.readLine()) !=null) {
//			System.out.println(line);
//		}
//		br.close();
//		
		
		
	}
}
