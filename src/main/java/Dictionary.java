/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MimiHMB
 */
import java.util.ArrayList;

public class Dictionary {
    private ArrayList<Bird> list_;
    
    public Dictionary() {
        this.list_ = new ArrayList<>();
    }
    
    public void add(Bird bird) {
        this.list_.add(bird);
    }
    
    
    public ArrayList<Bird> getList () {
        return this.list_;
    }
}
