import java.util.Date;

public class Message {
    private int leftNodes;
    private Date date;

    public Message(int leftNodes) {
        this.leftNodes = leftNodes;
        this.date = new Date();
    }

    public synchronized void decreaseLeftNodes() {
        this.leftNodes--;
    }

    public boolean isFinished() {
        return leftNodes <= 0;
    }

    public Date getDate() {
        return date;
    }
}