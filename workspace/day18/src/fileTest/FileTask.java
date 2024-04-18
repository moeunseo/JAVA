package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FileTask {
	public static void main(String[] args) throws IOException {

		List<String> foods = Arrays.asList("야채곱창", "김치볶음밥", "피자", "뿌링클");
		File file = new File("foods.txt");

		// 리스트에 있는 값들을 해당 파일에 저장하고 콘솔창에 출력해보기
		// 저장할 때에는 값 하나당 엔터로 구분
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(file, true));
			for (String food : foods) {
				// 수정
				if (food.equals("피자")) {
					bw.write("페퍼로니 피자");
				} else {
					bw.write(food);
				}

				// 삭제
				if (food.equals("야채곱창")) {

				}
				bw.write("\n");
			}
			bw.close();
		} catch (FileNotFoundException e) {
			System.out.println("해당 경로가 존재하지 않습니다.");
		}

		// 수정
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			String temp = "", line = null;

			while ((line = br.readLine()) != null) {
				if (line.equals("피자")) {
					temp += "페퍼로니 피자";
					continue;
				}
				temp += line + '\n';
			}
			br.close();

			BufferedWriter bw2 = new BufferedWriter(new FileWriter(file));
			bw2.write(temp);
			bw2.close();
		} catch (FileNotFoundException e) {
			System.out.println("해당 경로가 존재하지 않습니다.");
		}

		// 삭제 (잡채 삭제)
		BufferedReader br2;
		try {
			br2 = new BufferedReader(new FileReader(file));
			String temp = "", line = null;

			while ((line = br2.readLine()) != null) {
				if (line.equals("야채곱창")) {
					continue;
				}
				temp += line + '\n';
			}
			br2.close();

			BufferedWriter bw2 = new BufferedWriter(new FileWriter(file));
			bw2.write(temp);
			bw2.close();
		} catch (FileNotFoundException e) {
			System.out.println("해당 경로가 존재하지 않습니다.");
		}

//		BufferedReader br;
//		try {
//			br = new BufferedReader(new FileReader(file));
//			String line = null;
//			while((line = br.readLine()) !=null) {
//				System.out.println(line);
//			}
//			br.close();		
//		} catch (FileNotFoundException e) {
//			System.out.println("해당 경로가 존재하지 않습니다.");
//		}	
	}
}
