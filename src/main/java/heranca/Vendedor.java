package heranca;

public class Vendedor extends Empregado{
    private double valorVendas;
    private double comissao; // porcentagem

    public double calcularSalario(double comissao){
        double percentComissao = comissao / 10;
        double valorComissao = valorVendas * percentComissao;
        double salario = calcularSalario();

        return salario + valorComissao;
    }

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
    }

    public Vendedor(){
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "Vendedor {" +
                "nome=" + getNome() +
                ", valorVendas=" + valorVendas +
                ", comissao=" + comissao +
                '}';
    }
}
