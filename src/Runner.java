public class Runner extends Thread {
    public synchronized void running1(){
        System.out.println(getName() + " - берет палку.\n" + getName() + " - бежит к " + Main.runners[1].getName() + ".");
        Main.runners[1].start();
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            wait(1000);
            System.out.println(".");
            wait(1000);
            System.out.println(".");
            wait(1000);
            System.out.println(".");
            wait(1000);
            System.out.println(".");
            wait(1000);
            System.out.println(".");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " - берет палку.");
    }
    public synchronized void running2(int komy){
        try {
            wait(1000);
            System.out.println(".");
            wait(1000);
            System.out.println(".");
            wait(1000);
            System.out.println(".");
            wait(1000);
            System.out.println(".");
            wait(1000);
            System.out.println(".");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " - берет палку.\n" + getName() + " - бежит к " + Main.runners[komy - 1].getName() + ".");
        Main.runners[komy-1].start();
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            wait(1000);
            System.out.println(".");
            wait(1000);
            System.out.println(".");
            wait(1000);
            System.out.println(".");
            wait(1000);
            System.out.println(".");
            wait(1000);
            System.out.println(".");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " - берет палку.\n" + getName() + " - бежит к " + Main.runners[komy - 3].getName() + ".");
        synchronized (Main.runners[komy - 3]) {
            Main.runners[komy - 3].notify();
        }
    }
    public synchronized void running3(){
        try {
            wait(1000);
            System.out.println(".");
            wait(1000);
            System.out.println(".");
            wait(1000);
            System.out.println(".");
            wait(1000);
            System.out.println(".");
            wait(1000);
            System.out.println(".");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " - берет палку.\n" + getName() + " - бежит к " + Main.runners[3].getName() + ".");
        synchronized (Main.runners[3]) {
            Main.runners[3].notify();
        }
    }
    @Override
    public void run() {
        switch (getName()){
            case "Runner №1":
                running1();
                break;
            case "Runner №2":
                running2(3);
                break;
            case "Runner №3":
                running2(4);
                break;
            case "Runner №4":
                running2(5);
                break;
            case "Runner №5":
                running3();
                break;
    }
}
}
