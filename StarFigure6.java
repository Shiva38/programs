package capPractice1;

public class StarFigure6 {
    public static final int R = 7;
    
	public static void main(String[] args) {
		for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= (4*R) - 4 * i; j++) {
                System.out.print("/");
            
		}
		for (int j = 1; j <= 8 * i - 8; j++) {
            System.out.print("*");
		}
		for (int j = 1; j <= (4*R) - 4 * i; j++) {
            System.out.print("\\");
	}
		System.out.println();
	}
}
}
