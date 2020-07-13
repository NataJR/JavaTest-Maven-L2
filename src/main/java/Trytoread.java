
import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.constraint.UniqueHashCode;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;


import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

ort org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.constraint.UniqueHashCode;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;


import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class Trytoread {
    public static void main(String[] args) throws IOException {
        List<Animals> animals = generateData();

        StringWriter writer = new StringWriter();
        // создаем CsvBeanWriter со стандартными настройками (кодировка, переносы строк, разделители и т.д.)
        ICsvBeanWriter csvBeanWriter = new CsvBeanWriter(writer, CsvPreference.STANDARD_PREFERENCE);
        String[] header = new String[]{"chip", "name", "owner", "address"};

        // создаем заголовок
        csvBeanWriter.writeHeader(header);

        for (Animals animal  : animal) {
            csvBeanWriter.write(animal, header, getProcessors());
        }

        csvBeanWriter.close();

        System.out.println(writer.toString());
    }

    private static CellProcessor[] getProcessors() {
        return new CellProcessor[]{
                new UniqueHashCode(),
                new NotNull(),
                new Optional(),
                new Optional()
        };
    }

    private static List<Animals> generateData() {
        List<Animals> animals = new ArrayList<>();
        Animals animal1 = new Animals();
        animal1.setChip( " Cat 2345");
        animal1.setName("Bonny");
        animal1.setOwner("Oliv Van Denejn");
        animal1.setAddress(" Kanaalatraat 21");

        Animals animal2 = new Animals();
        animal2.setChip("Dog 23#34");
        animal2.setName("Lucky");
        animal2.setOwner("Philipp Greedy");
        animal2.setAddress("South Hill London");

        Animals animal3 = new Animals();
        animal3.setChip("Turtle 4567345");
        animal3.setName("Maddy");
        animal3.setOwner("Petty Beintly ");
        animal3.setAddress(" West Gandy, Denison");

        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);

        return animals;
    }

}







