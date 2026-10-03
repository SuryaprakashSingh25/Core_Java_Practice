package PractiseSet.Map.Search;

public class SearchMain {
    public static void main(String[] args) {

        SearchHistory history = new SearchHistory(5);

        history.add("Java");
        history.add("Spring");
        history.add("Kafka");
        history.add("Docker");
        history.add("AWS");

        System.out.println(history.getHistory());

        history.add("Java");

        System.out.println(history.getHistory());

        history.add("MongoDB");

        System.out.println(history.getHistory());

        history.add("Spring");

        System.out.println(history.getHistory());

        history.add("Kubernetes");

        System.out.println(history.getHistory());
    }
}
