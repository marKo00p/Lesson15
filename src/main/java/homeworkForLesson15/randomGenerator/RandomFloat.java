package homeworkForLesson15.randomGenerator;

public class RandomFloat extends AbstractRandomGenerator<Float>{
    @Override
    public Float getNextRand(){
        return random.nextFloat();
    }
}
