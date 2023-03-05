package Service.AdminService;
import java.util.List;

import Model.Toy;

public class AddedToy {
    
    CreateToy cToy = new CreateToy();

    //Добавление игрушки в список игрушек
    public void addedToy(List<Toy> listToys){
        listToys.add(cToy.newToy());
    }
}
