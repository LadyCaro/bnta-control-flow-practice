public class WeatherCheck {
    public static void main(String[] args) {

        int temperature = 10;
        boolean currentlyRaining = false;

        if (!currentlyRaining && temperature >= 50) {
            System.out.println("Prepare to be human ice-cream (melted version ofc)");
        } else if (!currentlyRaining && temperature < 20) {
            System.out.println("Bring a jumper");
        } else if(currentlyRaining && temperature < 20) {
            System.out.println("Bring a jumper and umbrella");
        } else if (!currentlyRaining && temperature >= 20) {
            System.out.println("Wear sunscreen and t-shirt");
        } else {
        System.out.println("Bring an umbrella and wear a t-shirt");
    }
    }
}
