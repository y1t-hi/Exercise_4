import java.util.*;


public class Main {
    public static void main(String[] args) {
        Map<String, Double> myMap1 = new HashMap<>();
        ArrayList<String> cities = new ArrayList<>();
        Scanner input = new Scanner(System.in);


        System.out.println("We in the city of.");
        String city = input.nextLine();
        while(!(city.equals("Exit"))){
            cities.add(city);
            System.out.println("New city. If there isnt a new city type 'Exit' to exit");
            city= input.nextLine();
        }


        for(int i=0; i< cities.size(); i++){
            System.out.println("temp for the next 5 days "+cities.get(i)+("."));

            double temp1 = input.nextDouble();
            double temp2 = input.nextDouble();
            double temp3 = input.nextDouble();
            double temp4 = input.nextDouble();
            double temp5 = input.nextDouble();
            double temps = ((temp1 + temp2 + temp3 + temp4 + temp5) / 5);

            myMap1.put(cities.get(i), temps);
        }
        System.out.println(myMap1);

    }
}