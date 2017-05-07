package lab1;


import java.io.FileNotFoundException;
import java.io.IOException;

public interface Methods {
    void createDataBase() throws IOException;
    void modifyDB(Model model) throws IOException;
    void deleteFromDB(int id) throws IOException;
    void insertToDB(Model model, int count) throws IOException;
    void groupMethods(Model model) throws IOException;
    void groupMethodsOperation(Model model) throws IOException;
    void createGroupFile() throws IOException;
    void deleteFromGroup(int id) throws IOException;
    

}
