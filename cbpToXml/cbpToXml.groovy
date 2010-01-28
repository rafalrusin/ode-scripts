import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import org.apache.ode.bpel.o.Serializer;

s = new Serializer(new FileInputStream(args[0]))
v = s.readOProcess();
xs = new XStream()
xStream = new XStream(new DomDriver());
xStream.toXML(v, new FileOutputStream(args[1]));


