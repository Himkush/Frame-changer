package Himanshu1;

public class Demo {
    public static void main(String[] args) {
        CreateNewFrame f1 = new CreateNewFrame();
        CreateNewFrame f2 = new CreateNewFrame();
        f1.setSibling(f2);
        f1.setVisible(true);
        f2.setVisible(true);
    }
}
