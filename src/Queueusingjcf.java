import java.util.*;
public class Queueusingjcf {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        //here we use linkedlist because Queue is interface and we can,t implement interface
        Queue<Integer> qu=new ArrayDeque<>();
    }
}
// Efficient queue where
// push(add) ----> o(1)
// pop(remove) ----> o(1)
// peek ----> o(1)