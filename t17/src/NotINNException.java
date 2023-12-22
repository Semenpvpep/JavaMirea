public class NotINNException extends Exception{
    public NotINNException(String name, int INN){
        super("Имя: " + name + "\nИНН: " + INN + "\nНе найден");
    }
}