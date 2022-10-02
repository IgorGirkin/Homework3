public class Main {
    public static void main(String[] args) {
        int needReset= 7;
        needReset*=1000;
        int lightWorkout =250;
        int hardWorkout =500;
        System.out.println("Длительность тренеровки для похудяня (лекий режим) - спортсмен теряет "
                +lightWorkout+ " г. в день, составит "+needReset/lightWorkout+" дней.");
        System.out.println("Длительность тренеровки для похудяня (тяжелый режим) - спортсмен теряет "
                +hardWorkout+ " г. в день, составит "+needReset/hardWorkout+" дней.");
        System.out.println("В среднем, чтобы добиться результата похудения потребуется "+
                (needReset/lightWorkout+needReset/hardWorkout)/2+" дней.");
    }
}