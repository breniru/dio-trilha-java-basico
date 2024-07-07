package dio;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author breno
 */
public class ContaTerminal {
    
    public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public static int contaCliente;
    public static String agenciaCliente;
    public static String nomeCliente;
    public static double saldoCliente;
    
    /**
     * Esse método é usado para obter do usuário do número da conta
     * @return int o retorno desse método á variável no qual o número da conta está alocada.
     */
    public static int obterNumeroConta(){
        System.out.println("Por favor, digite o número da Conta!");
        contaCliente = scanner.nextInt();
        scanner.nextLine();
        
        return contaCliente;
    }
    
    /**
     * Esse método é usado para obter do usuário do número da agência
     * @return String o retorno desse método á variável no qual o número da agência está alocada.
     */
    public static String obterNumeroAgencia(){
        System.out.println("Por favor, digite qual é sua agência!");
        agenciaCliente = scanner.next();
        scanner.nextLine();
        
        return agenciaCliente;
    }
    
    /**
     * Esse método é usado para obter o nome do usuário
     * @return String o retorno desse método á variável no qual o nome do usuário está alocado.
     */
    public static String obterNomeCliente(){
        System.out.println("Por favor, digite seu nome completo!");
        nomeCliente = scanner.nextLine();
        
        return nomeCliente;
    }
    
    /**
     * Esse método é usado para obter do usuário o seu saldo
     * @return double o retorno desse método á variável no qual o saldo do cliente está alocado.
     */
    public static double obterSaldoCliente(){
        System.out.println("Por favor, digite qual o saldo da conta!");
        saldoCliente = scanner.nextDouble();
        
        return saldoCliente;
    }
    
    /**
     * Esse método é usado para imprimir no terminal uma mensagem ao usuário
     * @param contaCliente
     * @param agenciaCliente
     * @param nomeCliente
     * @param saldoCliente
     */
    public static void imprimirMensagem(int contaCliente, String agenciaCliente, String nomeCliente, double saldoCliente){
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$%.2f "
                + "já está disponível para saque!",nomeCliente,agenciaCliente,contaCliente,saldoCliente);
    }
    
    
    public static void main(String[] args) {
        int contaCliente = obterNumeroConta();
        String agenciaCliente = obterNumeroAgencia();
        String nomeCliente = obterNomeCliente();
        double saldoCliente = obterSaldoCliente();
        
        imprimirMensagem(contaCliente, agenciaCliente, nomeCliente, saldoCliente);
    }
    
}
