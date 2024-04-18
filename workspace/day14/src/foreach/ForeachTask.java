package foreach;

public class ForeachTask {
	public static void main(String[] args) {
		
		int[][] scores = {{100,80,65},{40,77,30}};
		
		for (int[] is : scores) {
			int sum = 0;
			for (int is2 : is) {
				sum+=is2;
			}
			System.out.println("총점: "+ sum);
			System.out.println("평균: "+ sum/3);
		}	
	}
}
