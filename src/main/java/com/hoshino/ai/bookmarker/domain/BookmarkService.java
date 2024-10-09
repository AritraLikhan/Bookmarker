package com.hoshino.ai.bookmarker.domain;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {
  private final BookmarkRepository repository;


//  public List<Bookmark> getBookmarks(Integer page)
//  {
//      int pageNo = page < 1 ? 0 : page - 1;
//      PageRequest pageable = PageRequest.of(pageNo, 3, Sort.Direction.DESC, "createdAt");
//      return repository.findAll(pageable).getContent();
//  }


    public BookmarksDTO getBookmarks(Integer page)
  {
      int pageNo = page < 1 ? 0 : page - 1;
      Pageable pageable= PageRequest.of(pageNo, 3, Sort.Direction.DESC, "createdAt");
      return new BookmarksDTO(repository.findAll(pageable));
  }

}
