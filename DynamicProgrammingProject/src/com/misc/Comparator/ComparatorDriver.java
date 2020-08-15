package com.misc.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDriver {
    public static void main(String[] args) {
        List<News> newsList = getNewsList();

        Comparator<News> newsComparator = Comparator.comparing(News::getCatId,(n1,n2) ->{
            if(n1 == 0){
                return 1;
            }
            if(n2 == 0){
                return -1;
            }
            return n1.compareTo(n2);
        } ).thenComparing(Comparator.comparingInt(News::getNewsId).reversed());

        Collections.sort(newsList,newsComparator);
        for(News news : newsList){
            System.out.println(news);
        }

    }

    private static List<News> getNewsList() {

        List<News> newsList = new ArrayList<>();

        News news1 = new News();
        news1.setNewsId(1);
        news1.setCatId(1);
        news1.setNews("PM Modi");
        newsList.add(news1);

        News news2 = new News();
        news2.setNewsId(2);
        news2.setCatId(0);
        news2.setNews("Rajasthan");
        newsList.add(news2);

        News news3 = new News();
        news3.setNewsId(3);
        news3.setCatId(2);
        news3.setNews("India's tally");
        newsList.add(news3);

        News news4 = new News();
        news4.setNewsId(4);
        news4.setCatId(3);
        news4.setNews("Hundreads of chinese");
        newsList.add(news4);

        News news5 = new News();
        news5.setNewsId(5);
        news5.setCatId(3);
        news5.setNews("86% of total active");
        newsList.add(news5);

        News news6 = new News();
        news6.setNewsId(6);
        news6.setCatId(2);
        news6.setNews("LAC first");
        newsList.add(news6);

        News news7 = new News();
        news7.setNewsId(7);
        news7.setCatId(1);
        news7.setNews("Meeting between india");
        newsList.add(news7);

        News news8 = new News();
        news8.setNewsId(8);
        news8.setCatId(0);
        news8.setNews("Has Russia");
        newsList.add(news8);

        News news9 = new News();
        news9.setNewsId(9);
        news9.setCatId(5);
        news9.setNews("When Deepika Padukone");
        newsList.add(news9);

        News news10 = new News();
        news10.setNewsId(10);
        news10.setCatId(4);
        news10.setNews("How Immunity Developed");
        newsList.add(news10);

        return newsList;
    }
}
