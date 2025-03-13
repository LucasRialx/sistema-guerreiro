package guerreiros;

public class Mago extends Guerreiro {
    private String elemento;

    public Mago(String nome, int nivel, int vida, String elemento) {
        super(nome, nivel, vida);
        this.elemento = elemento;
    }

    @Override
    public void atacar() {
        System.out.println(nome + " conjura uma magia de " + elemento + "!");
    }
}
