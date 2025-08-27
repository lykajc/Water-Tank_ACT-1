import javax.swing.*;

abstract class WaterTank {
    protected int capacity;
    protected int water_level;

    public WaterTank (int capacity){
        this.capacity = capacity;
        this.water_level = 0;
    }
    public abstract void fill_tank (int liters);
    public abstract void use_water (int liters);
    public abstract String water_status();
}
    class Home_tank extends WaterTank{
    public Home_tank(){
        super(200);
    }

        @Override
        public void fill_tank(int liters) {
        if (water_level + liters > capacity){
            JOptionPane.showMessageDialog(null,
                    "Error!! \n Cannot add " + liters + " liters. Tank can only hold "
                            + (capacity - water_level) + " more liters.");
            water_level = capacity;
        }else{
            water_level += liters;
            JOptionPane.showMessageDialog(null,
                    "Water Added, Tank Current Level: " + water_level + "/" + capacity);
        }
    }

        @Override
        public void use_water(int liters) {
        if (liters > water_level){
            JOptionPane.showMessageDialog(null, "Error!! \n Cannot use " + liters + " liters. Only " +
                    water_level + " liters available.");
        }else{
            water_level -= liters;
            JOptionPane.showMessageDialog
                    (null, "Water is used, The Current Level : " + water_level);
        }
    }

        @Override
        public String water_status() {
        if (water_level == 0) return "The tank is Empty!";
        if (water_level == capacity) return "The tank is Full!";
        return "Tank is in used!";
        }
    }

    class Building_Tank extends WaterTank{
        public Building_Tank(){
            super(1000);
        }

        @Override
        public void fill_tank(int liters) {
            if (water_level + liters > capacity){
                JOptionPane.showMessageDialog(null,
                        "Error!! \n Cannot add " + liters + " liters. Tank can only hold "
                                + (capacity - water_level) + " more liters.");
                water_level = capacity;
            }else{
                water_level += liters;
                JOptionPane.showMessageDialog(null,
                        "Water Added, Tank Current Level: " + water_level + "/" + capacity);
            }
        }

        @Override
        public void use_water(int liters) {
            if (liters > water_level){
                JOptionPane.showMessageDialog(null, "Error!! \n Cannot use " + liters + " liters. Only " +
                        water_level + " liters available.");
            }else{
                water_level -= liters;
                JOptionPane.showMessageDialog
                        (null, "Water is used, The Current Level : " + water_level);
            }
        }

        @Override
        public String water_status() {
            if (water_level == 0) return "The tank is Empty!";
            if (water_level == capacity) return "The tank is Full!";
            return "Tank is used!";

        }
    }




public class WaterTank_1 {
    public static void main (String[] args){
        WaterTank tank;

        String option = JOptionPane.showInputDialog
                ("""
                        Enter type of tank:\s
                        '(1)' Home Tank
                        '(2)' Building Tank\s""");
            if (option.equals("1")) {
                tank = new Home_tank();
            } else {
                tank = new Building_Tank();
            }

            while (true){
                String action = JOptionPane.showInputDialog("""
                        Enter Action :
                        '(1)' Fill tank\s
                        '(2)' Use Water
                        '(3)' Check Tank Status""");
                if (action == null) break;

                switch (action){
                    case "1":
                        int fill = Integer.parseInt(JOptionPane.showInputDialog("Enter how many Liters do you want to fill:"));
                        tank.fill_tank(fill);
                        break;
                    case "2":
                        int use = Integer.parseInt(JOptionPane.showInputDialog("Enter how many Liters do you want to use:"));
                        tank.use_water(use);
                        break;
                    case "3":
                        JOptionPane.showMessageDialog(null, tank.water_status());
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid Input!");
                }

                String status = tank.water_status();
                if(status.contains(" Full ") || status.contains(" Empty ")){
                    JOptionPane.showMessageDialog(null, status + "Program ended....");
                    break;
                }
            }
    }
}
