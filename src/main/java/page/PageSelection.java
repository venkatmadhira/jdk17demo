package page;

import java.util.ArrayList;
import java.util.List;

public class PageSelection {
    public static void main(String[] args) {
        int start = 1;
        int end = 101;
        int distance = 10;
        List<Integer> pages = paginateNumbers(start, end, distance);
        int pageNumber = 1;
        for (Integer number : pages) {
            if (pageNumber % distance == 1) {
                System.out.println("Page " + (pageNumber / distance + 1) + ":");
            }
            System.out.println(number);
            pageNumber++;
        }
    }
    public static List<Integer> paginateNumbers(int start, int end, int distance) {
        List<Integer> pages = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            pages.add(i);
        }
        return pages;
    }
}




