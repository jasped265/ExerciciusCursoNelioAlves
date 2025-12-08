/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap12.entidade;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jaspe
 */
public class Post {
    private LocalDateTime moment;
    private String title;
    private String cotent;
    private Integer likes;
    int id;

    public Post(LocalDateTime moment, String title, String cotent, Integer likes, int id) {
        this.moment = moment;
        this.title = title;
        this.cotent = cotent;
        this.likes = likes;
        this.id = id;
    }
    
    private List<Comment> coments = new ArrayList<>();
    
    public Post(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
        public Post(LocalDateTime moment, String title, String cotent, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.cotent = cotent;
        this.likes = likes;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCotent() {
        return cotent;
    }

    public void setCotent(String cotent) {
        this.cotent = cotent;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComents() {
        return coments;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.title+ "\n");
        sb.append(this.likes+" - "+this.moment+"\n");
        sb.append(this.cotent+"\n");
        
        for(Comment c : this.getComents()){
            sb.append(c.getText());
        }
        return sb.toString();
    }
}
