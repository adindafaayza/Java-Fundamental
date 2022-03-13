public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        menu.tampilMenuMakanan();

        menu.pesanMakanan("Molen",2);
        menu.pesanMakanan("Bala-Bala", 5);
        menu.pesanMakanan("Tahu", 3);
        menu.pesanMakanan("Gehu",3);
        
        
        System.out.println("");
        menu.tampilMenuMakanan();
        
    }
}

