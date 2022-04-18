package pub.app.src.dicontainer;

import java.util.HashMap;

//Класс отвечает за обработку конфигурации приложения в процессе работы

public class Bootstrap {
    private HashMap<String, HashMap> kernel=new HashMap<>();
    private HashMap<String,String> bootstrappers=new HashMap<>();
    private HashMap<String,String> middlewares=new HashMap<>();
    private HashMap<String,String> serviceProviders=new HashMap<>();
}
