/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author ziad
 */
public class Book {

    int id,year;
    String title, author;
    static int n,m,q;
    
    public Book(int id, int year, String title, String author) {
        this.id = id;
        this.year = year;
        this.title = title;
        this.author = author;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Book> myList = new ArrayList<Book>();
        int id[] = new int[16];
        int year[] = new int[16];
        String BookName[] = {"Javascript","python","java","C programming","Rest API", "GO", "angular js", "React native","php","jquery","hibernate","Spring","Java FX","Java JSP", "Java JPA"}; 
        String AuthorName[] = {"Atique", "Rahman", "Kalam", "Rahim","Iqbal","Robin","Arnab","Anika","Mohana","Anima","Fiona","Jabed","Kayes","Ahbab","Mahir"};
        
        Random rand = new Random();
        
        for(int i =0; i<15; i++){
            n = rand.nextInt(115)+100;
            id[i] = n;
        }
        
        for(int k=0; k<15;k++){
            m = k;
        }
        
        for(int l=0; l<15;l++){
            q = rand.nextInt(2018)+2000;
            year[l] = q;
        }
        int b = 16;
        Book []ob = new Book[b];
        
        
        for(int k=0; k<15;k++){
        ob[m] = new Book(id[m], year[m], BookName[m], AuthorName[m]);
        myList.add(ob[k]);
        }
        
        Iterator it = myList.iterator();
        
        while(it.hasNext()){
            
            System.out.println("ID: "+ ob[m].id + ", Year: "+ ob[m].year + ", Title: "+ ob[m].title + ", Author: " + ob[m].author);
        
        
        /*for(int j=0; j<15; j++){
            System.out.println(id[j]);
        }*/
        }
    }
    
}
