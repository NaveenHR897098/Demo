package DataDriven;
import java.io.FileReader;
import com.opencsv.CSVReader;
public class GetDataCSVReader1 {
public static void main(String[] args) throws Throwable {
String filePath="./resource/csvdata.csv";
FileReader fileReader = new FileReader(filePath);
CSVReader csvReader = new CSVReader(fileReader);
String[] arr = csvReader.readNext();
for(String data: arr){
System.out.println(data);
}csvReader.close();
}
}
