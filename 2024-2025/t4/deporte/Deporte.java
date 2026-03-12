package t4.deporte;

interface Nadador { void nadar(); }
interface Corre { void correr(); }

class Triatleta implements Nadador, Corre {

    @Override
    public void nadar() {
        System.out.println("Nadando…");
    }
    
    @Override
    public void correr() {
        System.out.println("Corriendo…");
    }
    
}

public class Deporte {
    public static void main(String[] args) {
        Triatleta t = new Triatleta();
        t.nadar();
        t.correr();
    }
}
