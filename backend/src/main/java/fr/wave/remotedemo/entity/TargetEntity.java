package fr.wave.remotedemo.entity;

import fr.wave.remotedemo.enums.Event;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "targets")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TargetEntity {
    private int time;
    private LocalDate date;

    private Long competitionId;

    private Long competitorId;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    @JoinColumn(name = "targetId")
    private Set<ImpactEntity> impacts;


    private String pictureId;

    private Event event;
}
