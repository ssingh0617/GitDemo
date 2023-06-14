import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class L115_A {
       // @Test
    public void regular()
    {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Aditya");
        names.add("Samar");
        names.add("Noni");
        names.add("Baby");
        names.add("Ahaan");
        int count=0;
        for(int i=0; i<names.size(); i++)
        {
            String name = names.get(i);
            if(name.startsWith("A")){
                System.out.println(name);
                count++;
            }
        }
        System.out.println(count);
    }

    //@Test
    public void streamsFilter()
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Aditya");
        names.add("Samar");
        names.add("Noni");
        names.add("Allu");
        names.add("Baby");
        names.add("Ahaan");

        Long cnt = names.stream().filter(s -> s.startsWith("A")).count();
        //System.out.println(cnt);

        //there is no life for intermediate op if there is no terminal op
        //terminal operation will execute only if intermediate op (filter) returns true
        //we can create stream
        //how to use filter in stream API
        long countt = Stream.of("Alana", "Don", "Chanda", "Amy", "Aadi").filter(s ->
        {
             return s.startsWith("A");
        }).count();
        System.out.println(countt);

        //print all the names of the ArrayList
        names.stream().filter(s -> s.length()>0).forEach(s -> System.out.println(s));


    }

    @Test

    public void streamMap()
    {
        //print names with length >1 in upper case
        Stream.of("Hero", "Zero", "Alpha").filter(s -> s.endsWith("o")).map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));

        //convery Arrays to list
        List<String> names = Arrays.asList("Hero", "Zero", "Alpha");

    }

}
