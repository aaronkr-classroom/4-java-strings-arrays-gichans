
public class Ex603 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myGrades = new double[] {
				89.1, 95.0, 87.7, 88.3, 100.0
		};
		double sum = 0.0;
		double avg = 0.0;
	
		for (int i = 0; i < myGrades.length; i++) {
			sum += myGrades[i];
		}

		avg = sum / myGrades.length;
		
		System.out.println("합계: " + sum);
		System.out.format("평균: %.2f", avg);

	}

}
