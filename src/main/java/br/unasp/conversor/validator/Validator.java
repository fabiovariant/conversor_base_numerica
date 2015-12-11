package br.unasp.conversor.validator;

import static br.unasp.conversor.commons.Bases.BIN;
import static br.unasp.conversor.commons.Bases.OCT;
import static br.unasp.conversor.commons.Bases.DEC;
import static br.unasp.conversor.commons.Bases.HEX;

import java.util.Map;
import java.util.HashMap;

import br.unasp.conversor.commons.Select;

public class Validator {
    
    public Map<String, String> validateChars(String base, String number){
        Select select = new Select();
        char[] chars = base.toCharArray();
        
        
        if(base.isEmpty() || number.isEmpty()){
            return new HashMap<>();
        }
        
        if(base.equals(BIN)){
            for (int i = 0; i < chars.length; i++){
                if (chars[i] != '0' && chars[i] != '1')  
                    return new HashMap<>();  
            }              
            return select.selectBase(number, base);  
        }
        
        if(base.equals(OCT)){
            for (int i = 0; i < chars.length; i++){
                if (chars[i] < '0' && chars[i] > '8')  
                    return new HashMap<>();  
            }              
            return select.selectBase(number, base);  
        }
        
        if(base.equals(DEC)){
            for (int i = 0; i < chars.length; i++){
                if (chars[i] < '0' && chars[i] > '9')  
                    return new HashMap<>();  
            }              
            return select.selectBase(number, base);  
        }
        
        if(base.equals(HEX)){
            boolean isHex = number.matches("[0-9A-F]+");
            if(isHex)
                return select.selectBase(number, base);
            else
                return new HashMap<>();
        }
        else
            return new HashMap<>();
    }
}
