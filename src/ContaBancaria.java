public class ContaBancaria {
    private double saldo;
    interface OperacaoBancaria {
        double calcular(double saldo, double valor);
    }

    private double realizarOperacao(double saldo, double valor, OperacaoBancaria operacao){
        return operacao.calcular(saldo, valor);
    };

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        OperacaoBancaria creditar = (saldo, valor) -> saldo + valor;
        OperacaoBancaria debitar = (saldo, valor) -> saldo - valor;
        System.out.println("Saldo pós crédito: " + conta.realizarOperacao(conta.saldo, 50, creditar));
        System.out.println("Saldo pós débito: " + conta.realizarOperacao(conta.saldo, 10, debitar));

    }
}
