import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Carro carro1, carro2;
		carro1 = new Carro();
		carro2 = new Carro();
		
		System.out.println("Entre com a cor do ve�culo: ");
		carro1.cor = leia.nextLine();
		System.out.println("Entre com a marca do ve�culo: ");
		carro1.marca = leia.nextLine();
		System.out.println("Entre com o modelo do ve�culo: ");
		carro1.modelo = leia.nextLine();
		System.out.println("Entre com o pre�o do ve�culo: ");
		carro1.pre�o = leia.nextDouble();
		
		System.out.println(carro1.marca + " " + carro1.marca + " " + carro1.modelo + " " + carro1.pre�o);
		
		leia.nextLine();
		System.out.println("Entre com a cor do ve�culo: ");
		carro2.cor = leia.nextLine();
		System.out.println("Agora entre com a marca: ");
		carro2.marca = leia.nextLine();
		System.out.println("Entre com o modelo: ");
		carro2.modelo = leia.nextLine();
		System.out.println("Ente agora com o pre�o do ve�culo: ");
		carro2.pre�o = leia.nextDouble();
		
		System.out.println(carro2.cor + " " + carro2.marca + " " + carro2.modelo + " " + carro2.pre�o);
		
		
		
		
		
		
		
		leia.close();

	}

}
