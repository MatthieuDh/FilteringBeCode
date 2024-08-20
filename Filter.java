import java.util.ArrayList;

public class Filter {
    private TradeData data;
    private ArrayList<String> filteredLines;

    public Filter(){
        this.data = new TradeData();
        this.data.readLine();
        this.filteredLines = new ArrayList<>();
    }

    public void splitData(){
        for (String line : data.getLines()){
            String[] parts = line.split(",");

            if (parts[1].equals("2016") && parts[4].equalsIgnoreCase("all")){
                StringBuilder newLineBuilder = new StringBuilder();
                for (int i = 0; i < parts.length; i++){
                    newLineBuilder.append(parts[i]);

                    if (i < parts.length - 1){
                        newLineBuilder.append(",");
                    }
                }
                filteredLines.add(newLineBuilder.toString());
            }
        }

    }

    public ArrayList<String> getFilteredLines() {
        return filteredLines;
    }
}
