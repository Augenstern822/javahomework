import java.util.Scanner;

public class homework_82 {
	
	 
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			System.out.println("��������һ��4��4�ľ���");
			double[][] m=new double[4][4];
			for(int row=0; row<m.length; row++) {
				for(int column=0; column<m[row].length; column++) {
					m[row][column]=input.nextDouble();
				}
			}
			input.close();
			System.out.println("���Խ�������Ԫ��֮��Ϊ��"
					+sumMajorDiagonal(m));  
		}
		
		public static double sumMajorDiagonal(double[][] m) {
			double sum=0;
			
			for(int row=0; row<m.length; row++) {
				sum += m[row][row];
			}
			return sum;	
		}
}
