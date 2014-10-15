/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class Histogram <Type> extends HashMap<Type,Integer>{

    @Override
    public Integer get(Object key) {
        if(containsKey(key))
            return super.get(key);
        return 0;
//To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
