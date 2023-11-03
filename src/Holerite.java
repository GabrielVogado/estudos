public class Holerite {

    public static Double calculaSalarioLiquido(double salarioBruto, double inss) {
        var descontoSalario =  calculaDescontoSalario(salarioBruto,inss);
        var salarioLiquido = salarioBruto - descontoSalario;
        return salarioLiquido;
    }

    public static Double calculaSalarioBruto(double valorHora, double horasTrabalhadas) {
        return valorHora * horasTrabalhadas;
    }

    public static Double calculaDescontoSalario(double salarioBruto, double inss) {
        return salarioBruto * inss;
    }
}
