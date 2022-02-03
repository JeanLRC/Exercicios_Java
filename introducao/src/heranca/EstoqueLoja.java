/*
 * 	3- Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
	trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
	programa deverá atender as seguintes funcionalidades:
		Armazenar dados da List
		Remover dados da list;
		Atualizar dados da list.
		Apresentar todos os dados da list.
 */

package heranca;

import java.util.ArrayList;
import java.util.Collections;

public class EstoqueLoja {
	public static void main(String[] args) {
		ArrayList<String> est = new ArrayList<>();
		System.out.println(est);
		est.add("Banana");
		est.add("Maça");
		est.add("Pera");
		est.add("Laranja");
		est.add("Jaca");

		System.out.println(est);
		est.set(4, "Limão");
		System.out.println(est);
		est.remove(4);
		System.out.println(est.size());
		Collections.sort(est);
		System.out.println(est);

	}

}
