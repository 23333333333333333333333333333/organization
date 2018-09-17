package com.mengyunzhi.organization.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class WebAdministrator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @OneToMany
    List<WebDocument> webDocumentList;
    @OneToOne
    User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WebDocument> getWebDocumentList() {
        return webDocumentList;
    }

    public void setWebDocumentList(List<WebDocument> webDocumentList) {
        this.webDocumentList = webDocumentList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
