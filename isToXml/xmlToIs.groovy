import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

try {
System.setProperty("javax.xml.transform.TransformerFactory", "org.apache.xalan.processor.TransformerFactoryImpl");
xStream = new XStream(new DomDriver());
xStream.setMode(XStream.XPATH_ABSOLUTE_REFERENCES);
soup = xStream.fromXML(new FileInputStream(args[0]))
os = new FileOutputStream(args[1]);
soup.write(os);
os.flush();

} catch (Exception e) {
println(e.getMessage());
e.printStackTrace();
}


