package br.unasp.conversor.commons;

import java.util.Map;
import java.util.HashMap;

public class Select {

	public Map<String, String> selectBase(String numeroAConverter, String baseOriginal){

		Map<String, String> numerosConvertidos = new HashMap<String, String>();
		try {
		if(baseOriginal.equals("Bin")){
			numerosConvertidos.put("bin", numeroAConverter);
			numerosConvertidos.put("oct", octal(Integer.parseInt(numeroAConverter)));
			numerosConvertidos.put("dec", Integer.toString(Integer.parseInt(numeroAConverter, 2)));
			numerosConvertidos.put("hex", hex(Integer.parseInt(numeroAConverter)));
		}
		
		if(baseOriginal.equals("Oct")){
			numerosConvertidos.put("bin", binary(Integer.parseInt(numeroAConverter)));
			numerosConvertidos.put("oct", numeroAConverter);
			numerosConvertidos.put("dec", Integer.toString(Integer.parseInt(numeroAConverter, 8)));
			numerosConvertidos.put("hex", hex(Integer.parseInt(numeroAConverter)));
		}
		
		if(baseOriginal.equals("Dec")){
			numerosConvertidos.put("bin", binary(Integer.parseInt(numeroAConverter)));
			numerosConvertidos.put("oct", octal(Integer.parseInt(numeroAConverter)));
			numerosConvertidos.put("dec", numeroAConverter);
			numerosConvertidos.put("hex", hex(Integer.parseInt(numeroAConverter)));
		}
		
		if(baseOriginal.equals("Hex")){
			numerosConvertidos.put("bin", binary(Integer.parseInt(numeroAConverter, 16)));
			numerosConvertidos.put("oct", octal(Integer.parseInt(numeroAConverter, 16)));
			numerosConvertidos.put("dec", Integer.toString(Integer.parseInt(numeroAConverter, 16)));
			numerosConvertidos.put("hex", hex(Integer.parseInt(numeroAConverter, 16)));
		}
		}catch(NumberFormatException e){
			System.out.println("\nErro de formato de n�mero\n" + e);
		}
		return numerosConvertidos;
	}

	public String binary(Integer number) {
		return Integer.toBinaryString(number);
	}

	public String octal(Integer number) {
		return Integer.toOctalString(number);
	}


	public String hex(Integer number) {
		return Integer.toHexString(number);
	}
}
