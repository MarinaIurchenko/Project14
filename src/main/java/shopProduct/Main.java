package shopProduct;
public class Main {

    public static void main(String[] args){
        ShopRepository repo = new ShopRepository();

        try {
            //repo.remove(0);
            System.out.println("Ok");
        }catch (NotFoundException e){
            System.out.println("Error");
        }
    }

}
