package com.fedorov.sudoku;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App
{
    public static int[] getOptions(Collection<Collection<Integer>> hints) {
        final Set<Integer> toExclude = hints.stream().flatMap(Collection::stream).collect(Collectors.toSet());
        return IntStream.range(1,10).filter( x -> !toExclude.contains(x) ).toArray();
    }

    /*
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
     */
}
