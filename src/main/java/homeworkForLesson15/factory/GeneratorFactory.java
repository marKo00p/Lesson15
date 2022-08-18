package homeworkForLesson15.factory;

import generics.Generator;
import homeworkForLesson15.randomGenerator.NumberGenerator;
import org.reflections.Reflections;
import org.reflections.scanners.Scanners;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class GeneratorFactory {
    private static final List<NumberGenerator<?>> generatorObject = new ArrayList<>();
    private static Random random = new Random();

    static {
        initialization();
    }

    public static void initialization(){
        Reflections ref = new Reflections("homeworkForLesson15.randomGenerator", Scanners.SubTypes);
        Class <? extends NumberGenerator>[] array = new Class[0];
        Class <? extends NumberGenerator>[] numberGeneratorClasses = ref.getSubTypesOf(NumberGenerator.class).toArray(array);
        for(Class<? extends NumberGenerator> ngs : numberGeneratorClasses){
            if(Modifier.isAbstract(ngs.getModifiers())){
                continue;
            }
            try {
                generatorObject.add(ngs.getDeclaredConstructor().newInstance());
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static <T extends Number> NumberGenerator<T> getGenerator() {
            return  (NumberGenerator<T>) generatorObject.get(random.nextInt(generatorObject.size()));
    }

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            NumberGenerator<Number> ngn = getGenerator();
            System.out.println(ngn.getClass().getName());
            System.out.println(ngn.getNextRand());
        }
    }
    }


