public class Carro{

    int placa = 0;
    String modelo ="";
    String cor ="";

    public static void main(String arg[]){
       
       Carro c1;
       c1 = new Carro();

       Carro c2 = new Carro();

       c1.setPlaca(1407);
       c1.setModelo("civic");
       c1.setCor("prata");
       
       System.out.println("\nPlaca: "+getPlaca);
       System.out.println("\nModelo: "+getModelo);
       System.out.println("\nCor: "+getCor);

       c2.setPlaca(1308);
       c2.setModelo("corsa");
       c2.setCor("rosa");
       
       System.out.println("\nPlaca: "+getPlaca);
       System.out.println("\nModelo: "+getModelo);
       System.out.println("\nCor: "+getCor);
        
    }

    

    public int getPlaca(){
    return placa;
 }

 public String getModelo(){
    return modelo;
 }
 public String getCor(){
    return cor;
 }

 public void setPlaca(int placa){
    this.placa = placa;
 }

 public void setModelo(String modelo){
    this.modelo = modelo;
 }

 public void setCor(String cor){
    this.cor = cor;
 }

    
}
