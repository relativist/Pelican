package entities;

import javax.persistence.*;


@Entity
@Table(name = "daily_task")
public class DailyTask {
    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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

    public Integer getParentId() {
        return parentId;
    }

    public DailyTask() {

    }

    private String name;
    @Column(name = "user_id")
    private String userId;
    private Integer status;
    private Double score;
    @Column(name = "parent_id")
    private Integer parentId;


}
