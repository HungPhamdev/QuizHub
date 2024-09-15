package model;

import java.util.List;

/**
 *
 * @author ASUS
 */
public class Question {
    private int id;
    private String text;
    private List<Answer> answers;

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
    
    public List<Answer> getAnswers(){
        return this.answers;
    }
    
    public void setAnswers(List<Answer> answers){
        this.answers = answers;
    }
}
