/*
 * 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
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
