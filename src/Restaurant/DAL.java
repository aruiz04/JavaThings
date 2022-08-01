package Restaurant;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class DAL {
    public static ArrayList<SecurityLevel> getSecurityLevels() {
        ArrayList<SecurityLevel> levels = new ArrayList<>();
        levels.add(new SecurityLevel(1001, "Admin"));
        levels.add(new SecurityLevel(1002, "Manager"));
        levels.add(new SecurityLevel(1003, "Reports Only"));
        levels.add(new SecurityLevel(1004, "Staff Manager"));
        return levels;
    }

    public static ArrayList<Position> getPositions() {
        ArrayList<Position> positions = new ArrayList<>();
        positions.add(new Position(101, "Server", 16.50));
        positions.add(new Position(102, "Line Cook", 22.50));
        positions.add(new Position(103, "Busboy", 17.50));
        positions.add(new Position(104, "Prep Cook", 28.75));
        positions.add(new Position(105, "Barista", 17.25));
        positions.add(new Position(106, "Cashier", 17.50));
        positions.add(new Position(107, "Manager", 25.50));
        positions.add(new Position(108, "Kitchen Manager", 23.50));

        return positions;
    }

    public static Employee generateEmployee() {
        SecurityLevel level = getSecurityLevels().get(3);
        Calendar calendar = Calendar.getInstance();
        calendar.set(1991, Calendar.JANUARY, 1);
        Date date = calendar.getTime();

        return new Employee(10, "Armando", "Ruiz", "", level, date, true, "No Memo");
    }
}
