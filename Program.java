import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Carro carro1, carro2;
		carro1 = new Carro();
		carro2 = new Carro();
		
		System.out.println("Entre com a cor do veículo: ");
		carro1.cor = leia.nextLine();
		System.out.println("Entre com a marca do veículo: ");
		carro1.marca = leia.nextLine();
		System.out.println("Entre com o modelo do veículo: ");
		carro1.modelo = leia.nextLine();
		System.out.println("Entre com o preço do veículo: ");
		carro1.preço = leia.nextDouble();
		
		System.out.println(carro1.marca + " " + carro1.marca + " " + carro1.modelo + " " + carro1.preço);
		
		leia.nextLine();
		System.out.println("Entre com a cor do veículo: ");
		carro2.cor = leia.nextLine();
		System.out.println("Agora entre com a marca: ");
		carro2.marca = leia.nextLine();
		System.out.println("Entre com o modelo: ");
		carro2.modelo = leia.nextLine();
		System.out.println("Ente agora com o preço do veículo: ");
		carro2.preço = leia.nextDouble();
		
		System.out.println(carro2.cor + " " + carro2.marca + " " + carro2.modelo + " " + carro2.preço);
		
		
		
		
		
		
		
		leia.close();

	}

}
