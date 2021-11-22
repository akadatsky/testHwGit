package com.akadatsky;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000000; i++) {
            String ticket = String.format("%06d", i);
            int[] arr = new int[6];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Character.getNumericValue(ticket.charAt(j));
            }
            if ((arr[0] + arr[1] + arr[2]) == (arr[3] + arr[4] + arr[5])) {
                count++;
            }
        }
        System.out.println(count);
    }

}
