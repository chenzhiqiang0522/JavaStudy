package forth;

import java.io.File;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Author：NickWiber(陈志强)
 * Package：forth
 * Project：JAVA
 * name：Search
 * Date：2023/3/7
 * Filename：Search
 */
public class Search {
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Search() {
    }

    public Search(String path) {
        this.path = path;
    }

    public void seachFile(){
        File file = new File(path);
        String[] list = file.list();
        Stream<String> stream = Arrays.stream(list);
        stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if (s.endsWith(".avi"))
                    return true;
                return false;
            }
        }).forEach(System.out::println);
    }
}
