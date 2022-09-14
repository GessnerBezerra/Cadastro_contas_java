package model;

public class Cliente {
    protected Integer codigo;
    protected String cidade;
    protected String estado;

    public Cliente() {}

    public Cliente(Integer codigo, String cidade, String estado) {
        this.codigo = codigo;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String listarDados() {
        return "\ncodigo: " + codigo +
                "\ncidade: " + cidade +
                "\nestado: " + estado + "\n";
    }

}