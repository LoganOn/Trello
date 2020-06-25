package model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Task{

    @Id
    @Column(name = "TaskID")
    public Long taskId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "BoardID")
    public Board board;

    @Column(name = "Title")
    public String title;

    @Column(name = "Description", length = 1000)
    public String description;

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", board=" + board +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
