package com.nhnacademy.repository;

import com.nhnacademy.board.Post;
import java.util.List;

public interface PostRepository {
    long register(Post post);
    void modify(Post post , long id);
    Post remove(long id);
    Post getPost(long id);
    List<Post> getPosts();
}