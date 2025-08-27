public class Carro{

    int placa = 0;
    String modelo ="";
    String cor ="";

    public static void main(String arg[]){
       
       Carro c1;
       c1 = new Carro();

       Carro c2 = new Carro();

       c1.placa = 1407;
       c1.modelo = "civic";
       c1.cor = "prata";
       c1.PrintDados();

       c2.InsereDados(1308, "corsa", "verde");
       c2.PrintDados();

    

    }

    public void PrintDados(){
        
       System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println(); 

    }

    public void InsereDados(int placax, String modelox, String corx){
        
        cor = corx;
        placa = placax;
        modelo = modelox;

    }
}