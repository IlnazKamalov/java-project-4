package hexlet.code.domain;

import io.ebean.Model;
import io.ebean.annotation.WhenCreated;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import java.time.Instant;

@Entity
public final class UrlCheck extends Model {
    @Id
    private long id;

    @Lob
    private String description;

    private String title;
    private String h1;

    @WhenCreated
    private Instant createdAt;

    private int statusCode;

    @ManyToOne
    private Url url;

    public UrlCheck(int statusCode, String title, String h1, String description, Url url) {
        this.statusCode = statusCode;
        this.title = title;
        this.h1 = h1;
        this.description = description;
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public String getH1() {
        return h1;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public Url getUrl() {
        return url;
    }
}
