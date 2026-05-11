package xavier.maratonajava.javacore.ZZEstreams.test;

import xavier.maratonajava.javacore.ZZEstreams.domain.Category;
import xavier.maratonajava.javacore.ZZEstreams.domain.LightNovel;
import xavier.maratonajava.javacore.ZZEstreams.domain.Promotion;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("DBZ", 4.99, Category.FANTASY),
            new LightNovel("AOT", 3.99, Category.FANTASY),
            new LightNovel("BOB", 2.99, Category.ROMANCE),
            new LightNovel("Young Titans", 7.00, Category.DRAMA),
            new LightNovel("Mary Juana", 12.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 9.49,  Category.DRAMA),
            new LightNovel("IMD - Evil", 1.99, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 100000000;
        sumFor(num);
        sumStremIterate(num);
        sumParallelStremIterate(num);
        sumLongStremIterate(num);
        sumParallelLongStremIterate(num);
    }

    private static void sumFor(long num) {
        System.out.println("Sum For: ");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 0; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end - init));
    }

    private static void sumStremIterate(long num) {
        System.out.println("Sum StreamIterate: ");
        long result = 0;
        long init = System.currentTimeMillis();
        result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end - init));
    }

    private static void sumParallelStremIterate(long num) {
        System.out.println("Sum ParallelStreamIterate: ");
        long result = 0;
        long init = System.currentTimeMillis();
        result = Stream.iterate(1L, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end - init));
    }

    private static void sumLongStremIterate(long num) {
        System.out.println("Sum LongStreamIterate: ");
        long result = 0;
        long init = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end - init));
    }

    private static void sumParallelLongStremIterate(long num) {
        System.out.println("Sum ParallelLongStreamIterate: ");
        long result = 0;
        long init = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end - init));
    }
}
