public class Main {
  public static void main(String[] args) {
    System.out.println("Aguarde 5 segundos para iniciar o programa...");
    setTimeout(() -> System.out.println("Olá Esteves Jobs"), 5000);
  }

  public static void setTimeout(Runnable runnable, int delay){
    new Thread(() -> {
        try {
            Thread.sleep(delay);
            runnable.run();
        }
        catch (Exception e){
            System.err.println(e);
        }
    }).start();
}
}