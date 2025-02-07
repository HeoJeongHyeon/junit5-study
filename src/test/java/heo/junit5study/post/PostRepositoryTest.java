package heo.junit5study.post;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class PostRepositoryTest {

    @Autowired
    private PostRepository postRepository;

    @Test
    @DisplayName("createPostTest")
    void savePostTest() {

        Post post = new Post("test1", "testing post");

        Post save = postRepository.save(post);

        assertNotNull(save.getId());
        assertEquals("test1", save.getTitle());
    }


}
