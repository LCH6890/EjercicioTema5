package Interfaz;

public class Main {

    static cocheCRUD cocheCRUD;

    public static void main(String[] args) {

        CocheCRUDimpl cocheCRUDimpl = new CocheCRUDimpl();

        cocheCRUD.findAll();
        cocheCRUD.save();
        cocheCRUD.delete();
    }
}
