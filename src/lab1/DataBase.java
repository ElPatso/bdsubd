package lab1;


import java.io.*;
import java.util.Scanner;

public class DataBase implements Methods {
    File file = new File("database");
    Model model = new Model();
    File f = new File("group");
    public void createDataBase() throws IOException {

        file.createNewFile();

    }

    public void modifyDB(Model model) throws IOException {
        File file2 = new File("database2");
        file2.createNewFile();
        FileWriter fr = new FileWriter(file2, true);
        BufferedWriter br = new BufferedWriter(fr);
        Scanner scanner = new Scanner(file.getAbsoluteFile());
        String text = null;
        int number = 0;
        try {
            while(scanner.hasNext()){
                number = scanner.nextInt();
                text = scanner.nextLine();
                if (number == model.getID()){
                       br.write(
                            model.getID()+"\t\t\t"
                            +model.getName()+"\t\t\t"
                            +model.getNumberMaker()+"\t\t\t"
                            +model.getMaker()+"\t\t\t"
                            +model.getSernameMaker()+"\t\t\t"
                            +model.getNameMaker()+"\t\t\t"
                            +model.getfMaker()+"\t\t\t"
                            +model.getCityIndex()+"\t\t\t"
                            +model.getCityMaker()+"\t\t\t"                                 
                            +model.getCount());
                     br.newLine();
                    continue;
                }
                br.write(number + text);
                br.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        scanner.close();
        file.delete();
        file2.renameTo(new File("database"));

    }
    
    public void deleteFromDB(int deleteID) throws IOException {
        File file2 = new File("database2");
        file2.createNewFile();
        FileWriter fr = new FileWriter(file2, true);
        BufferedWriter br = new BufferedWriter(fr);
        Scanner scanner = new Scanner(file.getAbsoluteFile());
        String text = null;
        int number = 0;
        try {

            while(scanner.hasNext()){
                number = scanner.nextInt();
                text = scanner.nextLine();
                if (number == deleteID) continue;
                br.write(number + text);
                br.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        scanner.close();
        file.delete();
        file2.renameTo(new File("database"));

    }

    public void insertToDB(Model model,int count) throws IOException {
        File file2 = new File("database2");
        file2.createNewFile();
        FileWriter fr = new FileWriter(file2, true);
        BufferedWriter br = new BufferedWriter(fr);
        Scanner scanner = new Scanner(file.getAbsoluteFile());
        String text = null;
        try {
            for (int i = 0; i < count; i++) {
                text = scanner.nextLine();
                br.write(text);
                br.newLine();
            }
            br.write(
                            model.getID()+"\t\t\t"
                            +model.getName()+"\t\t\t"
                            +model.getNumberMaker()+"\t\t\t"
                            +model.getMaker()+"\t\t\t"
                            +model.getSernameMaker()+"\t\t\t"
                            +model.getNameMaker()+"\t\t\t"
                            +model.getfMaker()+"\t\t\t"
                            +model.getCityIndex()+"\t\t\t"
                            +model.getCityMaker()+"\t\t\t"                                 
                            +model.getCount());
            br.newLine();
            while(scanner.hasNext()){
                text = scanner.nextLine();
                br.write(text);
                br.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        scanner.close();
        file.delete();
        file2.renameTo(new File("database"));

    }
        
    public void groupMethods(Model model) throws IOException {
       int id = 0,count=0, operation = 0;
       
        Scanner scanner = new Scanner(f.getAbsoluteFile());
        while (scanner.hasNext()) {
            id = scanner.nextInt();
            operation = scanner.nextInt();
            scanner.nextLine();
            if (id == model.getID() && operation<=model.getOperation() ) {
                scanner.close();
                groupMethodsOperation(model);
                return;
            }
            else if (id == model.getID() && operation>model.getOperation() ){
                scanner.close();
                return;
            }
            else if(id<model.getID()) count++;
        }
        System.out.println(count);
        scanner.close();
        Scanner scanner2 = new Scanner(f.getAbsoluteFile());
        File file2 = new File("group2");
        file2.createNewFile();
        FileWriter fr = new FileWriter(file2, true);
        BufferedWriter br = new BufferedWriter(fr);
        String text = null;
        try {
            for (int i = 0; i < count; i++) {
                text = scanner2.nextLine();
                br.write(text);
                br.newLine();
            }
             br.write(
                            model.getID()+"\t\t\t"
                            +model.getOperation()+"\t\t\t"
                            +model.getName()+"\t\t\t"
                            +model.getNumberMaker()+"\t\t\t"
                            +model.getMaker()+"\t\t\t"
                            +model.getSernameMaker()+"\t\t\t"
                            +model.getNameMaker()+"\t\t\t"
                            +model.getfMaker()+"\t\t\t"
                            +model.getCityIndex()+"\t\t\t"
                            +model.getCityMaker()+"\t\t\t"
                            
                            +model.getCount());
                            
             br.newLine();
            while(scanner2.hasNext()){
                text = scanner2.nextLine();
                br.write(text);
                br.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        scanner2.close();
        f.delete();
        file2.renameTo(new File("group"));
      
    }

    public void groupMethodsOperation(Model model)throws IOException {
             File file2 = new File("group2");
        file2.createNewFile();
        FileWriter fr = new FileWriter(file2, true);
        BufferedWriter br = new BufferedWriter(fr);
        Scanner scanner = new Scanner(f.getAbsoluteFile());
        String text = null;
        int number = 0;
        try {
            while(scanner.hasNext()){
                number = scanner.nextInt();
                text = scanner.nextLine();
                if (number == model.getID()){
                    br.write(
                            model.getID()+"\t\t\t"
                            +model.getOperation()+"\t\t\t"
                            +model.getName()+"\t\t\t"
                            +model.getNumberMaker()+"\t\t\t"
                            +model.getMaker()+"\t\t\t"
                            +model.getSernameMaker()+"\t\t\t"
                            +model.getNameMaker()+"\t\t\t"
                            +model.getfMaker()+"\t\t\t"
                            +model.getCityIndex()+"\t\t\t"
                            +model.getCityMaker()+"\t\t\t"
                            
                            +model.getCount());
                    br.newLine();
                    continue;
                }
                br.write(number + text);
                br.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        scanner.close();
        f.delete();
        file2.renameTo(new File("group"));
    }

    public void createGroupFile() throws IOException {

        f.createNewFile();
    }


    public void insert(Model model) throws IOException {
        
        Scanner sc = new Scanner(file.getAbsoluteFile());
        int id = 0,count=0 ;
        
            while (sc.hasNext()) {
                id = sc.nextInt();
                sc.nextLine();
                if (id == model.getID()) {
                    System.out.println("Error");
                    sc.close();
                    return;
                }
                else if(id<model.getID()) count++;
            }
        sc.close();
        
        insertToDB(model,count);
    }
   
    
    String readGroup() throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(f.getAbsoluteFile());
        while (scanner.hasNext()) {
            model.setID(scanner.nextInt());
            model.setOperation(scanner.nextInt());
            model.setName(scanner.next());
            model.setMaker(scanner.next());
            model.setNameMaker(scanner.next());
            model.setfMaker(scanner.next());
            model.setSernameMaker(scanner.next());
            model.setCityMaker(scanner.next());
            model.setCityIndex(scanner.nextInt());
            model.setNumberMaker(scanner.next());
            model.setCount(scanner.nextInt());
            
            sb.append(model.toString()+"\n");
        }
        scanner.close();
        return sb.toString();
        
    }

    void apply() throws IOException{
        Scanner scanner = new Scanner(f.getAbsoluteFile());
         while (scanner.hasNext()) {
            model.setID(scanner.nextInt());
            model.setOperation(scanner.nextInt());
            model.setName(scanner.next());
            model.setNumberMaker(scanner.next());
            model.setMaker(scanner.next());
            model.setSernameMaker(scanner.next());
            model.setNameMaker(scanner.next());
            model.setfMaker(scanner.next());
            model.setCityIndex(scanner.nextInt());
            model.setCityMaker(scanner.next());
            model.setCount(scanner.nextInt());
            
         
        switch(model.getOperation()){
            case 1:
                
                insert(model); break;
            case 2:
                
                modifyDB(model); break;
            case 3: 
                
                deleteFromDB(model.getID()); break;
              }
         }
         scanner.close();
    }


    String readBD() throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(file.getAbsoluteFile());
        while (scanner.hasNext()) {
           model.setID(scanner.nextInt());
            model.setName(scanner.next());
            model.setNumberMaker(scanner.next());
            model.setMaker(scanner.next());
            model.setSernameMaker(scanner.next());
            model.setNameMaker(scanner.next());
            model.setfMaker(scanner.next());
            model.setCityIndex(scanner.nextInt());
            model.setCityMaker(scanner.next());
            model.setCount(scanner.nextInt());
            
            sb.append(model.toString2()+"\n");
        }
        scanner.close();
        return sb.toString();
    }
    public String Serach(int id,String name, String maker, String nameMaker, String sernameMaker, String fMaker,String cityMaker, String numberMaker ) throws FileNotFoundException{
        Scanner scanner = new Scanner(file.getAbsoluteFile());
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNext()) {
            model.setID(scanner.nextInt());
            model.setName(scanner.next());
            model.setMaker(scanner.next());
            model.setNameMaker(scanner.next());
            model.setfMaker(scanner.next());
            model.setSernameMaker(scanner.next());
            model.setCityMaker(scanner.next());
            model.setCityIndex(scanner.nextInt());
            model.setNumberMaker(scanner.next());
            model.setCount(scanner.nextInt());
            if (model.getID()==id || model.getName().equals(name) || model.getMaker().equals(maker) ||
                    model.getNameMaker().equals(nameMaker) || model.getfMaker().equals(fMaker) || 
                    model.getSernameMaker().equals(sernameMaker) || model.getCityMaker().equals(cityMaker) ||
                    model.getNumberMaker().equals(numberMaker))
                
           sb.append(model.toString2()+"\n");
        }
        scanner.close();
        return sb.toString();
    }
        public String SerachGroup(int id,String name, String maker, String nameMaker, String sernameMaker, String fMaker,String cityMaker, String numberMaker ) throws FileNotFoundException{
        Scanner scanner = new Scanner(f.getAbsoluteFile());
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNext()) {
           model.setID(scanner.nextInt());
            model.setOperation(scanner.nextInt());
            model.setName(scanner.next());
            model.setNumberMaker(scanner.next());
            model.setMaker(scanner.next());
            model.setSernameMaker(scanner.next());
            model.setNameMaker(scanner.next());
            model.setfMaker(scanner.next());
            model.setCityIndex(scanner.nextInt());
            model.setCityMaker(scanner.next());
            model.setCount(scanner.nextInt());
            if (model.getID()==id || model.getName().equals(name) || model.getMaker().equals(maker) ||
                    model.getNameMaker().equals(nameMaker) || model.getfMaker().equals(fMaker) || 
                    model.getSernameMaker().equals(sernameMaker) || model.getCityMaker().equals(cityMaker) ||
                    model.getNumberMaker().equals(numberMaker))
                
           sb.append(model.toString()+"\n");
        }
        scanner.close();
        return sb.toString();
    }

    public void deleteFromGroup(int deleteID) throws IOException {
      File file2 = new File("group2");
        file2.createNewFile();
        FileWriter fr = new FileWriter(file2, true);
        BufferedWriter br = new BufferedWriter(fr);
        Scanner scanner = new Scanner(f.getAbsoluteFile());
        String text = null;
        int number = 0;
        try {

            while(scanner.hasNext()){
                number = scanner.nextInt();
                text = scanner.nextLine();
                if (number == deleteID) continue;
                br.write(number + text);
                br.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        scanner.close();
        f.delete();
        file2.renameTo(new File("group"));
    }

   

}