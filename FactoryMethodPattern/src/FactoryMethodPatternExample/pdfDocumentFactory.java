package FactoryMethodPatternExample;

public class pdfDocumentFactory  extends DocumentFactory{
	public Document createDocument()
	{
		return new pdfDocument();
	}

}
