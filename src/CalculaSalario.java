import java.util.Scanner;

public class CalculaSalario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Planilha de Descontos");

        System.out.print("Entre com Valor Hora: ");
        funcionario.setValorHora(scanner.nextDouble());
        System.out.println("Valor Hora é: " + funcionario.getValorHora());

        System.out.print("Entre com quantidade de Horas Trabalhadas: ");
        funcionario.setHorasTrabalhadas(scanner.nextDouble());
        System.out.println("Quantidade de Horas Trabalhadas  é: " + funcionario.getValorHora());

        var salarioBruto = Holerite.calculaSalarioBruto(funcionario.getValorHora(), funcionario.getHorasTrabalhadas());
        System.out.println("Valor a Receber Sem Descontos: " + salarioBruto);

        var salarioLiquido = Holerite.calculaSalarioLiquido(salarioBruto, funcionario.getInss());
        System.out.println("Valor a Receber Com Descontos: " + salarioLiquido);
    }
}
