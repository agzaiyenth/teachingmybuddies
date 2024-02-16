public class Tickets {
    private String row;
    private int seat;
    private int price;
    private Person person;

    public Tickets(String row, int seat, int price, Person person) {
        this.row = row;
        this.seat = seat;
        this.price = price;
        this.person = person;
    }

    public void info(){
        System.out.println("Ticket info\nRow: "+row+"\nSeat no: "+seat);
        person.personinfo();
    }
}
