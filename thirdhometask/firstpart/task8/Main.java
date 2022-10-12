package thirdhometask.firstpart.task8;

public class Main {
    public static void main(String[] args) {
        Atm atm1 = new Atm(78.54, 58.46);

        System.out.println("Amount instance Atm: " + Atm.getAtmCounter());

        double rub1 = 165156.26;
        double usd1 = 101.10;
        System.out.println(rub1 + " " + '\u20BD' + " -----> " + atm1.convertRubToUsd(rub1) + " " + '\u0024');
        System.out.println(usd1 + " " + '\u0024' + " -----> " + atm1.convertUsdToRub(usd1) + " " + '\u20BD');
    }
}
