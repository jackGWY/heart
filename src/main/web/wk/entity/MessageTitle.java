package wk.entity;

import java.io.Serializable;

public class MessageTitle implements Serializable {
    private String title;
    private String owner;

    public MessageTitle(String title, String owner) {
        this.title = title;
        this.owner = owner;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
