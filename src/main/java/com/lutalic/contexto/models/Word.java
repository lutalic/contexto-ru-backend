package com.lutalic.contexto.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "words")
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "word")
    private String word;

    @OneToMany(mappedBy = "word", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<LevelWordPositionLink> links;

    public Word() {

    }

    public Word(String word) {
        this.word = word;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
