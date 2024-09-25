package pacotebanco;

public class ContaBancaria {
    // Atributo privado
    private double saldo;
    private int numeroConsultas;

    // Construtor para inicializar a conta com saldo inicial
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
        this.numeroConsultas = 0;
    }

    // Método para depositar dinheiro (com a taxa de 1%)
    public void depositar(double valor) {
        if (valor > 0) {
            double taxa = valor * 0.01; // 1% de taxa
            saldo += (valor - taxa);
            System.out.println("Depósito de R$" + valor + " realizado. Taxa de R$" + taxa + " aplicada.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar dinheiro (com a taxa de 0,5%)
    public void sacar(double valor) {
        double taxa = valor * 0.005; // 0,5% de taxa
        double valorComTaxa = valor + taxa;
        if (valor > 0 && saldo >= valorComTaxa) {
            saldo -= valorComTaxa;
            System.out.println("Saque de R$" + valor + " realizado. Taxa de R$" + taxa + " aplicada.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    // Método para consultar o saldo (a cada 5 consultas, cobra R$ 0,10)
    public void consultarSaldo() {
        numeroConsultas++;
        if (numeroConsultas % 5 == 0) {
            saldo -= 0.10; // Cobra 10 centavos a cada 5 consultas
            System.out.println("Consulta realizada. Taxa de R$0,10 aplicada.");
        } else {
            System.out.println("Consulta realizada.");
        }
        System.out.println("Saldo atual: R$" + saldo);
    }

    // Getter do saldo (Pega as informações do saldo e não conta como uma consulta para taxas)
    public double getSaldo() {
        return saldo;
    }

 }