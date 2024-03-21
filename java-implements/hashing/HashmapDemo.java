import java.util.*;

class HashmapDemo{


	public static void main(String[] args) {
		
		HashMap<String, Integer> menu = new HashMap<>();

		menu.put("Samosa", 15);
		menu.put("Omlette", 20);
		menu.put("Maggie", 30);
		menu.put("Bread", 50);


		//iteration using Set
		Set<String> keys = menu.keySet();
		System.out.println(keys);

		for(String k: keys){
			System.out.println("Key="+k+", Value="+ menu.get(k));
		}

	}
}