
package poo;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        
        
        f1.setNome("Randon");
        f1.setIdade(56);
        f1.setPeso(78.6);
        f1.setMatricula(987);
        f1.setSalario(987.9);
        
        f2.setNome("Geraldinho");
        f2.setIdade(18);
        f2.setPeso(87.9);
        f2.setMatricula(765);
        f2.setSalario(3400.7);
        
        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
    
}
