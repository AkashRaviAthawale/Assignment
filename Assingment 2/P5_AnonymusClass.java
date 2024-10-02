public class P5_AnonymusClass {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {

            public void run() {

                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                }

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        });

        // start the thread

        thread.start();

    }

}
