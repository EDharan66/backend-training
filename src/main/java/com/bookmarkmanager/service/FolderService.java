package com.bookmarkmanager.service;

import com.bookmarkmanager.model.Bookmark;
import com.bookmarkmanager.model.Folder;

import java.util.List;

public class FolderService {

    private static FolderService instance = new FolderService();

    private FolderService() {
    }

    public static FolderService getInstance() {
        return instance;
    }

    public Folder createFolder(Folder folder) {
        // Create a new folder
        return null;
    }

    public Folder updateFolder(Folder folder) {
        // Update a folder
        return null;
    }

    public void deleteFolder(Long id) {
        // Delete a folder
    }

    public void getFolder() {
        // Get a folder
    }

    public List<Folder> getAllFolders() {
        // Get all folders
        return null;
    }

    // create necessary bookmark folder methods
    public List<Folder> getSharedFolders(Long userId) {
        // Get shared folders
        return null;
    }

    public void getSharedBookmarks() {
        // Get shared bookmarks
    }

    public Folder shareFolder(Long userId, Folder folder) {
        // Share a folder
        return folder;
    }


    public void unShareFolder(Long userId, Long folderId) {
        // UnShare a folder

    }

    public List<Bookmark> getBookmarksById(Long folderId) {
        // Get bookmarks by folder id
        return null;
    }

    public Bookmark addBookmarkById(Long folderId, Bookmark bookmark) {
        return null;
    }

    public Folder getFolderById(Long id) {
        return null;
    }

    public void removeBookmarkById(Long folderId, Long bookmarkId) {
        // Remove bookmark by id
    }
}
