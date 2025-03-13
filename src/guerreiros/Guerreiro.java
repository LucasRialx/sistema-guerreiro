package guerreiros;

public abstract class Guerreiro {
    protected String nome;
    protected int nivel;
    protected int vida;

    public Guerreiro(String nome, int nivel, int vida) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
    }

    public abstract void atacar();

    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida);
    }
}