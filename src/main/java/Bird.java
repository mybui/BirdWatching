/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MimiHMB
 */
public class Bird {
    private String name;
    private String latin;
    private int count;
    
    public Bird(String name_, String latin_) {
        this.name = name_;
        this.latin = latin_;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getLatin() {
        return this.latin;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public void observe() {
        this.count += 1;
    }
}
