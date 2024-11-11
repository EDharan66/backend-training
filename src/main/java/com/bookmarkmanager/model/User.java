package com.bookmarkmanager.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @OneToMany(mappedBy = "user")
    private List<Bookmark> bookmarks;

    @ManyToMany(mappedBy = "sharedWith")
    private List<Folder> sharedFolders;

    public List<Folder> getSharedBookmarks() {
        return null;
    }

    public List<Folder> getFolder() {
        return null;
    }
}
