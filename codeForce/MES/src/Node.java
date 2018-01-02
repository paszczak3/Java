public class Node {
    double x;
    private int status;

    public Node(double x, int status) {
        this.x = x;
        this.status = status;
    }

    public Node(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
