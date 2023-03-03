public class Main {

    static void dizerOi() {
        System.out.println("Oi");
    }

    static void dizerOi(String nome) {
        System.out.println("Oi, " + nome);
    }

    static void apresentarMenu() {
        System.out.println("1 - somar");
        System.out.println("2 - subtrair");
        System.out.println("3 - dividir");
        System.out.println("4 - multiplicar");
        System.out.println("0 - sair");
    }

    //entrypoint
    public static void main(String[] args) {
        // int
        // double
        // char
        // string
        // bool
        // void = vazio

        int option = 2;

        while(option != 0) { // do...while
            apresentarMenu();
            // pediria a opção
            executarOpcaoInserida(option);
        }

        dizerOi();
        dizerOi("Gabriel");
    }

}