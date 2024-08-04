import java.util.HashMap;
import java.util.Map;

class RomanToInteger {
    public int romanToInt(String s) {
    	int numeroInteger = 0;
    	Map<Character, Integer> numerosRomanos = new HashMap<>();
    	numerosRomanos.put('I', 1);
    	numerosRomanos.put('V', 5);
    	numerosRomanos.put('X', 10);
    	numerosRomanos.put('L', 50);
    	numerosRomanos.put('C', 100);
    	numerosRomanos.put('D', 500);
    	numerosRomanos.put('M', 1000);
    	
    	for (int i = 0; i < s.length(); i ++) {
    		int valorActual = numerosRomanos.get(s.charAt(i));
    		
    		if (i < s.length() - 1 && valorActual < numerosRomanos.get(s.charAt(i + 1))) {
    			numeroInteger -= valorActual;
    		} else {
    			numeroInteger += valorActual;
    		}
    	}
    	
		return numeroInteger;
    }
}