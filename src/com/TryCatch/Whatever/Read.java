package com.TryCatch.Whatever;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Read {


    //1. In clasa Read, din programul vostru, creati o metoda tratat, care sa returneze un numar de la tastatura.

    public void readInt() {
        System.out.println("Give a number: ");
        boolean number=true;
        while(number){
            try{
                Scanner read = new Scanner(System.in);
                int a = read.nextInt();
                System.out.println(a);
                number = false;
            } catch (InputMismatchException exception){
                System.out.println("Invalid value, please enter a number: ");
            }
            finally {
                System.out.println("Hi");
            }
        }
    }

    //2. In clasa Read, duplicati metoda de la punctul 1, astfel incat sa aveti mai multe metode, care sa citeasca si sa returneze si alte tipuri de numere (float, int, double, long, etc)

    public void readDouble() {
        System.out.println("Give a number: ");
        boolean number=true;
        while(number){
            try{
                Scanner read = new Scanner(System.in);
                double a = read.nextDouble();
                System.out.println(a);
                number = false;
            } catch (InputMismatchException exception){
                System.out.println("Invalid value, please enter a number: ");
            }
            finally {
                System.out.println("Hi");
            }
        }
    }


    public void readFloat() {
        System.out.println("Give a number: ");
        boolean number=true;
        while(number){
            try{
                Scanner read = new Scanner(System.in);
                float a = read.nextFloat();
                System.out.println(a);
                number = false;
            } catch (InputMismatchException exception){
                System.out.println("Invalid value, please enter a number: ");
            }
            finally {
                System.out.println("Hi");
            }
        }
    }


    public void readLong() {
        System.out.println("Give a number: ");
        boolean number=true;
        while(number){
            try{
                Scanner read = new Scanner(System.in);
                long a = read.nextLong();
                System.out.println(a);
                number = false;
            } catch (InputMismatchException exception){
                System.out.println("Invalid value, please enter a number: ");
            }
            finally {
                System.out.println("Hi");
            }
        }
    }

    //3. In clasa Read, creati o metoda care sa returneze un array de numere populat de la tastatura. Metoda sa primeasca ca si parametru un numar, care reprezinta cate pozitii are.
    public void array(int length){
        int[] array = new int[length];
        for( int i=0; i < array.length; i++){
            try{
                System.out.println("Please enter an element: ");
                Scanner element = new Scanner(System.in);
                int a = element.nextInt();
                array[i]= a;
            } catch(InputMismatchException exception){
                System.out.println("Please insert a number: ");
                i--;
            }
        }
//        System.out.println();
        System.out.println("Your array is " + Arrays.toString(array));
    }

    //4.  In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura. Metoda nu v-a primii parametru lungimea. In rezolvarea ei trebuie folosit try-catch. (Hint: a se citi de la tastatura atata timp cat valoarea primita e numar, cand nu mai e numar, sa se intrerupa citirea)
//    public void list(){
//        List<Integer> liste = new ArrayList<Integer>();





}
