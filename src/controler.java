public class controler {
    public static void main(String[] args) {
        int nI = 10;
        int lI = 4;
        int lII = 0;
        for (int i = 0; i < nI; i++, lII++) {
            // test för att se om man kunde öka två variabler på en gång.
            if (lII == lI) {
                lII = 0;
            }
            System.out.println(i + "   " + lII);
        }
    }
}
