import java.util.HashMap;

public class occurance {

	public static void main(String[] args) {
		String str="Sairam";
		
		
		HashMap <Character,Integer>map=new HashMap <Character,Integer>();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(map.containsKey(ch)) {
				int count=map.get(ch);
				count++;
				map.replace(ch, count);
				count++;
			}else {
				map.put(ch, 1);
				
			}
		}
		for(Character key:map.keySet()) {
			System.out.print(key+""+map.get(key));
		}
		
		

	}

}
