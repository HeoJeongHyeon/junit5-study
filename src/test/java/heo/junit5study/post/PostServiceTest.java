package heo.junit5study.post;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PostServiceTest {

    @InjectMocks
    private PostService postService;

    @Mock
    private PostRepository postRepository;

    @Test
    @DisplayName("게시글 생성 서비스 테스트")
    void createPostTest() {
        //given
        PostDto postDto = new PostDto(1L, "serviceTest", "Testing");
        Post post = postDto.toEntity();
        when(postRepository.save(any(Post.class))).thenReturn(post);

        //when
        PostDto createdPost = postService.createPost(postDto);

        //then
        assertEquals("serviceTest", createdPost.getTitle());
        verify(postRepository, times(1)).save(any(Post.class));
    }
}
