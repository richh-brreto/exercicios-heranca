package heranca;

public class ProgramaTrabalho {
    static void main() {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Richard");
        pessoa1.setEndereco("Rua Haddock Lobo");
        pessoa1.setTelefone("123456789");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Felipe");
        pessoa2.setEndereco("Rua Augusta");
        pessoa2.setTelefone("987654321");

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Bianca");
        pessoa3.setEndereco("Rua Consolação");
        pessoa3.setTelefone("839172654");

        Pessoa pessoa4 = new Pessoa();
        pessoa4.setNome("Michel");
        pessoa4.setEndereco("Rua Trianon");
        pessoa4.setTelefone("0001112233");

        Fornecedor fornecedor1 = new Fornecedor("Silva", "Rua 2", "1122334455",
                1000, 200);
        Fornecedor fornecedor2 = new Fornecedor(2000, 200);
        fornecedor2.setNome(pessoa1.getNome());
        fornecedor2.setEndereco(pessoa1.getEndereco());
        fornecedor2.setTelefone(pessoa1.getTelefone());

        Empregado empregado1 = new Empregado();
        empregado1.setNome(pessoa2.getNome());
        empregado1.setEndereco(pessoa2.getEndereco());
        empregado1.setTelefone(pessoa2.getTelefone());
        empregado1.setCodigoSetor(1);
        empregado1.setImposto(7.5);
        empregado1.setSalarioBase(6000);

        Administrador administrador1 = new Administrador();
        administrador1.setNome(pessoa3.getNome());
        administrador1.setEndereco(pessoa3.getEndereco());
        administrador1.setTelefone(pessoa3.getTelefone());
        administrador1.setImposto(7.5);
        administrador1.setAjudaDeCusto(250);
        administrador1.setSalarioBase(7000);
        administrador1.setCodigoSetor(1);

        Operario operario1 = new Operario();
        operario1.setNome(pessoa4.getNome());
        operario1.setEndereco(pessoa4.getNome());
        operario1.setTelefone(pessoa4.getTelefone());
        operario1.setImposto(administrador1.getImposto());
        operario1.setSalarioBase(5000);
        operario1.setValorProducao(40000);
        operario1.setComissao(10);

        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNome(pessoa1.getNome());
        vendedor1.setEndereco(pessoa1.getNome());
        vendedor1.setTelefone(pessoa1.getTelefone());
        vendedor1.setImposto(administrador1.getImposto());
        vendedor1.setSalarioBase(6500);
        vendedor1.setValorVendas(2000);
        vendedor1.setComissao(10);

        System.out.println(fornecedor1);
        System.out.println(fornecedor2);
        System.out.println("Saldo do fornecedor 1: " + fornecedor1.obterSaldo());
        System.out.println("Saldo do fornecedor 2: " + fornecedor2.obterSaldo());


        System.out.println(empregado1);
        System.out.println("Salário do empregado 1 (com imposto aplicado): " + empregado1.calcularSalario());
        System.out.println(administrador1);
        System.out.println("Salário do administrador 1 (com ajuda de custo): " + administrador1.calcularSalario(administrador1.getAjudaDeCusto()));

        System.out.println(operario1);
        System.out.println("Salário do operário 1 (com comissão aplicada): " + operario1.calcularSalario(operario1.getComissao()));
        System.out.println(vendedor1);
        System.out.println("Salário do vendedor 1 (com comissão aplicada): " + vendedor1.calcularSalario(vendedor1.getComissao()));
    }
}