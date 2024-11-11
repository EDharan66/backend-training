package com.bookmarkmanager.controller;

import com.bookmarkmanager.model.Bookmark;
import com.bookmarkmanager.service.BookmarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/bookmarks")
public class BookmarkController {

    @Autowired
    private BookmarkService bookmarkService = BookmarkService.getInstance();

    @GetMapping
    public List<Bookmark> getAllBookmarks() {
        return bookmarkService.findAll();
    }

    @PostMapping
    public Bookmark createBookmark(@RequestBody Bookmark bookmark) {
        return bookmarkService.save(bookmark);
    }

    @PutMapping("/{id}")
    public Bookmark updateBookmark(@PathVariable Long id, @RequestBody Bookmark bookmark) {
        bookmark.setId(id);
        return bookmarkService.save(bookmark);
    }

    @DeleteMapping("/{id}")
    public void deleteBookmark(@PathVariable Long id) {
        bookmarkService.deleteById(id);
    }

    @GetMapping("/{id}")
    public Bookmark getBookmarkById(@PathVariable Long id) {
        return bookmarkService.findById(id);
    }


}
