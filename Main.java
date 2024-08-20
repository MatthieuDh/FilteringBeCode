public class Main {
    public static void main(String[] args) {
        Filter dataFilter = new Filter();
        dataFilter.splitData();
        for (String line : dataFilter.getFilteredLines()){
            System.out.println(line);
        }

    }
}