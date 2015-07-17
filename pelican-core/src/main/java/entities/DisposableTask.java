package entities;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "disposable_task")
public class DisposableTask {
    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(name = "user_id")
    private String userId;
    private Integer status;
    private Double score;
    @Column(name = "date_close")
    private Date dateClose;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void setDateClose(Date dateClose) {
        this.dateClose = dateClose;
    }

    public Integer getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public Integer getStatus() {
        return status;
    }

    public Double getScore() {
        return score;
    }

    public Date getDateClose() {
        return dateClose;
    }

    public DisposableTask() {

    }
}
