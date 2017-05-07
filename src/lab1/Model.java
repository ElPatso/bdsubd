package lab1;


public class Model {
    public int ID;
    public String name;
    public String maker;
    public String nameMaker;
    public String sernameMaker;
    public String fMaker;
    public String cityMaker;
    public String numberMaker;
    public int cityIndex;
    public int count;
    public int operation;

    @Override
    public String toString() {
        return "" +
                "ID=" + ID +
                ", Виріб='" + name + '\'' +
                ", Назва=" + numberMaker +
                ", Виробник='" + maker + '\'' +
                ", Прізвище='" + sernameMaker + '\'' +
                ", Ім'я='" + nameMaker + '\'' +
                
                ", По-батькові='" + fMaker + '\'' +
                ", Місто='" + cityMaker + '\'' +
                
                ", Індекс=" + cityIndex +
                ", Кількість=" + count +
                ", Операція=" + operation;
                
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getNameMaker() {
        return nameMaker;
    }

    public void setNameMaker(String nameMaker) {
        this.nameMaker = nameMaker;
    }

    public String getSernameMaker() {
        return sernameMaker;
    }

    public void setSernameMaker(String sernameMaker) {
        this.sernameMaker = sernameMaker;
    }

    public String getfMaker() {
        return fMaker;
    }

    public void setfMaker(String fMaker) {
        this.fMaker = fMaker;
    }

    public String getCityMaker() {
        return cityMaker;
    }

    public void setCityMaker(String cityMaker) {
        this.cityMaker = cityMaker;
    }

    public String getNumberMaker() {
        return numberMaker;
    }

    public void setNumberMaker(String numberMaker) {
        this.numberMaker = numberMaker;
    }

    public int getCityIndex() {
        return cityIndex;
    }

    public void setCityIndex(int cityIndex) {
        this.cityIndex = cityIndex;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }
    public String toString2() {
        return "{" +
                "ID=" + ID +
                ", Виріб='" + name + '\'' +
                ", Назва=" + numberMaker +
                ", Виробник='" + maker + '\'' +
                ", Прізвище='" + sernameMaker + '\'' +
                ", Ім'я='" + nameMaker + '\'' +
                
                ", По-батькові='" + fMaker + '\'' +
                ", Місто='" + cityMaker + '\'' +
                
                ", Індекс=" + cityIndex +
                ", Кількість=" + count +
                '}';
    }
}

