//Здравствуйте Юрий Алексеевич,разбирала домашнее задание весь день, для примера и усвоения материала много копалась в инете, воть нашла вроде простой ,
// но интересный вариант, однако проблемы с supercsv хотя я в файле указала дорогу на архивы, но не знаю, что-то нетак. а зананий не хватает поймать свою ошибку
// нет даже уверенности, что я правильно в этом примере поняла устоновочные моменты с проверкой и прото считыванием

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
    public class CsvParserTest {

        public static void main(String[] args) throws IOException {

            List<Animals> animalsList = new ArrayList<>();
            ICsvBeanReader csvBeanReader = new CsvBeanReader(new FileReader("animal.csv"), CsvPreference.STANDARD_PREFERENCE);

            // указываем как будем мап
            String[] mapping = new String[]{"chip", "name", "owner", "address"};

            // получаем обработчики
            CellProcessor[] procs = getProcessors();
            Animals animals;
            // обходим весь csv файлик до конца
            while ((animals = csvBeanReader.read(Animals.class, mapping, procs)) != null) {
                animalsList.add(animals);
            }
            System.out.println(animalsList);
            csvBeanReader.close();
        }


        private static CellProcessor[] getProcessors() {
            return new CellProcessor[]{
                    new UniqueHashCode(),
                    new NotNull(),
                    new Optional(),
                    new NotNull()
            };
        }
