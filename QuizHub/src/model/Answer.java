package model;

import java.util.List;

/**
 *
 * @author ASUS
 */
public class Answer {
    private int id;
    private String text;
    private boolean isCorrect;
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getText(String text){
        return this.text;
    }
    
    public void setText(String text){
        this.text = text;
    }
    
    public boolean getIsCorrect(){
        return this.isCorrect;
    }
    
    public void setIsCorrect(boolean isCorrect){
        this.isCorrect = isCorrect;
    }
}
