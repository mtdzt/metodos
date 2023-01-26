class Carro {
  
  String modelo;
  int capacidadeTanque;
  String cor;
  int precoGasolina; 
   
  Carro() {

  }
  Carro( String modelo, int capacidadeTanque, String cor, int precoGasolina ) {
    this.cor = cor;
  }
  void setCor(String cor) {
    this.cor = cor;
  }
    String getCor() {
      return cor;
    }
    void setcapacidadeTanque(int capacidadeTanque) {
      this.capacidadeTanque  = capacidadeTanque;

    }

    int getcapacidadeTanque() {
      return capacidadeTanque;
    }
    double totalValorTanque(double valorCombustivel  ){
      return capacidadeTanque * valorCombustivel;

    }
}
class RodarAplicacao {
    public static void main(String[] args) {
      Carro carro1 = new Carro();

      carro1.setCor("Azul");
      carro1.setcapacidadeTanque(50);
      
      System.out.println(carro1.getCor());
      System.out.println(carro1.getcapacidadeTanque());
      System.out.println(carro1.totalValorTanque(4.50));
    }


}
