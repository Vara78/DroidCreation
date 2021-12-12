package pack;

public class Droid {

    // Data feild attributes
    String name;
    int batteryLevel;

    // Droid constructor
    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    // Task method
    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
        System.out.println("Battery levels drop 10%\n");
    }

    public int energyTransfer(int a, int b, int c) {
        a -= 10;
        System.out.println(a);
        return a;
    }

    public void energyReport() {
        System.out.println("Battery levels for " + name + " have a " + batteryLevel + "% charged! \n");
    }

    // Description of constructor
    public String toString() {

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("***********************************");
        System.out.println("*******      WARNING!!!     *******");
        System.out.println("*******    Droid Created    *******");
        System.out.println("***********************************");
        return "Hello, my droid name is " + name + ", and \nmy battery levels are " + batteryLevel + "% charged!\n";
    }

    // main method
    public static void main(String[] args) {
        Droid box = new Droid("Box");
        Droid boost = new Droid("boost");

        System.out.println(box);
        box.performTask("Jump");
        box.performTask("Dance");
        box.performTask("Fly");
        box.energyReport();

        System.out.println(boost);
    }
}
