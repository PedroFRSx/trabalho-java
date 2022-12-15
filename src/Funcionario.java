public class Funcionario extends Pessoa implements IUser{

    private Double salario;
    private CargoFuncs cargoFuncionario;

    public Funcionario(String cpf, String nome, String telefone, Double salario) {
        super(cpf, nome, telefone);
        this.setSalario(salario);
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public CargoFuncs getCargoFuncionario() {
        return cargoFuncionario;
    }

    public void setCargoFuncionario(CargoFuncs cargoFuncionario) {
        this.cargoFuncionario = cargoFuncionario;
    }

    @Override
    public Boolean autenticar() {
        return true;
    }
}
