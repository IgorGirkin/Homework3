public class Main {
    public static void main(String[] args) {
        int machinePerformance=8;
        int twentyMinutes=machinePerformance*20;
        int day=machinePerformance*(24*60);
        int threeDays=machinePerformance*(24*60*3);
        int month=machinePerformance*(24*60*31);
        System.out.println("За двадцать минут машина произвела бутылок "+twentyMinutes +" штук");
        System.out.println("За сутки машина произвела бутылок " +day+" штук");
        System.out.println("За три дня машина произвела бутылок " +threeDays+ "штук");
        System.out.println("За месяц машина произвела бутылок " +month+ "штук");

    }
}