package com.edureka.com.edureka.collectionsdemo;

import java.util.*;

public class setDemo {
    public static void main(String[] args) {
        setDemo setDemo = new setDemo();
        Set hashSetForDemo = setDemo.createHashSet();
        Set linkedHashSetForDemo = setDemo.createLinkedHashSet();
        setDemo.printSet(hashSetForDemo);
        setDemo.printSet(linkedHashSetForDemo);
        System.out.println("Printing tree set :");
        setDemo.printSet(setDemo.createTreeSet());

    }

    private Set createHashSet(){
        HashSet<Integer> setOfIntegers = new HashSet<>();
        setOfIntegers.add(130);
        setOfIntegers.add(340);
        setOfIntegers.add(440);
        setOfIntegers.add(3401);
        setOfIntegers.add(4401);

        return setOfIntegers;
    }

    private Set createLinkedHashSet(){
        LinkedHashSet<Integer> setOfIntegers = new LinkedHashSet<>();
        setOfIntegers.add(100);
        setOfIntegers.add(300);
        setOfIntegers.add(500);
        setOfIntegers.add(3401);
        setOfIntegers.add(4401);

        return setOfIntegers;
    }

    private Set createTreeSet(){
        Set<Integer> setOfIntegers = new TreeSet<>();
        setOfIntegers.add(100);
        setOfIntegers.add(130);
        setOfIntegers.add(170);
        setOfIntegers.add(300);
        setOfIntegers.add(500);
        setOfIntegers.add(3401);
        setOfIntegers.add(4401);

        return setOfIntegers;
    }

    private void printSet(Set setToPrint){
        Iterator setIterartor = setToPrint.iterator();
        while(setIterartor.hasNext()){
            System.out.println("Value of element in a set "+setIterartor.next());


        }
    }

}
