public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("Bienvenue");
        int resultat = Operation.multiplier(a, b);
        System.out.println("Le résultat de " + a + " * " + b + " = " + resultat);
        System.out.println(a + " - " + b + " = " + Operation.soustraction(a,b));
        System.out.println(a + " + " + b + " = " + Operation.addition(a,b));
<<<<<<< HEAD
<<<<<<< HEAD

        System.out.println("Au revoir");
=======
=======
>>>>>>> division
        double resultatDivision = Operation.divison(a,b);
        if ( resultatDivison != 0 ){
            System.out.println(a + " / " + b + " = " + Operation.division(a,b));
        } else {
            System.out.println("Divsion par 0 impossible")
        }
<<<<<<< HEAD
>>>>>>> division
=======
>>>>>>> division
    }
}
