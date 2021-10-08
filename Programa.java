public class Programa{

    public static void main(String args[]){
        
        Funcionario f1 = new Funcionario();
        f1.setNome("Paulo");
        f1.setCpf("cpf");
        f1.setDepartamento("TI");
        f1.setSalario(3000);

        Gerente gerente = new Gerente();
        gerente.setNome ("Elidio");
        gerente.setCpf ("005050505");
        gerente.setDepartamento ("RH");
        gerente.setSalario (10000);
        gerente.setSenha (123);

         System.out.println("Nome:" + f1.getNome());
        System.out.println("Departamento:" + f1.getDepartamento());
        System.out.println("Salario: R$" + f1.getSalario());
        System.out.println("CPF:" + f1.getCpf());
        System.out.println("-------------------");

        System.out.println("Nome:" + gerente.getNome());
        System.out.println("Departamento:" + gerente.getDepartameto());
        System.out.println("Salariol:" + gerente.getSalario());
        System.out.println("CPF:" + gerente.getCpf());
        System.out.println("Senha:" + gerente.getSenha());
    }
}