

import java.util.Random;

    public class ServerNameGenerator {

        private static final String[] adjectives = {"dedicated", "fearless", "dynamic", "mystical", "gracious", "elegant", "mighty", "noble", "passionate", "sunny"};
        private static final String[] nouns = {"photon", "matrix", "relic", "nebula", "quasar", "galaxy", "comet", "cosmos", "orbit", "cluster"};

        private static Random random = new Random();

        public static String getRandomElement(String[] arr) {
            int index = random.nextInt(arr.length);
            return arr[index];
        }

        public static void main(String[] args) {
            String adjective = getRandomElement(adjectives);
            String noun = getRandomElement(nouns);
            String serverName = adjective + "-" + noun;
            System.out.println("Here is your server name: " + serverName);
        }
    }


