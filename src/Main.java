public class Main {
    public static void main(String[] args) {
        byte allPaint = 120;
        byte white=2;
        byte brown=4;
        int totalPremises=allPaint/(brown+white);
        int allWhite=totalPremises*white;
        int allBrown=totalPremises*brown;
        System.out.println("В школе, где "+totalPremises+ " классов, нужно "+allWhite+" банок белой краски" +
                " и "+allBrown+" банок коричневой краски.");

    }
}