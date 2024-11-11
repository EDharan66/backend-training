package com.bookmarkmanager.service;

import com.bookmarkmanager.model.Bookmark;

import java.util.List;

public class BookmarkService {

    private static BookmarkService instance = new BookmarkService();

    private BookmarkService() {
    }

    public static BookmarkService getInstance() {
        return instance;
    }

    public List<Bookmark> findAll() {
        // TODO: implement
        return null;
    }

    public Bookmark findById(Long id) {
        // TODO: find bookmark by id
        return null;
    }

    public Bookmark save(Bookmark bookmark) {
        // TODO: save bookmark
        return null;
    }

    public void deleteById(Long id) {
        //TODO: delete bookmark by id
    }

}
