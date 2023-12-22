public class ThrowsDemo1 {
    public void getDetails(String key) {
        try{
        if(key == null) {
            throw new NullPointerException("null key in getDetails" );
        }}
        catch (NullPointerException e){System.out.println(e.getMessage());}
    }

    public static void main(String[] args) {
        new ThrowsDemo1().getDetails(null);
    }
}
