package FactoryMethodPatternExample;

public class DocumentTest {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();  // Output: Opening a Word Document.

        DocumentFactory pdfFactory = new pdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();  // Output: Opening a PDF Document.

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();  // Output: Opening an Excel Document.
    }
}
