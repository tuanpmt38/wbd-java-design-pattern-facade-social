public class Twitter implements Social {
    String message;

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("Sharing twitter:" + this.message);
    }
}
