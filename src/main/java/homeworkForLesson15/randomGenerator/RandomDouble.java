package homeworkForLesson15.randomGenerator;

public class RandomDouble extends AbstractRandomGenerator<Double>{
    @Override
    public Double getNextRand(){
        return random.nextDouble();
    }
}
