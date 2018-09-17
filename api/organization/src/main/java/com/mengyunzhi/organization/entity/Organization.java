package com.mengyunzhi.organization.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @OneToOne
    User user;
    @OneToMany
    List<OrganizationMessage> organizationMessageList;
    @OneToMany
    List<OrganizationDocument> organizationDocumentList;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrganizationMessage> getOrganizationMessageList() {
        return organizationMessageList;
    }

    public void setOrganizationMessageList(List<OrganizationMessage> organizationMessageList) {
        this.organizationMessageList = organizationMessageList;
    }

    public List<OrganizationDocument> getOrganizationDocumentList() {
        return organizationDocumentList;
    }

    public void setOrganizationDocumentList(List<OrganizationDocument> organizationDocumentList) {
        this.organizationDocumentList = organizationDocumentList;
    }
}
