package optional;

import java.util.Optional;

public class of_empty_ofNullable {

    public static Optional<String> ofNullable(){
     //   return Optional.ofNullable("Hello");
        return Optional.ofNullable(null);
    }

    public static Optional<String> of(){
        return Optional.of("Hello");
       // return Optional.of(null);
    }

    public static Optional<String> empty(){
        return Optional.empty();
    }

    public static void main(String[] args) {
        System.out.println("ofNullable: "+ ofNullable());
        System.out.println("of: "+ of());
        System.out.println("empty: "+ empty());
    }
}
