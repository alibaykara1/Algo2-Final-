package Thread;

//Ana program
public class Main {
    public static void main(String[] args) {
        //Thread nesnesini oluşturuyoruz
        SayiciThread t1 = new SayiciThread();

        //Thread'i başlatıyoruz (DİKKAT run() değil start() kullanıyoruz)
        t1.start();
    }
}