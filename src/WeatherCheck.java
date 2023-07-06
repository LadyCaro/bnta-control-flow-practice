public class WeatherCheck {
    public static void main(String[] args) {

        int temperature = 19;
        boolean currentlyRaining = true;

    if(!currentlyRaining && temperature >= 20){
        System.out.println("Wear sunscreen and t-shirt");
    } else if(!currentlyRaining && temperature < 20){
        System.out.println("Bring a jumper");
    } else {
        System.out.println("Bring an umbrella");
    }
    }
}
