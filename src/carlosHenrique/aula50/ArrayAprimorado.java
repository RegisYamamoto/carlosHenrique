package carlosHenrique.aula50;

import java.util.ArrayList;

public class ArrayAprimorado {

	// ArrayList, vetor aprimorado
	
	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Maria");
		nomes.add("Tadeu");
		nomes.add("Hugo");
		nomes.add("Pedro");
		nomes.add("Margaret");
		System.out.println(nomes.toString());
		
		System.out.println(nomes.indexOf("Pedro"));
		
		System.out.println(nomes.size());
		
		System.out.println(nomes.isEmpty());
		
		nomes.remove(1);
		nomes.remove("Maria");
		System.out.println(nomes.toString());
		
		System.out.println(nomes.contains("Margaret"));
		
		nomes.clear();
		System.out.println(nomes.toString());

	}

}
