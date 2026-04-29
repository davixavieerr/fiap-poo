package br.com.fiapride.model;

public class Oculos {
	public boolean estaLimpo;
	public boolean hastesAbertas;
	
	public void limparOculos() {
		if (this.estaLimpo == false) {
			this.estaLimpo = true;
			System.out.println("Óculos limpos e brilhando! ");
			return;
		}
		System.out.println("O óculos já está limpo, não precisa esfregar mais.");
	}
	public void abrirFecharOculos() {
        if (this.hastesAbertas == false) {
        	this.hastesAbertas = true;
        	System.out.println("Óculos abertos!");
        	return;
        }
        this.hastesAbertas = false; 
        System.out.println("Óculos fechados e prontos para guardar!");
    }
}
