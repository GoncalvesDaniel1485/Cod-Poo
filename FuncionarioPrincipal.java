public class FuncionarioPrincipal{
    public static void main(String[] args){
        Funcionario f = new Funcionario(001, "Roberto", "192.147.120-02", "Guarabira", "(83) 98610-0222"
        , 32, 1512.00);
    
        System.out.println("Dados iniciais do funcionário: ");
        System.out.println(f);
        
        f.setSalario(1850.00);
        
        System.out.println("\nDados novos do funcionário: ");
        System.out.println(f);
        System.out.printf("Salário líquido: R$ %.2f\n", f.calculaSalarioLiquido());
    }
}
