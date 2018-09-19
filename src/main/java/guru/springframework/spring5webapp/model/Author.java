package guru.springframework.spring5webapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Author {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstname;
    private String lastname;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();

    public Author (){

    }

    public Author (String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Author(String firstname, String lastname, Set<Book> books){
        this.firstname = firstname;
        this.lastname = lastname;
        this.books = books;
    }




    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getFirstname(){ return  firstname; }

    public  void  setFirstname (String firstname){this.firstname = firstname; }

    public String getLastname(){ return  lastname;}

    public  void setLastname(String lastname){ this.lastname = lastname;}

    public  void setBooks(Set<Book> books){this.books = books;}

    public  Set<Book> getBooks(){ return  books;}






}
