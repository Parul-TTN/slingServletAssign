package org.example.pojos;

import java.util.Date;

public class Blog {
    String title;
    String content;
    Date creationDate;

    public Blog(String title, String content, Date creationDate) {
        this.title = title;
        this.content = content;
        this.creationDate = creationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Blog [title=" + title + ", content=" + content + ", creationDate=" + creationDate + "]";
    }
}
