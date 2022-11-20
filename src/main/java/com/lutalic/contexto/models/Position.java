package com.lutalic.contexto.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "positions")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "position")
    private int position;

    @OneToMany(mappedBy = "position", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<LevelWordPositionLink> links;

    public Position() {

    }

    public Position(int position) {
        this.position = position;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
