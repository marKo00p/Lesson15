package homeworkForLesson15.randomGenerator;

public class RandomInteger extends AbstractRandomGenerator<Integer>{
    @Override
    public Integer getNextRand() {
        return random.nextInt();
    }
}
