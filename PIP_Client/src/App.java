package PIP_Client.src;

public class App {
    enum State {
        Initialize,
        Listen
    }

    private static ConnectionHandler cHandler;
    private static State state = State.Initialize;
    public static void main(String[] args) {
        cHandler = new ConnectionHandler();
        System.out.println("Initialize");
        cHandler.recievePacket();
        for (;;) {
            processControl();
        }
    }

    public static void processControl() {
        switch (state) {
            case Initialize:
                cHandler.sendPacket("INIT");
                state = State.Listen;
                break;
            case Listen:
                cHandler.recievePacket();
                break;
        }
    }
}
