package dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "data")
public class Portfolio {
  @Id
  @GeneratedValue
  private int id;

  @Column(name = "col1")
  private String col1;

  public String getCol1() { return col1; }
  public void setCol1(String s) { this.col1 = s; }

}