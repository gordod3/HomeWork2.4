public class Main {

    private static Runner[] runners(){
        Runner runners[] = new Runner[5];
        for (int i = 0; i < runners.length; i++) {
            runners[i] = new Runner();
            runners[i].setName(runners[i].getClass().getSimpleName() + " №" + (i + 1));
        }
        return runners;
    }

    public static Runner runners[] = runners();

    public static boolean side = false;

    public static void main(String[] args) {
        runners[0].start();
    }
}
