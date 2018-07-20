package aula05;

public class Aula05 {

    public static void main(String[] args) {
        Conta p1 = new Conta();
        Conta p2 = new Conta();

        p1.setNumConta(1111);
        p1.setNomeDono("Jubileu");
        p1.abrirConta("CC");

        p2.setNumConta(2222);
        p2.setNomeDono("Creuza");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);

        p2.sacar(100);

        p1.sacar(150);
        p1.fecharConta();

        p1.estado();
        p2.estado();
    }
}