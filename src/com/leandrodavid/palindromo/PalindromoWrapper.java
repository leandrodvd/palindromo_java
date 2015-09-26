package com.leandrodavid.palindromo;

public class PalindromoWrapper {

	/**
	 * 
	 * @param args - expects a single parameter as a word
	 */
	public static void main(String[] args) {
		try{
			if(args.length==0){
				System.out.println("Informe uma palavra como parametro para ser analisada. Para analisar uma frase, coloque-a entre aspas. Para analisar v�rias palavras, separe-as com espa�o");
				return;
			}
			for(String word:args){
				if(Palindromo.isPalindromo(word)){
					System.out.println("A palavra "+word+ " � um pal�ndromo");
				}else{
					System.out.println("A palavra "+word+ " N�O � um pal�ndromo");
				}
			}
			
			System.out.println("Para analisar uma frase, coloque-a entre aspas. Para analisar v�rias palavras, separe-as com espa�o");
		}
		catch(Exception e){
			System.out.println("Ocorreu algum erro "+e.getMessage());
		}

	}

}
