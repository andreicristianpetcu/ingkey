package ro.ing.ingkey.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by HackathonING on 11/20/2015.
 */
@Entity
@Table(name="user")
public class IngUser implements Serializable{

    @Id
    @Column(name = "ing_id")
    private Long ingId;

    @Column
    private String username;

    @Column
    private String name;

    @Column
    private String token;

    public IngUser() {
    }

    public IngUser(long ingId, String username, String name, String token) {
        this.ingId = ingId;
        this.username = username;
        this.name = name;
        this.token = token;
    }

    public long getIngId() {
        return ingId;
    }

    public void setIngId(long ingId) {
        this.ingId = ingId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IngUser that = (IngUser) o;

        if (!username.equals(that.username)) return false;
        if (!name.equals(that.name)) return false;
        return token.equals(that.token);

    }

    @Override
    public int hashCode() {
        int result = username.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + token.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "IngUser{" +
            "ingId=" + ingId +
            ", username='" + username + '\'' +
            ", name='" + name + '\'' +
            ", token='" + token + '\'' +
            '}';
    }
}

