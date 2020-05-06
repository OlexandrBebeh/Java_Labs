package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    final static int SIZEMATRIX = 3;
    final static Random random = new Random();

    public static void printMatrix(LinkedList<Integer> m){
        System.out.println("{");
        for(int i = 0; i < SIZEMATRIX*SIZEMATRIX; i++){
            System.out.printf("%6s",m.get(i));
            if(i%SIZEMATRIX == SIZEMATRIX-1) {
                System.out.print("\n");
            }
        }
        System.out.println("}");
    }
    public static void printListOfMatrix(LinkedList<LinkedList<Integer>> l){
        System.out.println("Matrixies:");
        for (LinkedList<Integer> integers : l) {
            printMatrix(integers);
        }
    }
    public static LinkedList<Integer> createRandomList (int n){
        LinkedList<Integer> res = new LinkedList<>();
        for(int i = 0; i<n*n;i++){
            res.add(random.nextInt()%10);
        }
        return res;
    }

    public static LinkedList<Integer> multiplyMatrix(LinkedList<Integer> m1,LinkedList<Integer> m2){
        LinkedList<Integer> res = new LinkedList<>();

        for(int i = 0; i < m1.size();i+=SIZEMATRIX){
            for (int j = 0; j < SIZEMATRIX;j++){
                int temp = 0;
                for(int m = j; m < m2.size();m += SIZEMATRIX){
                    temp+= m1.get(i)*m2.get(m);
                    i++;
                }
                i = i - SIZEMATRIX;
                res.add(temp);
            }
        }
        return res;
    }

    public static  LinkedList <LinkedList<Integer>> multiplyListOfMatrix(LinkedList <LinkedList<Integer>> l1, LinkedList <LinkedList<Integer>> l2) {
        LinkedList<LinkedList<Integer>> res = new LinkedList<>();

        Iterator<LinkedList<Integer>> iter1 = l1.iterator();
        Iterator<LinkedList<Integer>> iter2 = l2.iterator();

        while (iter1.hasNext() && iter2.hasNext()) {
            res.add(multiplyMatrix(iter1.next(), iter2.next()));
        }

        return res;
    }

    public static LinkedList<Integer> addMatrix(LinkedList<Integer> m1,LinkedList<Integer> m2){
        LinkedList<Integer> res = new LinkedList<>();

        Iterator<Integer> iter1 = m1.iterator();
        Iterator<Integer> iter2 = m2.iterator();

        while(iter1.hasNext() && iter2.hasNext()){
            res.add(iter1.next() + iter2.next());
        }

        return res;
    }

    public static  LinkedList <LinkedList<Integer>> addListOfMatrix(LinkedList <LinkedList<Integer>> l1, LinkedList <LinkedList<Integer>> l2){
        LinkedList <LinkedList<Integer>> res = new LinkedList <>();

        Iterator<LinkedList<Integer>> iter1 = l1.iterator();
        Iterator<LinkedList<Integer>> iter2 = l2.iterator();

        while(iter1.hasNext() && iter2.hasNext()){
            res.add(addMatrix(iter1.next(),iter2.next()));
        }

        return res;
    }
    public static  void main(String[] args) {
        LinkedList <LinkedList<Integer>> list1 = new LinkedList <>();
        LinkedList <LinkedList<Integer>> list2 = new LinkedList <>();

        Scanner scan = new Scanner(System.in);

        int sizeList = scan.nextInt();

        for(int i = sizeList; i > 0; i--){
            list1.add(createRandomList(SIZEMATRIX));
            list2.add(createRandomList(SIZEMATRIX));
        }
        printListOfMatrix(list1);
        printListOfMatrix(list2);

        LinkedList <LinkedList<Integer>> addedList = addListOfMatrix(list1,list2);
        LinkedList <LinkedList<Integer>> multiplyList = multiplyListOfMatrix(list1,list2);

        printListOfMatrix(addedList);
        printListOfMatrix(multiplyList);
    }
}
