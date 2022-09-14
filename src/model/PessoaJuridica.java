package model;

public class PessoaJuridica extends Cliente{
    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(Integer codigo, String cidade, String estado, String cnpj, String razaoSocial) {
        super(codigo, cidade, estado);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String listarDados() {
        return(
                "\nrazão social: " + razaoSocial + "\n" +
                        "\ncnpj: "+ cnpj + "\n"+ "Cliente"+
                        super.listarDados()
        );
    }
}
