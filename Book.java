//import java.util.Scanner;
public class Book
{
	private String title;
	private String author;
	private String ISBN;
	private int yearPublished;
	private double price;

	public Book (String t, String a, String i, int y, double p)
	{
		title=t;
		author=a;
		ISBN=i;
		yearPublished=y;
		price=p;
	}

	public void setTitle (String setT){
		title=setT;}

	public void setAuthor (String setA){
		author=setA;}

	public void setISBN (String setI){
		ISBN=setI;}

	public void setYearPublished (int setY){
		yearPublished=setY;

	public void setPrice (double setP){
		price=setP;}

	public String getTitle(){
		return title;}

	public String getAuthor(){
		return author;}

	public String getISBN(){
		return ISBN;}

	public int getYearPublished(){
		return yearPublished;}

	public double getPrice(){
		return price;}

}

