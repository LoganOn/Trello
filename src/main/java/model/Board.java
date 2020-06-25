package model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.*;
import org.jboss.resteasy.spi.touri.MappedBy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Board{

    @Id
    @Column(name = "BoardID")
    public Long boardId;

    @OneToMany(mappedBy = "board", fetch = FetchType.EAGER)
    public List<Task> task = new ArrayList<>();;

    @Column(name = "Title")
    public String title;

    @Column(name = "Position")
    @NotNull
    public int position;

    @Override
    public String toString() {
        return "Board{" +
                "boardId=" + boardId +
                ", task=" + task +
                ", title='" + title + '\'' +
                ", position=" + position +
                '}';
    }
}
