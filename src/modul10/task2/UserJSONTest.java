package modul10.task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserJSONTest {
    public static void main(String[] args) {
        File file = new File("file2.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String  line = br.readLine();
            List fullData = new ArrayList();

            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\s+");

                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                User user = new User(data[0],Integer.parseInt(data[1]) );
                fullData.add(gson.toJson(user));
            }
            System.out.println(fullData);
            File file3 = new File("user.json");
            try (FileWriter writer = new FileWriter(file3)) {

                writer.write(fullData.toString());
                writer.flush();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

