package src.com.airtribe.learntrack.entity;

import java.util.Date;
import java.util.List;

public class Message {
    private String message;
    private Date publishedAt;
    private String publishedBy;
    private List<Batch> publishFor;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getPublishedBy() {
        return publishedBy;
    }

    public void setPublishedBy(String publishedBy) {
        this.publishedBy = publishedBy;
    }

    public List<Batch> getPublishFor() {
        return publishFor;
    }

    public void setPublishFor(List<Batch> publishFor) {
        this.publishFor = publishFor;
    }
}
