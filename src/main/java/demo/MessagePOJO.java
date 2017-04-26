package demo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by bipin on 4/25/2017.
 */
@Entity
public class MessagePOJO implements Serializable{

    @Transient
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    String name;
    String status;

    public MessagePOJO() {
    }

    public MessagePOJO(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MessagePOJO{" +
                "id=" + id +
                ", version=" + version +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
