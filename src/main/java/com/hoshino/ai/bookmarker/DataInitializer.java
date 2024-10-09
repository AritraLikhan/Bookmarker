package com.hoshino.ai.bookmarker;

import com.hoshino.ai.bookmarker.domain.Bookmark;
import com.hoshino.ai.bookmarker.domain.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
    private final BookmarkRepository repository;

    @Override
    public void run(String... args)
        throws Exception{
        repository.save(new Bookmark(null,"Sivalabs","https://www.google.com", Instant.now()));
        repository.save(new Bookmark(null,"Alibaba","https://www.alibaba.com", Instant.now()));
        repository.save(new Bookmark(null,"Sivalabs","https://www.google.com", Instant.now()));
        repository.save(new Bookmark(null,"Alibaba","https://www.alibaba.com", Instant.now()));
        repository.save(new Bookmark(null,"Sivalabs","https://www.google.com", Instant.now()));
        repository.save(new Bookmark(null,"Alibaba","https://www.alibaba.com", Instant.now()));
        repository.save(new Bookmark(null,"Sivalabs","https://www.google.com", Instant.now()));
        repository.save(new Bookmark(null,"Alibaba","https://www.alibaba.com", Instant.now()));


    }

}
