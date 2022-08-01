package Restaurant;

import java.io.InputStream;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<SecurityLevel> levels = DAL.getSecurityLevels();
        ArrayList<Position> positions = DAL.getPositions();

        for (Position p : positions) {
            System.out.println(p.toString());
        }
        for (SecurityLevel s : levels) {
            System.out.println(s.toString());
        }
        char inputManager = 'a';
        System.out.println("Enter something man:");
        byte[] input = new byte[255];

        try {
            int i = System.in.read(input, 0, input.length);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        String result = new String(input);
        System.out.println(result.trim());

    }
}
