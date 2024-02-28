package view;
 
import controller.MultPorSomaRecController;
 
public class Principal {
 
	public static void main(String[] args) {
		MultPorSomaRecController mps = new MultPorSomaRecController();
 
		int a = 2;
		int b = 5;
		int multporsoma = mps.multporsoma(a, b);
		System.out.println(multporsoma);
	}
 
}
