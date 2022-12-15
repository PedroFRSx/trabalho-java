public class Exec {

    public static void main(String[] args) {
        //==============================================================================================================
        Endereco end1 = new Endereco("123084-34","Merçes","Rua A","Caixa","MG","86");
        Endereco end2 = new Endereco("123084-34","Juiz de Fora","Rua B","Mercado","MG","190");
        Endereco end3 = new Endereco("324435-66","Paiva","Rua C","Banco","RJ","99");

        Cliente clin1 = new Cliente("344.566.768-20","Gustavo","99871234");
        clin1.listaEndereco.add(end1);
        clin1.listaEndereco.add(end2);
        clin1.listaEndereco.add(end3);

        clin1.imprimirEndereco(clin1);

        //==============================================================================================================

        CargoFuncs gen =new CargoFuncs();
        gen.setNomeCargo("Gerente");

        CargoFuncs aten = new CargoFuncs();
        aten.setNomeCargo("Atendente");

        Funcionario funcs1 = new Funcionario("324.455.675-30","Victor","84342411",2000.);
        funcs1.setCargoFuncionario(aten);

        Funcionario funcs2 = new Funcionario("231.654.234-21","Jackson","88764565",5000.);
        funcs2.setCargoFuncionario(gen);

        //==============================================================================================================

        ContaCorrente coren1 = new ContaCorrente("981", 1000. , 2000.);
        ContaPoupanca conpa = new ContaPoupanca("355" , 1000., 0.01);

        coren1.trasferir(coren1,conpa,500.);

        System.out.println("Conta numero: "+ coren1.getNumero() + " tem o Saldo de: " + coren1.calcularSaldo(coren1));
        System.out.println("Conta numero: "+ conpa.getNumero() + " tem o Saldo de: " + conpa.calcularSaldo(conpa));

        //==============================================================================================================

        ContaCorrente coren3 = new ContaCorrente("567", 0., 0.);

        Credito cred1 = new Credito(100.);
        Credito cred2 = new Credito(100.);
        Credito cred3 = new Credito(100.);
        coren3.credito.add(cred1);
        coren3.credito.add(cred2);
        coren3.credito.add(cred3);

        Debito debi1 = new Debito(50.);
        coren3.debito.add(debi1);

        coren3.depositar(cred1);
        coren3.depositar(cred2);
        coren3.depositar(cred3);

        coren3.sacar(debi1);


        System.out.println("Conta numero: " + coren3.getNumero() + " tem o Saldo de: " + coren3.calcularSaldo(coren3));

        //==============================================================================================================

        Cliente clin2 =new Cliente("4412234234","Pedro","998432211");
        clin2.listaConta.add(coren1);
        clin2.listaConta.add(conpa);
        clin1.listaConta.add(coren3);



    }
}
