interface Document{
    void open();
}
class WordDocument implements Document
{
    public void open()
    {
          System.out.println("WOrd Document is Opened");
    }
    
}
class PDFDocument implements Document
{
    public void open()
    {
        System.out.println("PDF Document is Opened");
    }
    
}
class ExcelDocument implements Document
{
    public void open()
    {
       System.out.println("Excel Document is Opened");
    }
   
}
abstract class DocumentFactory
{
   public abstract Document createDocument();
}

class WordFactory extends DocumentFactory 
{
     public Document createDocument() 
     {
        return new WordDocument();
    }
}

class PDFFactory extends DocumentFactory
{
   public Document createDocument() 
   {
        return new PDFDocument();
    }
}
class ExcelFactory extends DocumentFactory
{
   public Document createDocument() 
   {
        return new ExcelDocument();
    }
}
public class FactoryMethodPatternExample
 {
    public static void main(String[] args) {

        DocumentFactory wordFactory = new WordFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocumentFactory pdfFactory = new PDFFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory excelFactory = new ExcelFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}
