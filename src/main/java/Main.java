public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("Bienvenue");
        int resultat = Operation.multiplier(a, b);
        System.out.println("Le résultat de " + a + " * " + b + " = " + resultat);
        System.out.println(a + " - " + b + " = " + Operation.soustraction(a,b));
        System.out.println(a + " + " + b + " = " + Operation.addition(a,b));

        System.out.println("Au revoir");
        double resultatDivision = Operation.division(a,b);
        if ( resultatDivision != 0 ){
            System.out.println(a + " / " + b + " = " + Operation.division(a,b));
        } else {
            System.out.println("Divsion par 0 impossible");
        }
        System.out.println("Au revoir");
        System.out.println("Bonsoir");
    }
}
