public class DoublePrinter {

    public DoublePrinter(Double thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    Double thingToPrint;

    public void print(){
        System.out.println(thingToPrint);
    }
}
