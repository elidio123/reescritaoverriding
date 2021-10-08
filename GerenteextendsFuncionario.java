public class Gerente extends Funcionario{

    private int senha;
}
public void setSenha(int senha){
    this.denha = senha;
}
public boolean autenticacao(int senha){
    if (this.senha = senha){
        System.out println("Acesso permitido!");
        return true;
    }else{
    System.out.println("Acesso negado"){
        return false;
        }
    }

}