package hello.springmvc;

import lombok.Data;
import lombok.Getter;

//@Getter , @Setter , @ToString , @EqualsAndHashCode , @RequiredArgsConstructor
@Data
public class HelloData {

    private String username;
    private int age;

}
