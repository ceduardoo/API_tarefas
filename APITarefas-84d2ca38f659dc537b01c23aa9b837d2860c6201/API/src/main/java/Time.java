public class Time {

    private String nome;
    private String pais;
    private String estadio;
    private String treinador;
    private String escudo;



    @Override
    public String toString() {
        return "Time [nome=" + nome + ", pais=" + pais + ", estadio=" + estadio + ", treinador=" + treinador
                + ", escudo=" + escudo + "]";
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getEstadio() {
        return estadio;
    }
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }
    public String getTreinador() {
        return treinador;
    }
    public void setTreinador(String treinador) {
        this.treinador = treinador;
    }
    public String getEscudo() {
        return escudo;
    }
    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }



}