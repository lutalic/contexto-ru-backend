package com.lutalic.contexto.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "levels")
public class Level {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "level")
    private int level;

    @OneToMany(mappedBy = "level", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<LevelWordPositionLink> links;

    public Level() {

    }

    public Level(int level) {
        this.level = level;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
