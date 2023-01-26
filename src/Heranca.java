import javax.sound.sampled.SourceDataLine;

class Funcionario {
    
}

class Vendedor extends Funcionario {

}
class Gerente extends Funcionario {
}
class Faxineiro extends Funcionario {

}
public static void main(String[] args) {
    Funcionario funcionario = new Funcionario();

    Funcionario Gerente = new Gerente();
    Funcionario Faxineiro = new Faxineiro();
    Funcionario Vendedor = new Vendedor();

} 

