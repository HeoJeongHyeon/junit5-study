package heo.junit5study.post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public PostDto createPost(PostDto postDto) {
        return PostDto.from(postRepository.save(postDto.toEntity()));
    }

}
