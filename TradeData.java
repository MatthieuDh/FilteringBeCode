import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TradeData {
    private ArrayList<String> lines;

    public TradeData(){
        this.lines = new ArrayList<>();
    }

    public void readLine(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("effects-of-covid-19-on-trade-at-21-july-2021-provisional.csv"));
            reader.readLine();

            String line;
            while ((line = reader.readLine()) != null ){
                lines.add(line);


            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public ArrayList<String> getLines() {
        return lines;
    }
}
