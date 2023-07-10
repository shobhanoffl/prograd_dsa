/*
You are building a library data management app. You are supposed to create three entities: library item, book, and magazine.
The library item should have the following attributes:
id (integer)
title (string)
year (integer)
 book  should inherit from the library item class and have an additional attribute:
author (string)
magazine should also inherit from the library item class and have an additional attribute:
issue (integer)
Create a java code for the above requirements and demonstrate its functionalities.
*/

package solvedprobs;

class libraryItem{
    private int id;

    public void setId(int newId){
        id=newId;
    }
    public int getId(){
        return id;
    }

    String title;
    int year;
}

class book extends libraryItem {
    String author;

    public void GetInfo(){
        System.out.println("Title\tYear\tAuthor");
        System.out.println(title+"\t"+year+"\t"+author);
    }
}

class magazine extends libraryItem{
    int issue;

    public void GetInfo(){
        System.out.println("Title\t\tYear\tIssue");
        System.out.println(title+"\t"+year+"\t"+issue);
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        // Book
        book newComic = new book();
        newComic.setId(12);
        newComic.author="Alan Moore";
        newComic.title="Batman";
        newComic.year=1988;
        System.out.println("ID : "+newComic.getId());
        newComic.GetInfo();

        // Magazine
        magazine newIndian = new magazine();
        newIndian.setId(25);
        newIndian.title="Times Now";
        newIndian.issue=2;
        newIndian.year=2023;
        System.out.println("ID : "+newIndian.getId());
        newIndian.GetInfo();
    }


}
