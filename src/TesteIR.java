public class TesteIR {

	public static void main(String[] args) {

		double salario = 1750.0;

		if (salario <= 2600.0) {
			System.out.println("A sua aliquota é de 15%");
			System.out.println("Você pode deduzir até R$ 350");
		} else {
			if ((salario > 2600.0) && (salario <= 3750.0)) {
				System.out.println("A sua aliquota é de 22,5%");
				System.out.println("Você pode deduzir até R$ 636");
			} else {
				System.out.println("Você se ferrou com o IR... $$$.");
				
			}
		}
	}
}