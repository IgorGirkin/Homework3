public class Main {
    public static void main(String[] args) {
        int bottles = 16;
        int minutes=2;
        int machinePerformance=bottles/minutes;
        int twentyMinutes=machinePerformance*20;
        int minetdey=24*60;
        int day=machinePerformance*minetdey;
        int threeDays=machinePerformance*minetdey*3;
        int month=machinePerformance*minetdey*31;
        System.out.println("За двадцать минут машина произвела бутылок "+twentyMinutes +" штук");
        System.out.println("За сутки машина произвела бутылок " +day+" штук");
        System.out.println("За три дня машина произвела бутылок " +threeDays+ " штук");
        System.out.println("За месяц машина произвела бутылок " +month+ " штук");

    }
}