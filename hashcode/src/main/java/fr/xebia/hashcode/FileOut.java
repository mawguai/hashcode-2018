package fr.xebia.hashcode;

import fr.xebia.hashcode.model.Vehicle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class FileOut {

    public static void generateFileOut(List<Vehicle> vehicles, String filePath) {
        StringBuilder result = new StringBuilder();
        for (Vehicle v : vehicles) {
            result.append(v.getTreatedRides().size());

            if (v.getTreatedRides().size() > 0) {
                result.append(" ");

                for (int i = 0; i < v.getTreatedRides().size(); i++) {
                    result.append(v.getTreatedRides().get(i).getId());

                    if (i < v.getTreatedRides().size() - 1) {
                        result.append(" ");
                    } else {
                        result.append("\n");
                    }
                }
                } else {
                result.append("\n");
            }
        }

        FileOutputStream fop;
        File file;

        System.out.println("Result :");
        System.out.println(result);

        try {
            file = new File(filePath);
            fop = new FileOutputStream(file);

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            // get the content in bytes
            byte[] contentInBytes = result.toString().getBytes();

            fop.write(contentInBytes);
            fop.flush();
            fop.close();

            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
