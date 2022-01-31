/*
 * 2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

package programacaoOrientadaAObjetos;

public class SaidaAviao {

	public static void main(String[] args) {
		
		Aviao A1 = new Aviao();
		
		A1.qtdA=300;
		A1.qtdFunc=20;
		A1.modelo="Boeing 747";
		A1.qtdTurb=4;
		
		A1.Status();
	}

}
