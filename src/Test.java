import strategy.*;

public class Test {

    public static void main(String[] args) {

        // Padrão Strategy

        Comportamento defensivo = new Defensivo();
        Comportamento agressivo = new Agressivo();
        Comportamento normal = new Normal();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
    }
}
