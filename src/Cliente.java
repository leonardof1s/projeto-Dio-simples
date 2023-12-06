public class Cliente {

    private String nome;
    private int senha;

    public Cliente(String nome, int senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "{" +
                " Cliente='" + getNome() + "'" +
                ", senha='" + "*****" + "'" +
                "}";
    }

}