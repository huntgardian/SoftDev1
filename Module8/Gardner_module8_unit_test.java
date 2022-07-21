import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.TreeMap;

public class Gardner_module8_unit_test {

    //start main
    public static void main(String[] args) throws IOException {

        //setup path of readable .txt file
        Path filePath = Path.of("D:/SSC/SoftDev/Module8/macbeth.txt");

        //create the string to be read through and eliminate any potential parsing issues from the code
        String txtContent = Files.readString(filePath).replace("\n", "").replaceAll("\\p{Punct}","");

        //set up the Map
        Map<String,Integer> stringMap = new TreeMap<>();

        //create the array of strings from the text
        String stringArray[] = txtContent.split(" ");

        //create iteration over length of string array
        for(int i = 0; i < stringArray.length; i++)
        {
            //if an entry in the array already exists then add one to the counter, if not then create new entry with count at 1
            if(stringMap.containsKey(stringArray[i]))
            {
                stringMap.put(stringArray[i], stringMap.get(stringArray[i]) + 1);
            }
            else
            {
                stringMap.put(stringArray[i],1);
            }
        }

        //for each entry in the map, check the counter and if it is greater than 80, then print it out
        for(Map.Entry<String, Integer> entry: stringMap.entrySet())
        {
            if (entry.getValue() > 80)
            {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}