package capPractice1;


public class DollarFigure {
    public static void main(String[] args) {
        for(int i = 1; i <= 7; i++) {
            for(int j = 0; j < 2 * i - 2; j++)
                System.out.print("*");
                
            for(int j = 0; j < -i + 8; j++)
                System.out.print("$");
                
            for(int j = 0; j < -2 * i + 16; j++)
                System.out.print("*");
                
            for(int j = 0; j < -i + 8; j++)
                System.out.print("$");
                
            for(int j = 0; j < 2 * i - 2; j++)
                System.out.print("*");
                
            System.out.println();
        }
    }
}
