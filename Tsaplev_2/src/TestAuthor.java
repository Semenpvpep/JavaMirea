public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("Tsaplev Semen","tsaplev.semen@gmail.com", 'M');
        System.out.println(a);
        a.setEmail("xxxxxxxxxx@gmail.com");
        System.out.println(a);
    }
}
