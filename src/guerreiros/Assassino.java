package guerreiros;

public class Assassino extends Guerreiro {
    private String arma;

    public Assassino(String nome, int nivel, int vida, String arma) {
        super(nome, nivel, vida);
        this.arma = arma;
    }

    @Override
    public void atacar() {
        System.out.println(nome + " desfere um golpe furtivo com " + arma + "!");
    }
}
