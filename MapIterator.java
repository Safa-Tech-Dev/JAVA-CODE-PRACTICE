import java.util.*;

public class MapIterator{


	public static void main(String[] args){

		//Create HashMap 
		Map<Integer, String> companies = new HashMap<>();
		companies.put(1,"Citi Bank");
		companies.put(2,"Wells Fargo");
		companies.put(3,"TCS");
		companies.put(4,"Wipro");
		System.out.println("1.Iterating or Looping map using java 5 forEach loop");
		for(Integer key : companies.keySet()){
			
			System.out.println("key :" + key + "," + "value :" + companies.get(key));
		}
		System.out.println("2.Iterating or Looping map KeySet Iterator");

		Set<Integer> keySet = companies.keySet();
		Iterator<Integer> keySetIterator = keySet.iterator();
		while(keySetIterator.hasNext()){

			Integer key = keySetIterator.next();
			System.out.println("key :" + key + "," + "value :" + companies.get(key));
		}
		System.out.println("2.Iterating or Looping map EntrySet and Java 5 forEach loop");
		Set<Map.Entry<Integer, String>> entrySet = companies.entrySet();
		for(Map.Entry<Integer, String> entry : entrySet){
			
			System.out.println("key :" + entry.getKey() + "," + "value :" + entry.getValue());
			
		}
		System.out.println("2.Iterating or Looping map EntrySet and Iterator");
		Set<Map.Entry<Integer, String>> entrySet1 = companies.entrySet();
		Iterator<Map.Entry<Integer,String>> iterator = entrySet1.iterator();
		while(iterator.hasNext()){
			
			Map.Entry entry = iterator.next();
			System.out.println("key :" + entry.getKey() + "," + "value :" + entry.getValue());


		}

		

		
	}

}