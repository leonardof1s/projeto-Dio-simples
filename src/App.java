
import java.util.List;

public class App extends Banco {
    public static void main(String[] args) throws Exception {
        System.out.println("Seja bem vindo ao banco do Leo");

        Cliente leonardo = new Cliente("Leonardo", 10);
        System.out.println(leonardo);

        Conta cc = new ContaCorrente(leonardo);
        Conta cp = new ContaPoupança(leonardo);

        cc.saldo = 100.0;

        cc.tranferir(50.0, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

        List<Conta> listaContas = List.of(cc, cp);

        imprimirDadosContas(listaContas);
    }
}