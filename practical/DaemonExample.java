class DaemonExample extends Thread {
public void run() {
if (Thread.currentThread().isDaemon()) {
System.out.println(Thread.currentThread().getName());
System.out.println("I am Daemon");
} else {
System.out.println("I am user");
}
}
public static void main(String[] args) {
DaemonExample t = new DaemonExample();
DaemonExample t1 = new DaemonExample();
DaemonExample t2 = new DaemonExample();
	
t1.setDaemon(true);
t.start();
t1.start();
t2.start();
}
}