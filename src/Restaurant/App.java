package Restaurant;

import java.util.ArrayList;
public class App {
    public static void main(String[] args) {
        ArrayList<SecurityLevel> levels = DAL.getSecurityLevels();
        ArrayList<Position> positions = DAL.getPositions();
        for (Position p: positions ) {
            System.out.println(p.toString());
        }
        for(SecurityLevel s : levels){
            System.out.println(s.toString());
        }
    }
}
