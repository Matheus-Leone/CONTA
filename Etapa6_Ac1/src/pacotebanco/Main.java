package pacotebanco;

public class Main {
	
	 // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando uma conta bancária com saldo inicial de R$1000,00
        ContaBancaria conta = new ContaBancaria(1000.0);

        // Testando depósito
        conta.depositar(200); // Depósito de R$200 com taxa de 1%
        conta.consultarSaldo(); // 1ª consulta

        // Testando saque
        conta.sacar(150); // Saque de R$150 com taxa de 0,5%
        conta.consultarSaldo(); // 2ª consulta

        // Realizando mais consultas para ver o efeito da taxa de consultas
        conta.consultarSaldo(); // 3ª consulta
        conta.consultarSaldo(); // 4ª consulta
        conta.consultarSaldo(); // 5ª consulta (taxa de R$0,10 será cobrada)

        // Verificando o saldo final após operações
        conta.consultarSaldo(); // 6ª consulta, sem taxa ainda
    }
}

