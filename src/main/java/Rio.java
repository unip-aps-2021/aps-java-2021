public class Rio {
    private String nome;
    private double longitude;
    private double longitudePoluicao;
    private String primeiraCuriosidade;
    private String segundaCuriosidade;
    private String terceiraCuriosidade;
    private String qualidadeDaAgua;

    public Rio(String nome, double longitude, double longitudePoluicao, String qualidadeDaAgua) {
        this.nome = nome;
        this.longitude = longitude;
        this.longitudePoluicao = longitudePoluicao;
        this.qualidadeDaAgua = qualidadeDaAgua;
    }

    public String getSegundaCuriosidade() {
        return segundaCuriosidade;
    }

    public void setSegundaCuriosidade(String segundaCuriosidade) {
        this.segundaCuriosidade = segundaCuriosidade;
    }

    public String getTerceiraCuriosidade() {
        return terceiraCuriosidade;
    }

    public void setTerceiraCuriosidade(String terceiraCuriosidade) {
        this.terceiraCuriosidade = terceiraCuriosidade;
    }

    public double getPorcentagemPoluicao(){
        return (longitudePoluicao * 100) / longitude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getPrimeiraCuriosidade() {
        return primeiraCuriosidade;
    }

    public void setPrimeiraCuriosidade(String primeiraCuriosidade) {
        this.primeiraCuriosidade = primeiraCuriosidade;
    }

    public String getQualidadeDaAgua() {
        return qualidadeDaAgua;
    }

    public void setQualidadeDaAgua(String qualidadeDaAgua) {
        this.qualidadeDaAgua = qualidadeDaAgua;
    }

    public double getLongitudePoluicao() {
        return longitudePoluicao;
    }

    public void setLongitudePoluicao(double longitudePoluicao) {
        this.longitudePoluicao = longitudePoluicao;
    }

    @Override
    public String toString() {
        return "Rio{" +
                "nome='" + nome + '\'' +
                ", longitude=" + longitude +
                ", longitudePoluicao=" + longitudePoluicao +
                ", descricao='" + primeiraCuriosidade + '\'' +
                ", qualidadeDaAgua='" + qualidadeDaAgua + '\'' +
                '}';
    }
}