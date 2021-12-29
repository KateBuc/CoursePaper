package derivative;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Do {
    private Map<String,Command>items;

    public Do(){
        items = new HashMap<>();

        items.put("create",new CreateCommand());
        items.put("find",new FindCommand());
        items.put("price",new PriceCommand());
        items.put("sort",new SortCommand());


    }


}
