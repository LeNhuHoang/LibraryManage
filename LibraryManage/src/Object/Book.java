/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object;

/**
 *
 * @author PS23303_Trung
 */
public class Book {

    private String id,name, author, type;
    private int amount;
    private String description;

    public Book(){
        
    }
    
    public Book(String id,String name, String author, String type, String description, int amount) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.type = type;
        this.amount = amount;
        this.description = description;
        
    }
    
    public String getID(){
        return id;
    }
    
    public void setID(String id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
