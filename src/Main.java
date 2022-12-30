import java.util.Random;

public class Main {
    public static void main(String[] args) {
        proverka(63, 9);
        proverka(43, 65);
        proverka(17, 93);
        proverka(63, 9);
        proverka(54, 43);



        
        proverka(generateRandomAge(), 66);
    }

    public static String proverka(int age, int temperature) {
        if ((age >= 20 && age < 45) && (temperature >= -20 && age < 30)) {
            System.out.println("Можно идти гулять");
        } else if (age < 20 && temperature >= 0 && temperature < 28) {
            System.out.println("Можно идти гулять");
        } else if (age > 45 && temperature >= -10 && temperature < 25) {
            System.out.println("можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");
        }
        return age + " " + temperature;
    }

    public static int generateRandomAge() {
        int age;
        Random random = new Random();
        age = random.nextInt(0, 100);
        return age;
    }

}