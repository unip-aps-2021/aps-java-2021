public class Rio {
    private String nome;
    private double longitude;
    private double longitudePoluicao;
    private String primeiraCuriosidade;
    private String segundaCuriosidade;
    private String terceiraCuriosidade;
    private QualidadeAgua qualidadeDaAgua;

    public Rio(String nome,
               double longitude,
               double longitudePoluicao,
               QualidadeAgua qualidadeDaAgua,
               String primeiraCuriosidade,
               String segundaCuriosidade,
               String terceiraCuriosidade) {
        this.nome = nome;
        this.longitude = longitude;
        this.longitudePoluicao = longitudePoluicao;
        this.qualidadeDaAgua = qualidadeDaAgua;
        this.primeiraCuriosidade = primeiraCuriosidade;
        this.segundaCuriosidade = segundaCuriosidade;
        this.terceiraCuriosidade = terceiraCuriosidade;
    }

    public Rio(String nome,
               double longitude,
               double longitudePoluicao,
               QualidadeAgua qualidadeDaAgua) {
        this.nome = nome;
        this.longitude = longitude;
        this.longitudePoluicao = longitudePoluicao;
        this.qualidadeDaAgua = qualidadeDaAgua;
    }

    public String getSegundaCuriosidade() {
        return segundaCuriosidade;
    }

    public String getTerceiraCuriosidade() {
        return terceiraCuriosidade;
    }

    public double getPorcentagemPoluicao(){
        return (longitudePoluicao * 100) / longitude;
    }

    public String getNome() {
        return nome;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getPrimeiraCuriosidade() {
        return primeiraCuriosidade;
    }

    public QualidadeAgua getQualidadeDaAgua() {
        return qualidadeDaAgua;
    }

    public double getLongitudePoluicao() {
        return longitudePoluicao;
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