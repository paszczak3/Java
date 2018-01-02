package pl.javastart.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "book_details")
public class BookDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book_details")
    private Long id;
    private int amountPage;
    private String amountChapter;

    public BookDetails() {
    }

    public BookDetails(int amountPage, String amountChapter) {
        super();
        this.amountPage = amountPage;
        this.amountChapter = amountChapter;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAmountPage() {
        return amountPage;
    }

    public void setAmountPage(int amountPage) {
        this.amountPage = amountPage;
    }

    public String getAmountChapter() {
        return amountChapter;
    }

    public void setAmountChapter(String amountChapter) {
        this.amountChapter = amountChapter;
    }


    @Override
    public String toString() {
        return "BookDetails{" +
                "id=" + id +
                ", amountPage=" + amountPage +
                ", amountChapter='" + amountChapter + '\'' +
                '}';
    }
}
