package com.leandrodavid.palindromo;

public class PalindromoWrapper {

	/**
	 * 
	 * @param args - expects a single parameter as a word
	 */
	public static void main(String[] args) {
		try{
			if(args.length==0){
				System.out.println("Informe uma palavra como parametro para ser analisada. Para analisar uma frase, coloque-a entre aspas. Para analisar várias palavras, separe-as com espaço");
				return;
			}
			for(String word:args){
				if(Palindromo.isPalindromo(word)){
					System.out.println("Palavra \""+word+ "\" : PALINDROMO: SIM");
				}else{
					System.out.println("Palavra \""+word+"\" - PALINDROMO: NAO");
				}
			}
			
			System.out.println("Para analisar uma frase, coloque-a entre aspas. Para analisar varias palavras, separe-as com espaco");
		}
		catch(Exception e){
			System.out.println("Ocorreu algum erro "+e.getMessage());
		}

	}

}
