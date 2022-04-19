/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author Manh
 */
public class IOFile {

    public static List<String> doc(String file) {
        List<String> list = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(file), StandardCharsets.UTF_8)) {//đưa về dạng chuẩn utf8
            stream.forEach(line -> {
                if ( line.length()>0)
                    list.add(line);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void viet(String file, List<String> list) throws FileNotFoundException, IOException {
        OutputStream outputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream,StandardCharsets.UTF_8);
        for (String item: list){
            outputStreamWriter.write(item);
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.flush();
    }
}
