package homeworkForLesson15.randomGenerator;

public class RandomLong extends AbstractRandomGenerator<Long>{
    @Override
    public Long getNextRand() {
        return random.nextLong();
    }
}
