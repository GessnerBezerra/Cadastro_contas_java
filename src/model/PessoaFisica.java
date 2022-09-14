package model;

public class PessoaFisica extends Cliente {
    private String cpf;
    private String nome;

    public PessoaFisica(Integer codigo, String cidade, String estado, String cpf, String nome) {
        super(codigo, cidade, estado);
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String listarDados() {
        return(
                "\nCliente: " + nome + "\n" +
                        "\ncpf: "+ cpf + "\n"+
                        super.listarDados()
        );

    }
}
