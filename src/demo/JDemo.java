package demo;

public class JDemo {


    private static JDemo instance;

    public static JDemo getInstance(){
        return new JDemo();
    }

    public static void main(String[] args) {

        JMovie jMovie = new JMovie("abc",10);
        KMovie kMovie = new KMovie("xyz",10);
        kMovie.getName();
        jMovie.setId(10);

    }

}
