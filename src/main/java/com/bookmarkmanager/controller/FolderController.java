package com.bookmarkmanager.controller;

import com.bookmarkmanager.model.Bookmark;
import com.bookmarkmanager.model.Folder;
import com.bookmarkmanager.service.FolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/folders")
public class FolderController {

    @Autowired
    private FolderService folderService = FolderService.getInstance();

    @GetMapping
    public List<Folder> getAllFolders() {
        return folderService.getAllFolders();
    }

    @PostMapping
    public Folder createFolder(@RequestBody Folder folder) {
        return folderService.createFolder(folder);
    }

    @PutMapping("/{id}")
    public Folder updateFolder(@PathVariable Long id, @RequestBody Folder folder) {
        folder.setId(id);
        return folderService.updateFolder(folder);
    }

    @DeleteMapping("/{id}")
    public void deleteFolder(@PathVariable Long id) {
        folderService.deleteFolder(id);
    }

    @GetMapping("/{id}")
    public Folder getFolderById(@PathVariable Long id) {
        return folderService.getFolderById(id);
    }


    @GetMapping("/{userId}/shared-folders")
    public List<Folder> getSharedFolders(@PathVariable Long userId) {
        return folderService.getSharedFolders(userId);
    }
    @PostMapping("/{userId}/shared-folders")
    public Folder shareFolder(@PathVariable Long userId, @RequestBody Folder folder) {
        return folderService.shareFolder(userId, folder);
    }

    @DeleteMapping("/{userId}/shared-folders/{folderId}")
    public void unShareFolder(@PathVariable Long userId, @PathVariable Long folderId) {
        folderService.unShareFolder(userId, folderId);
    }

    @GetMapping("/{folderId}/bookmarks")
    public List<Bookmark> getBookmarks(@PathVariable Long folderId) {
        return folderService.getBookmarksById(folderId);
    }

    @PostMapping("/{folderId}/bookmarks")
    public Bookmark addBookmark(@PathVariable Long folderId, @RequestBody Bookmark bookmark) {
        return folderService.addBookmarkById(folderId, bookmark);
    }

    @DeleteMapping("/{folderId}/bookmarks/{bookmarkId}")
    public void removeBookmark(@PathVariable Long folderId, @PathVariable Long bookmarkId) {
        folderService.removeBookmarkById(folderId, bookmarkId);
    }
}

