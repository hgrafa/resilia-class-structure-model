
class Aluno {

    // tem - atributo
    String username;
    String password;
    double nota;
    int idade;

    // faz - método/função

    void fazerAniversario() {
        idade++;
    }

}
public class Main {
    public static void main(String[] args) {

        Aluno joao = new Aluno();
        joao.username = "jj123";
        joao.idade = 20;
        System.out.println(joao.idade);
        joao.fazerAniversario();
        System.out.println(joao.idade);

    }

}