package model;

public class Conta {

    private Integer numero;
    private Cliente cliente;
    private Double saldo;

    public Conta() {}

    public Conta(Integer numero, Cliente cliente, Double saldo) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String listarDados() {
        return "\nnúmero da conta: " + numero +
                "\ncliente: \n" + cliente.listarDados() +
                "\nsaldo: " + saldo + "\n";
    }

    public boolean sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public String getSaldoFormatado() {
        return "saldo = " + saldo;
    }
}
