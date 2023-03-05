package Service.MachineService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import Model.Toy;

public class DownloadData {

    // загрузить сохранения из файлов
    public LinkedList<Toy> downloadListToysFromFile(String fileAddress) {
        LinkedList<Toy> listToys = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileAddress))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] country = line.split(";");
                Toy toy = new Toy();
                toy.setIdToy(Integer.parseInt(country[0]));
                toy.setNameToy(country[1]);
                toy.setAmountToys(Integer.parseInt(country[2]));
                toy.setWeightToy(Integer.parseInt(country[3]));
                listToys.add(toy);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return listToys;

    }

}
