package heranca;

public class Operario extends Empregado {
    private double valorProducao;
    private double comissao; //porcentagem


    public double calcularSalario(double comissao){
        double percentComissao = comissao / 10;
        double salario = calcularSalario();
        double valorComissao = salario * percentComissao;

        return salario + valorComissao;
    }


    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
    }

    public Operario() {
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "Operario {" +
                "nome=" + getNome() +
                ", valorProducao=" + valorProducao +
                ", comissao=" + comissao +
                '}';
    }
}
