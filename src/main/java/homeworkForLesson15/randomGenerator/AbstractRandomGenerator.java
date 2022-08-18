package homeworkForLesson15.randomGenerator;

import generics.Generator;

import java.util.Random;

public abstract class AbstractRandomGenerator<T extends Number> implements NumberGenerator<T> {
    protected Random random = new Random();
}
