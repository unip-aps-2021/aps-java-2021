public class Rio {
    private String nome;
    private double longitude;
    private double longitudePoluicao;
    private String descricao;
    private String qualidadeDaAgua;

    public Rio(String nome, double longitude, double longitudePoluicao, String qualidadeDaAgua) {
        this.nome = nome;
        this.longitude = longitude;
        this.longitudePoluicao = longitudePoluicao;
        this.qualidadeDaAgua = qualidadeDaAgua;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
                ", descricao='" + descricao + '\'' +
                ", qualidadeDaAgua='" + qualidadeDaAgua + '\'' +
                '}';
    }
}