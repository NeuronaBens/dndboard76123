package com.dndboard.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Board {
    @Id
    private Integer id;
    @Column
    private String boardHTML;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getBoardHTML() {
        return boardHTML;
    }
    public void setBoardHTML(String boardHTML) {
        this.boardHTML = boardHTML;
    }
}
