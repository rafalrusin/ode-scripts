import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

try {
//System.setProperty("javax.xml.transform.TransformerFactory", "org.apache.xalan.processor.TransformerFactoryImpl");

s = new org.apache.ode.bpel.o.Serializer(new FileInputStream(args[0]))
oprocess = s.readOProcess();

soup = new org.apache.ode.jacob.vpu.ExecutionQueueImpl(getClass().getClassLoader());
r=new org.apache.ode.bpel.engine.ReplacementMapImpl(oprocess);

i=new FileInputStream(args[1]);
//i=new ByteArrayInputStream();

soup.setReplacementMap(r);
soup.read(i)

xStream = new XStream(new DomDriver());
xStream.setMode(XStream.XPATH_ABSOLUTE_REFERENCES);

os = new FileOutputStream(args[2]);
xStream.toXML(soup, os);
os.flush();

} catch (Exception e) {
println(e.getMessage());
e.printStackTrace();
}


