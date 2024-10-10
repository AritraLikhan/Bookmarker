package com.hoshino.ai.bookmarker.api;

import com.hoshino.ai.bookmarker.domain.BookmarkService;
import com.hoshino.ai.bookmarker.domain.BookmarksDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {
    private final BookmarkService bookmarkService;

    @GetMapping
    public BookmarksDTO getBookmarks(@RequestParam(name="page",defaultValue = "1") Integer page){
        return bookmarkService.getBookmarks(page);
    }
}
