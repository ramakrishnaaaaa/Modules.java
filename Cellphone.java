class Cellphone {

    void ring() {
        System.out.println("Ringing...");
    }

    void vibrate() {
        System.out.println("Vibrating...");
    }

    void callFriend() {
        System.out.println("Calling friend...");
    }

    void sendMessage() {
        System.out.println("Sending message...");
    }
}

class CellphoneTest {
    public static void main(String[] args) {

        Cellphone c = new Cellphone();
        c.ring();
        c.vibrate();
        c.callFriend();
        c.sendMessage();
    }
}
