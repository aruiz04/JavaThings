package Restaurant;

import java.util.ArrayList;

public class DAL {
    public  static ArrayList<SecurityLevel> getSecurityLevels(){
        ArrayList<SecurityLevel>levels = new ArrayList<>();
        levels.add(new SecurityLevel(1, "Admin"));
        levels.add(new SecurityLevel(2, "Manager"));
        levels.add(new SecurityLevel(3, "Reports Only"));
        levels.add(new SecurityLevel(4, "Staff Manager"));
        return  levels;
    }
    public  static  ArrayList<Position>getPositions(){
        ArrayList<Position>positions = new ArrayList<>();
        positions.add(new Position(1,"Server", 16.50));
        positions.add(new Position(2, "Line Cook", 22.50));
        positions.add(new Position(3,"Busboy" , 17.50));
        positions.add(new Position(4,"Prep Cook", 28.75));
        positions.add(new Position(5,"Barista", 17.25));
        positions.add(new Position(6,"Cashier", 17.50));
        positions.add(new Position(7, "Manager", 25.50));
        positions.add(new Position(8,"Kitchen Manager", 23.50));

        return positions;
    }
}
