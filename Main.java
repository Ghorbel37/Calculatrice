public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int resultat = Operation.multiplier(a, b);
        System.out.println("Le résultat de " + a + " * " + b + " = " + resultat);
        System.out.println(a + " - " + b + " = " + Operation.soustraction(a,b));
        System.out.println(a + " + " + b + " = " + Operation.addition(a,b));
    }
}
