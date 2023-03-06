package Service.AdminService;

import java.util.List;
import Model.Toy;

public class DeleteToy {

    // Удаление игрушки из списка игрушек
    public void delToy(List<Toy> listToys, int toyID) {

        int indexForDelete = 0;
        for (int i = 0; i < listToys.size(); i++) {
            if (listToys.get(i).getIdToy() == toyID) {
                indexForDelete = i;
                break;
            }
        }
        listToys.remove(indexForDelete);
        System.out.println("Позиция удалена!\n");
    }
}
