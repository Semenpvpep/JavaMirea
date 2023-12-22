public class Client implements Chair {
    private Chair chair;

    public void sit(){
        System.out.println(chair.toString());
    }

    public void setChair(Chair chair){
        Client.chair = chair;
    }
}