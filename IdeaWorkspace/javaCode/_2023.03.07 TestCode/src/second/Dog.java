package second;

/**
 * Author：NickWiber(陈志强)
 * Package：second
 * Project：JAVA
 * name：Dog
 * Date：2023/3/7
 * Filename：Dog
 */
public class Dog extends Animal{
    private String category;

    public Dog(String category) {
        this.category = category;
    }

    public Dog(String name, String category) {
        super(name);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Dog() {
    }
}
