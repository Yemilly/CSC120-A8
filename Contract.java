
public interface Contract {

    void grab(String item);
    String drop(String item);
    void examine(String item);
    void use(String item);
    boolean walk(String direction);
    void fly();
    Number shrink();
    Number grow();
    void rest();
    void undo();

}