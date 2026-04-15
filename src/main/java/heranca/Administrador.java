package heranca;

public class Administrador extends Empregado{
    private double ajudaDeCusto;

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCustos) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCustos;
    }

    public Administrador(){
    }

    public double calcularSalario(double ajudaDeCusto){
        double salario = calcularSalario();

        return salario + ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "nome=" + getNome() +
                ", ajudaDeCusto=" + ajudaDeCusto +
                '}';
    }
}
