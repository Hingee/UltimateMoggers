package PIP_Client.src;

public class RecieverThread implements Runnable{
    private ConnectionHandler handle;

    public RecieverThread(ConnectionHandler handle) {
        this.handle = handle;
    }

    @Override
    public void run() {
        while(true) {
            handle.recievePacketAsync();
        }
    }
    
}
