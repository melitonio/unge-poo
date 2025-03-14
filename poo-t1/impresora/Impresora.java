package impresora;

public class Impresora {
    public static void main(String[] args) {
        String s = "fantástico";
        char c = 'K';
        boolean b = false;
        double d = 10.7;
        System.out.print("Hola mundo ");
        System.out.println(s);
        System.out.println(d + 6);
        System.out.println(c + 6);
        System.out.println("" + d + 6 + " es " + s);
        System.out.println(b + " or " + true + " vale " + (b || true));
    }
}
