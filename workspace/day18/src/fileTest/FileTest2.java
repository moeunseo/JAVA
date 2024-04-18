package fileTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest2 {
	public static void main(String[] args) throws IOException{
//		BufferedWriter bw = new BufferedWriter(new FileWriter("appendTest.txt"));
//		bw.write("창섭이 멋져");
//		bw.write(" 창섭이 잘생김\n");
//		bw.close();
		
		// 파일을 추가 출력 모드로 열어주는 true
		BufferedWriter bw = new BufferedWriter(new FileWriter("appendTest.txt", true));
		bw.write("창섭이 멋져");
		bw.write(" 창섭이 잘생김\n");
		bw.close(); // 항상 닫아줘야함
		
		// 우리가 잘못 만들어준 파일을 삭제!
		File file = new File("appendTest");
		file.delete();
		
		
	}
}

