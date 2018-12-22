package wk.entity;

import java.io.Serializable;

public class MessageBoard implements Serializable{

    private String topicTitle;
    private String toppicOwner;
    private String comment;
    private String commentOwner;

    public MessageBoard(String topicTitle, String toppicOwner, String comment, String commentOwner) {
        this.topicTitle = topicTitle;
        this.toppicOwner = toppicOwner;
        this.comment = comment;
        this.commentOwner = commentOwner;
    }

    public String getTopicTitle() {
        return topicTitle;
    }

    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle;
    }

    public String getToppicOwner() {
        return toppicOwner;
    }

    public void setToppicOwner(String toppicOwner) {
        this.toppicOwner = toppicOwner;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCommentOwner() {
        return commentOwner;
    }

    public void setCommentOwner(String commentOwner) {
        this.commentOwner = commentOwner;
    }
}
