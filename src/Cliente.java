import java.util.ArrayList;
import java.util.Collection;

public class Cliente extends Pessoa implements IUser{

    private Boolean vip = true;
    public Collection<Endereco> listaEndereco = new ArrayList<Endereco>();
    public Collection<Conta> listaConta = new ArrayList<Conta>();

    public Cliente(String cpf, String nome, String telefone) {
        super(cpf, nome, telefone);
    }

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public void imprimirEndereco(Cliente e) {

        Collection<Endereco> enderecoCliente = e.listaEndereco;

        for (Endereco i : enderecoCliente) {

            System.out.println("Cliente " + e.getNome() + " tem residencia na cidade de " + i.getCidade() + " CEP: " + i.getCep());

        }
    }

    @Override
    public Boolean autenticar() {
        return true;
    }
}
