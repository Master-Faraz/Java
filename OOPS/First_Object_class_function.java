import javax.sound.sampled.SourceDataLine;

public class First_Object_class_function {
    public static void main(String[] args) {
        remote r1 = new remote();
        r1.company = "Sony";
        r1.licence_number = 12568;

        remote r2 = new remote();
        r2.company = "hp";
        r2.licence_number = 8855566;

        System.out.println(r1.company + " --> " + r1.licence_number);
        System.out.println(r2.company + " --> " + r2.licence_number);

        r1.mode_Button();
        r2.temp_Button();

    }

}

class remote {
    String company;
    int licence_number;

    void temp_Button() {
        System.out.println(company + " remote also controls temprature");
    }

    void mode_Button() {
        System.out.println(company + " remote with licence number : "+licence_number+" also controls temprature");

    }

}
